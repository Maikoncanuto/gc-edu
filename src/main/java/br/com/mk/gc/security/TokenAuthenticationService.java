package br.com.mk.gc.security;

import br.com.mk.gc.exception.AcessoNegadoException;
import br.com.mk.gc.model.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class TokenAuthenticationService {

    // EXPIRATION_TIME = 10 dias
    static final long EXPIRATION_TIME = 860_000_000;
    static final String SECRET = "MySecret";
    static final String TOKEN_PREFIX = "Bearer";
    static final String HEADER_STRING = "Authorization";

    static void addAuthentication(HttpServletResponse response, Authentication auth) {
        final Usuario usuario = (Usuario) auth.getPrincipal();

        final Map<String, Object> mapaAutenticacao = new HashMap<>();
        mapaAutenticacao.put("id", usuario.getId());
        mapaAutenticacao.put("username", usuario.getUsername());
        mapaAutenticacao.put("name", usuario.getName());
        mapaAutenticacao.put("roles", usuario.getAuthorities());

        final String JWT = Jwts.builder()
                .setClaims(mapaAutenticacao)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();

        response.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + JWT);
    }

    static Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(HEADER_STRING);

        if (Objects.nonNull(token) && !Objects.equals(token, "null")) {
            String user = (String)Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody()
                    .get("username");

            if (Objects.nonNull(user)) {
                return new UsernamePasswordAuthenticationToken(user, null, Collections.emptyList());
            }else{
                throw new AcessoNegadoException("Acesso negado. Token JWT inválido.");
            }
        }

        return null;
    }

}
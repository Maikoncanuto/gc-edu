package br.com.mk.gc.service;

import br.com.mk.gc.model.Usuario;
import br.com.mk.gc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario findUsernameByAtivo(String username){
        return usuarioRepository.findUsuarioByUsername(username);
    }


}

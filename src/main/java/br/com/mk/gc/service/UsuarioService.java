package br.com.mk.gc.service;

import br.com.mk.gc.model.Usuario;
import br.com.mk.gc.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final IUsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(IUsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario findUsernameByAtivo(String username){
        return usuarioRepository.findUsuarioByUsername(username);
    }


}

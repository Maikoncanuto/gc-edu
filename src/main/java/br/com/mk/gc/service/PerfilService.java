package br.com.mk.gc.service;

import br.com.mk.gc.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

    final PerfilRepository perfilRepository;

    @Autowired
    public PerfilService(final PerfilRepository perfilRepository){
        this.perfilRepository = perfilRepository;
    }

}

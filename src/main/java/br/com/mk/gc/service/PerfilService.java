package br.com.mk.gc.service;

import br.com.mk.gc.repository.IPerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

    final IPerfilRepository perfilRepository;

    @Autowired
    public PerfilService(final IPerfilRepository perfilRepository){
        this.perfilRepository = perfilRepository;
    }

}

package br.com.mk.gc.service;

import br.com.mk.gc.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelefoneService {

    final TelefoneRepository telefoneRepository;

    @Autowired
    public TelefoneService(final TelefoneRepository telefoneRepository){
        this.telefoneRepository = telefoneRepository;
    }

}

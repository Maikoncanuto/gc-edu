package br.com.mk.gc.service;

import br.com.mk.gc.repository.ITelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelefoneService {

    final ITelefoneRepository telefoneRepository;

    @Autowired
    public TelefoneService(final ITelefoneRepository telefoneRepository){
        this.telefoneRepository = telefoneRepository;
    }

}

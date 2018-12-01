package br.com.mk.gc.service;

import br.com.mk.gc.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    final EnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoService(final EnderecoRepository enderecoRepository){
        this.enderecoRepository = enderecoRepository;
    }

}

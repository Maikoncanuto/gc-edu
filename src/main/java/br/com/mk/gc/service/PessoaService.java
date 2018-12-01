package br.com.mk.gc.service;

import br.com.mk.gc.repository.IPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    final IPessoaRepository pessoaRepository;

    @Autowired
    public PessoaService(final IPessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

}

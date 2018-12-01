package br.com.mk.gc.service;

import br.com.mk.gc.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaService(final PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

}

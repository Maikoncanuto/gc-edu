package br.com.mk.gc.service;

import br.com.mk.gc.repository.IDadoBancarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadoBancarioService {

    final IDadoBancarioRepository dadoBancarioRepository;

    @Autowired
    public DadoBancarioService(final IDadoBancarioRepository dadoBancarioRepository){
        this.dadoBancarioRepository = dadoBancarioRepository;
    }

}

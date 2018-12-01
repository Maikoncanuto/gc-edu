package br.com.mk.gc.service;

import br.com.mk.gc.repository.DadoBancarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadoBancarioService {

    final DadoBancarioRepository dadoBancarioRepository;

    @Autowired
    public DadoBancarioService(final DadoBancarioRepository dadoBancarioRepository){
        this.dadoBancarioRepository = dadoBancarioRepository;
    }

}

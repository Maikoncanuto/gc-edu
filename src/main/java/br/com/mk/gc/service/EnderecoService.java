package br.com.mk.gc.service;

import br.com.mk.gc.repository.IEnderecoRepository;
import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    final IEnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoService(final IEnderecoRepository enderecoRepository){
        this.enderecoRepository = enderecoRepository;
    }

}

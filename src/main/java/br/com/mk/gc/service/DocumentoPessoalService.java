package br.com.mk.gc.service;

import br.com.mk.gc.repository.DocumentoPessoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentoPessoalService {

    final DocumentoPessoalRepository documentoPessoalRepository;

    @Autowired
    public DocumentoPessoalService(DocumentoPessoalRepository documentoPessoalRepository){
        this.documentoPessoalRepository = documentoPessoalRepository;
    }
}

package br.com.mk.gc.service;

import br.com.mk.gc.repository.IDocumentoPessoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentoPessoalService {

    final IDocumentoPessoalRepository documentoPessoalRepository;

    @Autowired
    public DocumentoPessoalService(IDocumentoPessoalRepository documentoPessoalRepository){
        this.documentoPessoalRepository = documentoPessoalRepository;
    }
}

package br.com.mk.gc.service;

import br.com.mk.gc.repository.IEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    final IEmailRepository emailRepository;

    @Autowired
    public EmailService(final IEmailRepository emailRepository){
        this.emailRepository = emailRepository;
    }

}

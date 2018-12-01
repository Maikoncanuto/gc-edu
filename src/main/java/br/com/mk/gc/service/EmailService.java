package br.com.mk.gc.service;

import br.com.mk.gc.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    final EmailRepository emailRepository;

    @Autowired
    public EmailService(final EmailRepository emailRepository){
        this.emailRepository = emailRepository;
    }

}

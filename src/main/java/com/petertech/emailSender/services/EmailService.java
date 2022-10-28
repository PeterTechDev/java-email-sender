package com.petertech.emailSender.services;

import com.petertech.emailSender.models.EmailModel;
import com.petertech.emailSender.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel) {

    }
}

package com.petertech.emailSender.repositories;

import com.petertech.emailSender.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}

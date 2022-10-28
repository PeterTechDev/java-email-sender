package com.petertech.emailSender.models;

import com.ms.email.enums.StatusEmail;
import com.petertech.emailSender.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "emailBody")
    private String emailBody;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
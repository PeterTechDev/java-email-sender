package com.petertech.emailSender.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
public class EmailDto {

    @NotBlank
    private String ownerRef;

    @NotBlank
    @Email
    private String emailFrom;

    @NotBlank
    @Email
    private String emailTo;

    @NotBlank
    private String emailBody;

    @NotBlank
    private String subject;

    @NotBlank
    private LocalDateTime sendDateEmail;
}

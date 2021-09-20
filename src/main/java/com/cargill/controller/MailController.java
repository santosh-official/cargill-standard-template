package com.cargill.controller;

import com.cargill.dto.MailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping
    public String sendEmail(@RequestBody MailRequest request) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(request.getTo());
        msg.setFrom(request.getFrom());
        msg.setSubject(request.getSubject());
        msg.setText(request.getBody());
        mailSender.send(msg);
        return "email send succefully...";
    }
}

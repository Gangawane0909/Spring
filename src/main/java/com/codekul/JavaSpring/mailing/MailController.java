package com.codekul.JavaSpring.mailing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailSender mailSender;

    @PostMapping("sendMail")
    public String sendEmail(){

        String from  = "sgangawane1999@gmail.com";
        String to = "sgangawane1234@gmail.com";

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject("Hii");
        mailMessage.setText("Hello vaishnavi .......");
        mailMessage.setCc("vaishnavid832@gmail.com");
        mailSender.send(mailMessage);

        return "mail sent";
    }



}

package com.wings.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
    @Autowired
    private JavaMailSender mailSender;
    @Value("${MEMBER_SVC_PROTOCOL}")
    private String protocol;
    @Value("${MEMBER_SVC_HOST}")
    private String hostName;
    @Value("${MEMBER_SVC_PORT}")
    private String port;
    @Value("${MEMBER_SVC_APP_URL}")
    private String url;

    @Override
    public void sendResetPasswordEmail(String emailId, String resetToken) {
        SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
        passwordResetEmail.setTo(emailId);
        passwordResetEmail.setSubject("Password Reset Request");
        passwordResetEmail.setText("To reset your password, click the link below:\n"
                + protocol + "://" + hostName + port + url
                + "/password/reset?resetToken=" + resetToken);

        sendEmail(passwordResetEmail);
    }

    @Async
    private void sendEmail(SimpleMailMessage email) {
        mailSender.send(email);
    }
}

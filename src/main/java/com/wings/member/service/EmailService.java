package com.wings.member.service;

public interface EmailService {
    void sendResetPasswordEmail(String emailId, String resetToken);
}

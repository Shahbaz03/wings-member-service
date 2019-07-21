package com.wings.member.data;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Credentials {
    @Indexed(unique = true)
    private String emailId;
    private String passwordHashed;
    private String salt;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPasswordHashed() {
        return passwordHashed;
    }

    public void setPasswordHashed(String passwordHashed) {
        this.passwordHashed = passwordHashed;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Credentials(String emailId, String passwordHashed, String salt) {
        this.emailId = emailId;
        this.passwordHashed = passwordHashed;
        this.salt = salt;
    }
}

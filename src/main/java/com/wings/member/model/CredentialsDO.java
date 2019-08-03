package com.wings.member.model;

import javax.validation.constraints.NotNull;

public class CredentialsDO {
    @NotNull
    private String emailId;
    @NotNull
    private String password;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

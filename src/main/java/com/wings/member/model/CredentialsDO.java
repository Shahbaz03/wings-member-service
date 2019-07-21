package com.wings.member.model;

public class CredentialsDO {
    private String email_id;
    private String password;

    public String getEmail_id() {
        return email_id.toLowerCase();
    }

    public void setEmailId(String email_id) {
        this.email_id = email_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

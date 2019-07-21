package com.wings.member.model;

public class RegistrationDO {
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;

    public String getEmailId() {
        return emailId.toLowerCase();
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

    public String getFirstName() {
        return firstName.toLowerCase();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName.toLowerCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

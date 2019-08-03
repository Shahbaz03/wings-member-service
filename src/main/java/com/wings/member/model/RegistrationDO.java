package com.wings.member.model;

import javax.validation.constraints.NotNull;

public class RegistrationDO {
    @NotNull
    private String emailId;
    @NotNull
    private String password;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String yearOfPassing12;

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

    public String getYearOfPassing12() {
        return yearOfPassing12;
    }

    public void setYearOfPassing12(String yearOfPassing12) {
        this.yearOfPassing12 = yearOfPassing12;
    }
}

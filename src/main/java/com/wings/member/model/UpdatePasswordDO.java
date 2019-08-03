package com.wings.member.model;

import javax.validation.constraints.NotNull;

public class UpdatePasswordDO {
    @NotNull
    private String emailId;
    @NotNull
    private String oldPassword;
    @NotNull
    private String newPassword;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}

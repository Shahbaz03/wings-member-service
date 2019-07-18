package com.wings.member.model;

import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;

public class Member {
    @Id
    private String emailId;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNo;
    private String shortBio;
    private String fullBio;
    private String dOb;
    private String gender;
    private String city;
    private String country;
    private String image;
    private String occupation;
    private boolean admin;
    private String memberSince;
    private String[] communities;
    private String[] interests;
    private Education[] education;
    private SocialMedia[] socialMedia;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getShortBio() {
        return shortBio;
    }

    public void setShortBio(String shortBio) {
        this.shortBio = shortBio;
    }

    public String getFullBio() {
        return fullBio;
    }

    public void setFullBio(String fullBio) {
        this.fullBio = fullBio;
    }

    public String getdOb() {
        return dOb;
    }

    public void setdOb(String dOb) {
        this.dOb = dOb;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(String memberSince) {
        this.memberSince = memberSince;
    }

    public String[] getCommunities() {
        return communities;
    }

    public void setCommunities(String[] communities) {
        this.communities = communities;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public Education[] getEducation() {
        return education;
    }

    public void setEducation(Education[] education) {
        this.education = education;
    }

    public SocialMedia[] getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(SocialMedia[] socialMedia) {
        this.socialMedia = socialMedia;
    }
}

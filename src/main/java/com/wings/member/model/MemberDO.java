package com.wings.member.model;

import com.wings.member.data.Education;
import com.wings.member.data.SocialMedia;
import com.wings.member.data.Subscription;

import javax.validation.constraints.NotNull;

public class MemberDO {
    @NotNull
    private String _id;
    @NotNull
    private String emailId;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String phoneNo;
    private String shortBio;
    private String fullBio;
    @NotNull
    private String yearOfPassing12;
    private String dOb;
    private String gender;
    private String city;
    private String country;
    private String image;
    private String occupation;
    private boolean admin;
    private String memberSince;
    private Subscription subscription;
    private String[] communities;
    private String[] interests;
    private Education[] education;
    private SocialMedia[] socialMedia;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

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

    public String getYearOfPassing12() {
        return yearOfPassing12;
    }

    public void setYearOfPassing12(String yearOfPassing12) {
        this.yearOfPassing12 = yearOfPassing12;
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

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
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

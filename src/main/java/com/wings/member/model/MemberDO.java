package com.wings.member.model;

import com.wings.member.data.Education;
import com.wings.member.data.SocialMedia;
import com.wings.member.data.Subscription;

public class MemberDO {
    private String _id;
    private String email_id;
    private String first_name;
    private String last_name;
    private String phone_no;
    private String short_bio;
    private String full_bio;
    private String dOb;
    private String gender;
    private String city;
    private String country;
    private String image;
    private String occupation;
    private boolean admin;
    private String member_since;
    private Subscription subscription;
    private String[] communities;
    private String[] interests;
    private Education[] education;
    private SocialMedia[] social_media;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getShort_bio() {
        return short_bio;
    }

    public void setShort_bio(String short_bio) {
        this.short_bio = short_bio;
    }

    public String getFull_bio() {
        return full_bio;
    }

    public void setFull_bio(String full_bio) {
        this.full_bio = full_bio;
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

    public String getMember_since() {
        return member_since;
    }

    public void setMember_since(String member_since) {
        this.member_since = member_since;
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

    public SocialMedia[] getSocial_media() {
        return social_media;
    }

    public void setSocial_media(SocialMedia[] social_media) {
        this.social_media = social_media;
    }
}

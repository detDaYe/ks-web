package com.sehyeon.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SocialMedia {

    @Id
    @GeneratedValue
    private Long id;
    private String github;
    private String twitter;
    private String facebook;
    private String instagram;

    public SocialMedia(String github, String twitter, String facebook, String instagram) {
        this.github = github;
        this.twitter = twitter;
        this.facebook = facebook;
        this.instagram = instagram;
    }
    public SocialMedia(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
}

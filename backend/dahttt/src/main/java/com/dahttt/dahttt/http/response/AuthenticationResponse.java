package com.dahttt.dahttt.http.response;

import com.dahttt.dahttt.entity.User;

import java.util.Collection;

public class AuthenticationResponse {
    private String accessToken;
    private Collection<?> authorities;

    private User user;

    public Collection<?> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<?> authorities) {
        this.authorities = authorities;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

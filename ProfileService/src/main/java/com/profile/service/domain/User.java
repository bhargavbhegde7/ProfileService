package com.profile.service.domain;

import com.prof.domain.ProfileDomain;

public class User extends ProfileDomain{
    public User() {
    }

    public User(int profileId, String password) {
        super(profileId, password);
    }
}

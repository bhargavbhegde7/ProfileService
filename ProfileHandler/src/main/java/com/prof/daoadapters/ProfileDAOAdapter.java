package com.prof.daoadapters;

import com.prof.dao.ProfileDAO;
import com.prof.domain.ProfileDomain;
import com.prof.exception.DataAccessException;

import java.util.List;

public class ProfileDAOAdapter implements ProfileDAO{

    //dummy implementation

    public ProfileDomain addProfile(ProfileDomain profile) throws DataAccessException {
        return null;
    }

    public List<ProfileDomain> getProfiles() throws DataAccessException {
        return null;
    }

    public ProfileDomain getProfileById(int profileId) throws DataAccessException {
        return null;
    }

    public ProfileDomain updateProfile(ProfileDomain profile) throws DataAccessException {
        return null;
    }

    public boolean deleteProfile(int profileId) throws DataAccessException {
        return false;
    }
}

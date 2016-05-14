package com.prof.dao;

import com.prof.domain.ProfileDomain;
import com.prof.exception.DataAccessException;
import com.prof.exception.ServiceException;

import java.util.List;

public interface ProfileDAO {
    public ProfileDomain addProfile(ProfileDomain profile) throws DataAccessException;
    public List<ProfileDomain> getProfiles() throws DataAccessException;
    public ProfileDomain getProfileById(int profileId) throws DataAccessException;
    public ProfileDomain updateProfile(ProfileDomain profile) throws DataAccessException;
    public boolean deleteProfile(int profileId) throws DataAccessException;
}

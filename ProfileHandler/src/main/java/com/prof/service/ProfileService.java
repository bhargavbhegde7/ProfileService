package com.prof.service;

import java.util.List;

import com.prof.domain.ProfileDomain;
import com.prof.exception.ServiceException;

public interface ProfileService {
	public ProfileDomain addProfile(ProfileDomain profile) throws ServiceException;
	public List<ProfileDomain> getProfiles() throws ServiceException;
	public ProfileDomain getProfileById(int profileId) throws ServiceException;	
	public ProfileDomain updateProfile(ProfileDomain profile) throws ServiceException;
	public boolean deleteProfile(int profileId) throws ServiceException;
}

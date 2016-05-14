package com.prof.serviceadapters;

import com.prof.dao.ProfileDAO;
import com.prof.daoadapters.ProfileDAOAdapter;
import com.prof.domain.ProfileDomain;
import com.prof.exception.ServiceException;
import com.prof.service.ProfileService;

import java.util.List;

public class ProfileDomainAdapter implements ProfileService{

    private ProfileDAO profileDAO = new ProfileDAOAdapter();

    public ProfileDomain addProfile(ProfileDomain profile) throws ServiceException {
        try{
            return profileDAO.addProfile(profile);
        }catch (Exception e){
            throw new ServiceException("From ProfileDomainAdapter : addProfile() : "+e.getMessage());
        }
    }

    public List<ProfileDomain> getProfiles() throws ServiceException {
        try{
            return profileDAO.getProfiles();
        }catch(Exception e){
            throw new ServiceException("From ProfileDomainAdapter : getProfiles() : "+e.getMessage());
        }
    }

    public ProfileDomain getProfileById(int profileId) throws ServiceException {
        try{
            return profileDAO.getProfileById(profileId);
        }catch (Exception e){
            throw new ServiceException("From ProfileDomainAdapter : getProfileById() : "+e.getMessage());
        }
    }

    public ProfileDomain updateProfile(ProfileDomain profile) throws ServiceException {
        try{
            return profileDAO.updateProfile(profile);
        }catch (Exception e){
            throw new ServiceException("From ProfileDomainAdapter : updateProfile() : "+e.getMessage());
        }
    }

    public boolean deleteProfile(int profileId) throws ServiceException {
        try{
            return profileDAO.deleteProfile(profileId);
        }catch (Exception e){
            throw new ServiceException("From ProfileDomainAdapter : deleteProfile() : "+e.getMessage());
        }
    }
}

package com.profile.service.serviceadapters;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.profile.service.dao.OrgDAO;
import com.profile.service.domain.Organization;
import com.profile.service.services.OrgService;

@Component("orgService")
public class OrgAdapter implements OrgService{

	private @Autowired OrgDAO orgDAO;
	
	public List<Organization> getOrgs() throws Exception {
		try{
			return orgDAO.getOrgs();
		}catch(Exception e){
			throw new Exception("From OrgAdapter : getOrgs() : "+e.getMessage());
		}
	}

	public Map<Integer, String> getOrgIdPwdMap() throws Exception {
		try{
			Map<Integer, String> orgIdPwdMap = new HashMap<Integer,String>();
			for(int i = 0;i<10;i++){
				orgIdPwdMap.put(i,"org_pwd_"+i);
			}
		return orgIdPwdMap;
		}catch(Exception e){
			throw new Exception("From OrgAdapter : getOrgIdPwdMap() : "+e.getMessage());
		}
	}

	public Organization addOrg(Organization organization) throws Exception {
		try{
			return orgDAO.addOrg(organization);
		}catch(Exception e){
			throw new Exception("From OrgAdapter : addOrg() : "+e.getMessage());
		}
	}

	public Organization getOrgByID(int orgId) throws Exception {
		try{
			return orgDAO.getOrgByID(orgId);
		}catch(Exception e){
			throw new Exception("From OrgAdapter : addOrg() : "+e.getMessage());
		}
	}

}

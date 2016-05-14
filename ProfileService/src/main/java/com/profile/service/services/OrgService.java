package com.profile.service.services;

import java.util.List;
import java.util.Map;

import com.profile.service.domain.Organization;

public interface OrgService {
	public List<Organization> getOrgs() throws Exception;
	public Organization getOrgByID(int orgId) throws Exception;
	public Organization addOrg(Organization organization) throws Exception;
	public Map<Integer,String> getOrgIdPwdMap() throws Exception;
}

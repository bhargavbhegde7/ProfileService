package com.profile.service.dao;

import java.util.List;

import com.profile.service.domain.Organization;

public interface OrgDAO {
	public List<Organization> getOrgs() throws Exception;
	public Organization getOrgByID(int orgId) throws Exception;
	public Organization addOrg(Organization organization) throws Exception;
}

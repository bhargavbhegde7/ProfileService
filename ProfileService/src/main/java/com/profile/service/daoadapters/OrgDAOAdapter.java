package com.profile.service.daoadapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.profile.service.dao.OrgDAO;
import com.profile.service.domain.Organization;

@Component("orgDAO")
public class OrgDAOAdapter implements OrgDAO{
	
	@Autowired MongoTemplate mongoTemplate;

	public List<Organization> getOrgs() throws Exception{
		
		try{
			return mongoTemplate.findAll(Organization.class);
		}catch(Exception e){
			throw new Exception("From OrgDAOAdapter : getOrgs() : "+e.getMessage());
		}
	}

	public Organization addOrg(Organization organization) throws Exception {
		try{
			//System.out.println(organization.getId()+" : "+organization.getName());
			mongoTemplate.save(organization);
			return organization;
		}catch(Exception e){
			throw new Exception("From OrgDAOAdapter : addOrg() : "+e.getMessage());
		}
	}
	
	public Organization getOrgByID(int orgId) throws Exception{
		try{
			orgId = 22;
			Query searchUserQuery = new Query(Criteria.where("id").is(orgId));
			Organization foundOrg = mongoTemplate.findOne(searchUserQuery, Organization.class);
			return foundOrg;
		}catch(Exception e){
			throw new Exception("From OrgDAOAdapter : getOrgByID() : "+e.getMessage());
		}
	}
}

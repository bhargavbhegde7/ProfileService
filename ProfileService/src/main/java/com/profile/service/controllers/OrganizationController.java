package com.profile.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.profile.service.domain.Organization;
import com.profile.service.services.OrgService;

@Controller
public class OrganizationController {
	
	private @Autowired OrgService orgService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public @ResponseBody Organization testController() throws Exception{
		return orgService.getOrgByID(22);
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getHomePage(@RequestParam(value="added_org", required=false) String added_org) throws Exception {
		try{
			ModelAndView mnv = new ModelAndView("index");
			List<Organization> orgs = orgService.getOrgs();
			mnv.addObject("added_org",added_org);
			mnv.addObject("orgs",orgs);
			return mnv;
		}catch(Exception e){
			throw new Exception("From OrganizationController : getHomePage() : "+e.getMessage());
		}
	}
	
	@RequestMapping(value="/add-org",method=RequestMethod.POST)
	public ModelAndView addOrganization(@Validated @ModelAttribute("organization")Organization organization) throws Exception{
		try{
			Organization org = orgService.addOrg(organization);
			ModelAndView mnv = new ModelAndView("redirect:/?added_org="+org.getName());
			return mnv;
		}catch(Exception e){
			throw new Exception("From OrganizationController : addOrganization() : "+e.getMessage());
		}
	}
}

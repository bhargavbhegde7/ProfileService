package com.profile.service.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.profile.service.domain.Organization;
import com.profile.service.services.OrgService;

@Controller
public class AuthController {
	
	private @Autowired OrgService orgService;
	
	private String getEncrypted(String data){
		// to do : run some encryption algorithm here 
		return data;
	}
	
	@RequestMapping(value="/check-org",method=RequestMethod.POST)
	public ModelAndView checkOrganization(@Validated @ModelAttribute("organization")Organization organization,
			HttpServletRequest request) throws Exception{
		try{
			ModelAndView mnv;
			Map<Integer, String> orgIdPwdMap = orgService.getOrgIdPwdMap();
			if(orgIdPwdMap.containsKey(organization.getId())){
				String passwordFromDb = orgIdPwdMap.get(organization.getId());// to do : encrypt this password
				if(getEncrypted(request.getParameter("password")).equals(passwordFromDb)){
					mnv = new ModelAndView("home");
					mnv.addObject("auth_msg","success");
					return mnv;
				}
			}		
			mnv = new ModelAndView("index");
			mnv.addObject("orgs",orgService.getOrgs());
			mnv.addObject("auth_msg","failure");
			return mnv;
		}catch(Exception e){
			throw new Exception("From AuthController : checkOrganization() : "+e.getMessage());
		}
	}
}

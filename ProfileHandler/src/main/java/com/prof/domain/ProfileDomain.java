package com.prof.domain;

public class ProfileDomain {
	
	private int profileId;
	private String password;

	public ProfileDomain(){

	}

	public ProfileDomain(int profileId, String password){
		this.profileId = profileId;
		this.password = password;
	}
	
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}

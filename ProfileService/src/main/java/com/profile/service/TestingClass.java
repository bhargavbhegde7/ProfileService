package com.profile.service;

import com.prof.domain.ProfileDomain;
import com.profile.service.domain.User;

public class TestingClass {
	public static void main(String[] args) {
		User u = new User(25,"asdfg");
		System.out.println(u.getPassword());
	}
}

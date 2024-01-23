package com.project.service;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.entity.UserInfo;
import com.project.repository.UserInfoRepository;

public class UserInfoService {
	
	@Autowired
	private UserInfoRepository infoRepository;
	
	
	public UserInfo login(UserInfo user) {
		UserInfo info = infoRepository.findByUemailAndUpass(user.getUemail(), user.getUpass());
		if(info==null)
			throw new RuntimeException("login failed");
		return info;
	}
}

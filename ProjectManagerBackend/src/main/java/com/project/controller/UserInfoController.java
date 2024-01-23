package com.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.UserInfo;
import com.project.service.UserInfoService;

@RestController
@RequestMapping("/login")
@CrossOrigin("*")
public class UserInfoController {

	private UserInfoService userInfoService;
	
	public ResponseEntity<UserInfo> login(@RequestBody UserInfo info) {
		return new ResponseEntity<>(userInfoService.login(info),HttpStatus.ACCEPTED);
	}
	
}

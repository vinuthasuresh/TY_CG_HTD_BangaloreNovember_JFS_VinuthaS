package com.cg.appdevelopment.controller;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.appdevelopment.dto.UserInfo;
import com.cg.appdevelopment.dto.UserInfoResponse;
import com.cg.appdevelopment.service.UserInfoService;

@RestController
public class UserInfoController {

	@Autowired
	UserInfoService service;

	@PostMapping(path = "/createprofile", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse register(@RequestBody UserInfo info) {
		UserInfoResponse response = new UserInfoResponse();
		service.register(info);
		response.setStatusCode(201);
		response.setDiscription("Success");
		response.setMessage("Account created");
		return response;
	}

	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse login(@RequestBody UserInfo user) {
		UserInfoResponse response = new UserInfoResponse();
		UserInfo account = service.login(user);
		if (account != null) {
			response.setStatusCode(201);
			response.setDiscription("Success");
			response.setMessage("Logged in");
			response.setUser(Arrays.asList(account));
		} else {
			response.setStatusCode(405);
			response.setDiscription("Failure");
			response.setMessage("Provide valid credentials");
		}
		return response;
	}

	@PutMapping(path="/change-password",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes= MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse changePassword(@RequestBody UserInfo info) {

		UserInfoResponse response=new UserInfoResponse();
		if(service.changePassword(info.getId(), info.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDiscription("password changed");


		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDiscription("password cannot changed");
		}
		return response;
	}
}

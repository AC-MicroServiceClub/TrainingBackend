package com.msclub.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msclub.user.model.LoginRequest;
import com.msclub.user.model.LoginResponse;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping("/login")
	public LoginResponse login(@RequestBody LoginRequest loginRequest) {
		LoginResponse response = new LoginResponse();
		response.setUsername(loginRequest.getUsername());
		response.setToken(loginRequest.getUsername() + "tocken");
		response.setStatus(true);
		response.setException(null);
		return response;
	}

}

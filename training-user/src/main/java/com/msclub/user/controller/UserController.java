package com.msclub.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msclub.training.web.stater.model.CommonResponse;
import com.msclub.training.web.stater.util.RestClientUtil;
import com.msclub.user.model.LoginRequest;
import com.msclub.user.model.LoginResponse;
import com.msclub.user.model.TokenRequest;
import com.msclub.user.model.TokenResponse;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private RestClientUtil restClientUtil;

	@PostMapping("/login")
	public CommonResponse login(@RequestBody LoginRequest loginRequest) throws Exception {
		LoginResponse response = new LoginResponse();
		response.setUsername(loginRequest.getUsername());
		response.setToken(loginRequest.getUsername() + "token");
		response.setStatus(true);
		response.setException(null);
		return restClientUtil.buildSuccessCommonResponse(response);
	}

	@PostMapping("/token")
	public CommonResponse token(@RequestBody TokenRequest tokenRequest) throws Exception {
		TokenResponse response = new TokenResponse();
		response.setUserid("1");
		response.setUsername(tokenRequest.getToken().replace("token", ""));
		return restClientUtil.buildSuccessCommonResponse(response);
	}

}

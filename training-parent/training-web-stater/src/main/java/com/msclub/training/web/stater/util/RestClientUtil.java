package com.msclub.training.web.stater.util;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.msclub.training.web.stater.model.CommonResponse;

@Component
public class RestClientUtil {

	@Autowired
	private ObjectMapper objectMapper;

	public <T> T convertResponseToObject(CommonResponse response, Class<T> t)
			throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(response.getResponse(), t);
	}

	public CommonResponse buildSuccessCommonResponse(Object obj) throws JsonProcessingException {
		CommonResponse response = new CommonResponse();
		response.setStatus(true);
		response.setResponse(objectMapper.writeValueAsString(obj));
		return response;
	}
	
	public String buildSuccessCommonResponseToString(Object obj) throws JsonProcessingException {
		CommonResponse response = new CommonResponse();
		response.setStatus(true);
		response.setResponse(objectMapper.writeValueAsString(obj));
		return objectMapper.writeValueAsString(response);
	}

	public CommonResponse buildFailedCommonResponse(String errorDesc) {
		CommonResponse response = new CommonResponse();
		response.setStatus(false);
		response.setError(errorDesc);
		return response;
	}
	
	public String buildFailedCommonResponseToString(String errorDesc) throws JsonProcessingException {
		CommonResponse response = new CommonResponse();
		response.setStatus(false);
		response.setError(errorDesc);
		return objectMapper.writeValueAsString(response);
	}
}

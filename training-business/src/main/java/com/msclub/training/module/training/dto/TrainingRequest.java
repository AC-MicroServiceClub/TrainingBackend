package com.msclub.training.module.training.dto;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TrainingRequest {

	private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public static void main(String[] args) throws JsonProcessingException {
		TrainingRequest test = new TrainingRequest();
		test.setIds(Arrays.asList(new Integer[] { 1 }));
		System.out.println(new ObjectMapper().writeValueAsString(test));
	}
}

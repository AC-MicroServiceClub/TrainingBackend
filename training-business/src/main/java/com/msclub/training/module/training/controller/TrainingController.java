package com.msclub.training.module.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msclub.training.module.training.dto.Training;
import com.msclub.training.module.training.dto.TrainingDetailRequest;
import com.msclub.training.module.training.dto.TrainingDetailResponse;
import com.msclub.training.module.training.service.TrainingService;

@RestController
@RequestMapping("/training")
public class TrainingController {

	@Autowired
	private TrainingService trainingService;

	@PostMapping("/detail")
	public TrainingDetailResponse getTrainingDetail(@RequestBody TrainingDetailRequest request) {
		Training training = trainingService.getTrainingById(request.getId());
		TrainingDetailResponse response = new TrainingDetailResponse();
		response.setId(training.getId());
		response.setTrainingPlanId(training.getTrainingPlanId());
		response.setTrainingStateInd(training.getTrainingStateInd());
		response.setTrainingTitle(training.getTrainingTitle());
		response.setTrainingStartTime(training.getTrainingStartTime());
		response.setTrainingEndTime(training.getTrainingEndTime());
		response.setTrainingDuration(training.getTrainingDuration());
		response.setTrainingLocation(training.getTrainingLocation());
		response.setTrainingDescription(training.getTrainingDescription());
		response.setTrainer(training.getTrainer());
		response.setCreator(training.getCreator());
		response.setCreateDate(training.getCreateDate());
		response.setUpdatedById(training.getUpdatedById());
		response.setUpdatedBy(training.getUpdatedBy());
		response.setLastUpdateDate(training.getLastUpdateDate());
		response.setDeletedInd(training.getDeletedInd());
		response.setDeletedBy(training.getDeletedBy());
		response.setDeletedById(training.getDeletedById());
		return response;
	}

}

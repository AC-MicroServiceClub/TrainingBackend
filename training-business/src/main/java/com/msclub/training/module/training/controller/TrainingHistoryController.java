package com.msclub.training.module.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msclub.training.module.training.dto.TrainingHistory;
import com.msclub.training.module.training.dto.TrainingHistoryDetail;
import com.msclub.training.module.training.dto.TrainingHistoryRequest;
import com.msclub.training.module.training.dto.TrainingHistoryResponse;
import com.msclub.training.module.training.service.TrainingHistoryService;

@RestController
@RequestMapping("/training")
public class TrainingHistoryController {

	@Autowired
	private TrainingHistoryService trainingHistoryService;

	@PostMapping("/history")
	public TrainingHistoryResponse getTrainingHistorys(@RequestBody TrainingHistoryRequest request) {
		List<TrainingHistory> trainingHistorys = trainingHistoryService
				.getTrainingHistorysByTraineeId(String.valueOf(request.getTraineeId()));
		TrainingHistoryResponse response = new TrainingHistoryResponse();
		List<TrainingHistoryDetail> trainingHistoryDetails = new ArrayList<TrainingHistoryDetail>();
		for (TrainingHistory trainingHistory : trainingHistorys) {
			TrainingHistoryDetail trainingHistoryDetail = new TrainingHistoryDetail();
			trainingHistoryDetail.setId(trainingHistory.getId());
			trainingHistoryDetail.setTrainingId(trainingHistory.getTrainingId());
			trainingHistoryDetail.setTrainingStateInd(trainingHistory.getTrainingStateInd());
			trainingHistoryDetail.setTrainingTitle(trainingHistory.getTrainingTitle());
			trainingHistoryDetail.setTrainer(trainingHistory.getTrainer());
			trainingHistoryDetail.setTrainingStartTime(trainingHistory.getTrainingStartTime());
			trainingHistoryDetail.setTrainingEndTime(trainingHistory.getTrainingEndTime());
			trainingHistoryDetail.setDuration(trainingHistory.getDuration());
			trainingHistoryDetail.setLocation(trainingHistory.getLocation());
			trainingHistoryDetail.setTraineeId(trainingHistory.getTraineeId());
			trainingHistoryDetail.setTraineeStateInd(trainingHistory.getTraineeStateInd());
			trainingHistoryDetail.setCreatorId(trainingHistory.getCreatorId());
			trainingHistoryDetail.setCreator(trainingHistory.getCreator());
			trainingHistoryDetail.setDeletedBy(trainingHistory.getDeletedBy());
			trainingHistoryDetail.setDeletedById(trainingHistory.getDeletedById());
			trainingHistoryDetail.setDeletedInd(trainingHistory.getDeletedInd());
			trainingHistoryDetail.setUpdatedBy(trainingHistory.getUpdatedBy());
			trainingHistoryDetail.setUpdatedById(trainingHistory.getUpdatedById());
			trainingHistoryDetail.setLastUpdateDate(trainingHistory.getLastUpdateDate());
			trainingHistoryDetails.add(trainingHistoryDetail);
		}
		response.setTrainingHistoryDetails(trainingHistoryDetails);
		return response;
	}
}

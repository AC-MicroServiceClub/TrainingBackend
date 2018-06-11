package com.msclub.training.module.training.service;

import java.util.List;

import com.msclub.training.module.training.dto.TrainingHistory;

public interface TrainingHistoryService {

	public List<TrainingHistory> getTrainingHistorysByTraineeId(String traineeId);
	
}

package com.msclub.training.service;

import java.util.List;

import com.msclub.training.dto.TrainingHistory;

public interface TrainingHistoryService {

	public List<TrainingHistory> getTrainingHistorysByTraineeId(String traineeId);
	
}

package com.msclub.training.domain;

import java.util.List;

import com.msclub.training.dto.TrainingHistory;

public interface TrainingHistoryDomain {

	public List<TrainingHistory> getTrainingsByTraineeId(String traineeId) ;
	
}

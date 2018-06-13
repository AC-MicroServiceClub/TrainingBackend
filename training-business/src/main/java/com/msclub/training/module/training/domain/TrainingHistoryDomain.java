package com.msclub.training.module.training.domain;

import java.util.List;

import com.msclub.training.module.training.dto.TrainingHistory;

public interface TrainingHistoryDomain {

	public List<TrainingHistory> getTrainingsByTraineeId(String traineeId) ;
	
}

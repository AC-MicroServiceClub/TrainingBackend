package com.msclub.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclub.training.domain.TrainingHistoryDomain;
import com.msclub.training.dto.TrainingHistory;

@Service
public class TrainingHistoryServiceImpl implements TrainingHistoryService {

	@Autowired
	private TrainingHistoryDomain trainingHistoryDomain;

	@Override
	public List<TrainingHistory> getTrainingHistorysByTraineeId(String traineeId) {
		return trainingHistoryDomain.getTrainingsByTraineeId(traineeId);
	}

}

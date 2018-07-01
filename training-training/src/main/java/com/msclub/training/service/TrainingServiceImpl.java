package com.msclub.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclub.training.domain.TrainingDomain;
import com.msclub.training.dto.Training;

@Service
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	private TrainingDomain trainingDomain;

	@Override
	public Training getTrainingById(Integer id) {
		return trainingDomain.getTrainingById(id);
	}

}

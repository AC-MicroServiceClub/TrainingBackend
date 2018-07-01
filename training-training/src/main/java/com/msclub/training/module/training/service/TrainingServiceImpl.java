package com.msclub.training.module.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclub.training.module.training.domain.TrainingDomain;
import com.msclub.training.module.training.dto.Training;

@Service
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	private TrainingDomain trainingDomain;

	@Override
	public Training getTrainingById(Integer id) {
		return trainingDomain.getTrainingById(id);
	}

}

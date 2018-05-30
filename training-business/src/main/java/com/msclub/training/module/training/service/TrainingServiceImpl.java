package com.msclub.training.module.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclub.training.module.training.domain.TrainingDomain;
import com.msclub.training.module.training.dto.Training;

@Service
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	private TrainingDomain trainingDomain;

	@Override
	public List<Training> getTrainingListByIds(List<Integer> ids) {
		return trainingDomain.getTrainingListByIds(ids);
	}

}

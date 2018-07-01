package com.msclub.training.module.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclub.training.module.training.domain.TrainingDomain;
import com.msclub.training.module.training.dto.Training;
import com.msclub.training.module.user.domain.TrainerDomain;
import com.msclub.training.module.user.dto.Trainer;

@Service
public class TrainerServiceImpl implements TrainerService {

	@Autowired
	private TrainerDomain trainerDomain;

	@Override
	public Trainer getTrainerById(Integer id) {
		return trainerDomain.getTrainerById(id);
	}

}

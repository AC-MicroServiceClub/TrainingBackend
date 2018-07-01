package com.msclub.training.module.user.domain;

import java.util.List;

import com.msclub.training.module.training.dto.Training;
import com.msclub.training.module.user.dto.Trainer;

public interface TrainerDomain {

	public Trainer getTrainerById(Integer id);
	
}

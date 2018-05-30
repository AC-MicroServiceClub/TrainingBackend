package com.msclub.training.module.training.domain;

import java.util.List;

import com.msclub.training.module.training.dto.Training;

public interface TrainingDomain {

	public List<Training> getTrainingListByIds(List<Integer> ids);
	
}

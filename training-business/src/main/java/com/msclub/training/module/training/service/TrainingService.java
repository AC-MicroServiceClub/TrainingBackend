package com.msclub.training.module.training.service;

import java.util.List;

import com.msclub.training.module.training.dto.Training;

public interface TrainingService {

	public List<Training> getTrainingListByIds(List<Integer> ids);
}

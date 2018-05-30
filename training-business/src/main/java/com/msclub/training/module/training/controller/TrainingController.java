package com.msclub.training.module.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msclub.base.exception.ParameterException;
import com.msclub.training.module.training.dto.Training;
import com.msclub.training.module.training.dto.TrainingRequest;
import com.msclub.training.module.training.exception.TrainingExceptionCode;
import com.msclub.training.module.training.service.TrainingService;

@RestController
@RequestMapping("/training")
public class TrainingController {

	@Autowired
	private TrainingService trainingService;

	@PostMapping("/list")
	public List<Training> getTrainingListByIds(TrainingRequest request) {
		if (CollectionUtils.isEmpty(request.getIds())) {
			throw new ParameterException(TrainingExceptionCode.ERROR_010003);
		}
		return trainingService.getTrainingListByIds(request.getIds());
	}
}

package com.msclub.training.module.training.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.msclub.base.exception.DataNotFoundException;
import com.msclub.base.exception.TechnicalFailureException;
import com.msclub.training.module.training.dto.Training;
import com.msclub.training.module.training.exception.TrainingExceptionCode;
import com.msclub.training.module.training.repository.TrainingRepository;

@Service
public class TrainingDomainImpl implements TrainingDomain {

	@Autowired
	private TrainingRepository trainingRepository;

	@Override
	public List<Training> getTrainingListByIds(List<Integer> ids) {
		try {
			List<Training> trainings = trainingRepository.findAll(ids);
			if (CollectionUtils.isEmpty(trainings)) {
				throw new DataNotFoundException(TrainingExceptionCode.ERROR_010001);
			}
			return trainings;
		} catch (Exception e) {
			throw new TechnicalFailureException(TrainingExceptionCode.ERROR_010002, e);
		}
	}
}

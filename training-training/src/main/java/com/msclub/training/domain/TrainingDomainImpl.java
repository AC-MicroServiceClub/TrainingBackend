package com.msclub.training.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclub.base.exception.TechnicalFailureException;
import com.msclub.training.dto.Training;
import com.msclub.training.exception.TrainingExceptionCode;
import com.msclub.training.repository.TrainingRepository;

@Service
public class TrainingDomainImpl implements TrainingDomain {

	@Autowired
	private TrainingRepository trainingRepository;

	@Override
	public Training getTrainingById(Integer id) {
		try {
			return trainingRepository.findOne(id);
		} catch (Exception e) {
			throw new TechnicalFailureException(TrainingExceptionCode.ERROR_010002, e);
		}
	}

}

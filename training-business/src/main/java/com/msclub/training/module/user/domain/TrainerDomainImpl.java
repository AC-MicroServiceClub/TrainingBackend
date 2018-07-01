package com.msclub.training.module.user.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.msclub.base.exception.DataNotFoundException;
import com.msclub.base.exception.TechnicalFailureException;
import com.msclub.training.module.training.dto.Training;
import com.msclub.training.module.training.exception.TrainingExceptionCode;
import com.msclub.training.module.training.repository.TrainingRepository;
import com.msclub.training.module.user.dto.Trainer;
import com.msclub.training.module.user.exception.TrainerExceptionCode;
import com.msclub.training.module.user.repository.TrainerRepository;

@Service
public class TrainerDomainImpl implements TrainerDomain {

	@Autowired
	private TrainerRepository trainerRepository;

	@Override
	public Trainer getTrainerById(Integer id) {
		try {
			return trainerRepository.findOne(id);
		} catch (Exception e) {
			throw new TechnicalFailureException(TrainerExceptionCode.ERROR_010002, e);
		}
	}

}

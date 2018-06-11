package com.msclub.training.module.training.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.msclub.base.exception.DataNotFoundException;
import com.msclub.base.exception.TechnicalFailureException;
import com.msclub.training.module.training.dto.TrainingHistory;
import com.msclub.training.module.training.exception.TrainingExceptionCode;
import com.msclub.training.module.training.repository.TrainingHistoryResposity;

public class TrainingHistoryDomainImpl implements TrainingHistoryDomain{
	@Autowired
	private TrainingHistoryResposity trainingHistoryResposity;
	
	@Override
	public List<TrainingHistory> getTrainingsByTraineeId(String traineeId) {
		try {
			List<TrainingHistory> trainingHistorys = trainingHistoryResposity.findByTraineeId(traineeId);
			if (CollectionUtils.isEmpty(trainingHistorys)) {
				throw new DataNotFoundException(TrainingExceptionCode.ERROR_010001);
			}
			return trainingHistorys;
		} catch (Exception e) {
			throw new TechnicalFailureException(TrainingExceptionCode.ERROR_010002, e);
		}
	}
}

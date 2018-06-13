package com.msclub.training.module.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msclub.training.module.training.dto.TrainingHistory;

public interface TrainingHistoryResposity extends JpaRepository<TrainingHistory, Integer>{
	
	public List<TrainingHistory> findByTraineeId(String id);
	
}

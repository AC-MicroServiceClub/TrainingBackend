package com.msclub.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msclub.training.dto.Training;

public interface TrainingRepository extends JpaRepository<Training, Integer> {
	
}
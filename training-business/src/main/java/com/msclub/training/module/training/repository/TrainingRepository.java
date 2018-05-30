package com.msclub.training.module.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msclub.training.module.training.dto.Training;

public interface TrainingRepository extends JpaRepository<Training, Integer> {

}

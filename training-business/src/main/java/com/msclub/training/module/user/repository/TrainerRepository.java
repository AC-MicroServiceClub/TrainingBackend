package com.msclub.training.module.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msclub.training.module.user.dto.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

}

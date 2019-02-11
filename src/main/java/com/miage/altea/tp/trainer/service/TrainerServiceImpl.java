package com.miage.altea.tp.trainer.service;

import org.springframework.stereotype.Service;

import com.miage.altea.tp.trainer.bo.Trainer;
import com.miage.altea.tp.trainer.repository.TrainerRepository;

@Service
public class TrainerServiceImpl implements TrainerService {

	private TrainerRepository trainerRepository;

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public Iterable<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

    @Override
    public Trainer getTrainer(String name) {
    	return trainerRepository.findById(name).orElse(null);
    }

    @Override
    public Trainer createTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

}

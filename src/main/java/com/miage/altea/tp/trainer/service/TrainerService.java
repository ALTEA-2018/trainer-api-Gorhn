package com.miage.altea.tp.trainer.service;

import com.miage.altea.tp.trainer.bo.Trainer;

public interface TrainerService {
	
	Iterable<Trainer> getAllTrainers();
    Trainer getTrainer(String name);
    Trainer createTrainer(Trainer trainer);
    
}


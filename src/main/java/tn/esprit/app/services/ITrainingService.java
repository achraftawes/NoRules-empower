package tn.esprit.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.app.entities.Training;

@Service
public interface ITrainingService {
	
	 void addTraining(Training training) throws Exception;
	List<Training> getAllTraining();
	void updateTraining(Training training ,Long id);
	String deleteTraining(Long id);
	void AssignFormerToTraining(Long idTraining , Long idFormer) throws Exception;
	void AssignLearnerToTraining(Long idLearner, Long idTraining) throws Exception;
	
}

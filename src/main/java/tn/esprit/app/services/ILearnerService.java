package tn.esprit.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.app.entities.Learner;
@Service
public interface ILearnerService {
	
	List<Learner> getAllLearners();
	Learner addLearner(Learner learner);
	void deleteLearner(Long idLearner);
	void updateLearner(Learner learner , Long idLearner);
	
	

}

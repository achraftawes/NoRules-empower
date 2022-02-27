package tn.esprit.app.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.app.entities.Learner;
import tn.esprit.app.repositories.LearnerRepository;
@Service
public class LearnerServiceImpl implements ILearnerService{

	@Autowired
	LearnerRepository learnerR ;
	
	@Override
	public List<Learner> getAllLearners() {
		List<Learner> to =new ArrayList<>();
		learnerR.findAll().forEach(to ::add);
			return to;
	}

	@Override
	public Learner addLearner(Learner learner) {
		return learnerR.save(learner);
	}

	@Override
	public void deleteLearner(Long idLearner) {
		
		learnerR.deleteById(idLearner);
		
		
	}

	@Override
	public void updateLearner(Learner learner, Long idLearner) {
		
		Learner currentLearner=learnerR.findById(idLearner).get();
		
		currentLearner.setFirstName(learner.getFirstName());
		currentLearner.setLastName(learner.getLastName());
		currentLearner.setEmail(learner.getEmail());
		currentLearner.setImgLearner(learner.getImgLearner());
		learnerR.save(currentLearner);
	}
	
	
	
	

}

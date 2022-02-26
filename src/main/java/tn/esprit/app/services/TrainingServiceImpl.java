package tn.esprit.app.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.app.entities.Former;
import tn.esprit.app.entities.Learner;
import tn.esprit.app.entities.Training;
import tn.esprit.app.repositories.FormerRepository;
import tn.esprit.app.repositories.LearnerRepository;
import tn.esprit.app.repositories.TrainingRepository;


@Service
public class TrainingServiceImpl implements ITrainingService{
	@Autowired
	TrainingRepository trainingR;
	@Autowired
	FormerRepository formerR;
	@Autowired
	LearnerRepository learnerR;
	
	@Override
	public void addTraining(Training training) throws Exception {
		if ((null != trainingR.findByTitle(training.getTitle()))) {
			
			//(null!=trainingR.findByLevel(training.getLevel()))
			
            throw new Exception("there is a training with the same Title " + training.getTitle());
        }
        
        trainingR.save(training);
		
	}
	@Override
	public List<Training> getAllTraining() {
		return trainingR.findAll();
		}
	@Override
	public void updateTraining(Training training, Long id) {
		Training currentTraining = trainingR.findById(id).get();

		currentTraining.setTitle(training.getTitle());
		currentTraining.setDescription(training.getDescription());
		currentTraining.setImgTraining(training.getImgTraining());
		currentTraining.setIsAvailable(training.getIsAvailable());
		currentTraining.setUrlTraining(training.getUrlTraining());
		currentTraining.setLevel(training.getLevel());
		currentTraining.setEndDate(training.getEndDate());
		currentTraining.setStartDate(training.getStartDate());
		currentTraining.setNbrHours(training.getNbrHours());
		currentTraining.setNbrMaxParticipant(training.getNbrMaxParticipant());



        trainingR.save(currentTraining);
		
	}
	
	@Override
	public String deleteTraining(Long id) {
		
			Training currentTraining=trainingR.findById(id).get();
			trainingR.delete(currentTraining);
		return "Deleted Successfully";
	}
	@Override
	public void AssignFormerToTraining(Long idTraining, Long idFormer)throws Exception {
		Former former=formerR.findById(idFormer).orElse(null);
		Training training=trainingR.findById(idTraining).get();
		
		if ( (training.getFormer()!=null)) {
			   throw new Exception("this training " + training.getTitle()+ " has already a former "+training.getFormer().getFirstName());
		}
		else if (training.getFormer()== null) {
			
			training.setFormer(former);
			trainingR.save(training);
			
			
		}
	
		
	}
	@Override
	public void AssignLearnerToTraining(Long idLearner, Long idTraining) throws Exception{
		Training training=trainingR.findById(idTraining).get();
		Learner learner=learnerR.findById(idLearner).get();
		
		if ( training.getLearners().size() <  training.getNbrMaxParticipant()) {
			
		training.getLearners().add(learner);
		trainingR.save(training);
		
		}
		throw new Exception("This Training is no longer available Maximum Number of participants Reached");

		
	}
}

package tn.esprit.app.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import tn.esprit.app.entities.Training;
import tn.esprit.app.services.ITrainingService;


@Controller
@RequestMapping("/training")
public class TrainingController {
	@Autowired
	ITrainingService trainingS;
	
	// http://localhost:8086/SheApp/training/add-training
		@PostMapping("/add-training")
		@ResponseBody
		public String addTraining(@RequestBody  Training training) throws Exception {
			try {
			trainingS.addTraining(training);
			return "added";
			}catch (Exception e) {
				return "Training exist ";}
		}
	
	// http://localhost:8086/SheApp/training/retrieve-all-trainings
		
		@GetMapping("/retrieve-all-trainings")
		@ResponseBody
		public List<Training> getTrainings()  {
			return trainingS.getAllTraining();
		}
	
	// http://localhost:8086/SheApp/training/UpdateTraining/{id-training}
		@PutMapping("/UpdateTraining/{id-training}")
		@ResponseBody
		public void updateTraining(@RequestBody  Training training,@PathVariable("id-training") Long id) {
			trainingS.updateTraining(training, id);
		}
		
	// http://localhost:8086/SheApp/training/remove-Trainig/{Training-id}
		@DeleteMapping("/remove-Trainig/{Training-id}")
		@ResponseBody
		public String deleteTraining(@PathVariable("Training-id")   Long id) {
			try {
				trainingS.deleteTraining(id);
				return "Deleted Successefully";
				
				}catch (Exception e) {
				return "Training doesn't exist";
				}
		}
	
	// http://localhost:8086/SheApp/training/AssignFormer/{id-training}/{id-former}
		@PutMapping("/AssignFormer/{id-training}/{id-former}")
		@ResponseBody
		public String AssignFormer(@PathVariable("id-training") Long idTraining,@PathVariable("id-former") Long id) throws Exception {
			try {
				trainingS.AssignFormerToTraining(idTraining, id);
				return "Former Affected Successefully";
				}
				catch (Exception e) {
				return "Training  mentioned doesn't exist";
				}
				}
	// http://localhost:8086/SheApp/training/AssignLearnerToTraining/{id-learner}/{id-training}
		@PutMapping("/AssignLearnerToTraining/{id-learner}/{id-training}")
		@ResponseBody
		public String AssignLearnerToTraining(@PathVariable("id-learner")	Long idLearner,@PathVariable("id-training") Long idTraining)throws Exception{
			try {
				trainingS.AssignLearnerToTraining(idLearner, idTraining);
				return "Learner Assigned Successefully";
			}
			catch (Exception e) {
				return "This Training is no longer available Maximum Number of participants Reached ";
				
				}
		
		    }
		
		// http://localhost:8086/SheApp/training/retrieve-TrainingByTitle/
		
				@GetMapping("/retrieve-TrainingByTitle/{title}")
				@ResponseBody
				public List<Training> SearchTraining(@PathVariable("title") String Title){
					return trainingS.SearchTraining(Title);
				}
}

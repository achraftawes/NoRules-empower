package tn.esprit.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tn.esprit.app.entities.Learner;
import tn.esprit.app.services.ILearnerService;

@Controller
@RequestMapping("/learner")
public class LearnerController {
	@Autowired
	ILearnerService learnerS;
	
	// http://localhost:8086/SheApp/learner/retrieve-all-learners
	
		@GetMapping("/retrieve-all-learners")
		@ResponseBody
			public List<Learner> getAllLearners(){
				return learnerS.getAllLearners();
		}
	// http://localhost:8086/SheApp/learner/UpdateLearner/{id-learner}
		@PutMapping("/UpdateLearner/{id-learner}")
		@ResponseBody
			public String updateLearner(@RequestBody Learner l , @PathVariable("id-learner") Long id)throws  Exception {
			try {
			learnerS.updateLearner(l, id);
			return ("The learner "+l.getFirstName()+" "+l.getLastName()+"'s profile updated successfully");
			}catch(Exception e) {
				return ("this id = " +id+ " doesn't exist ");
			}
		}
			
			
}

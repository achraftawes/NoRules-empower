package tn.esprit.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.app.entity.JobOffers;
import tn.esprit.app.service.JobOffersService;

@RestController 
@RequestMapping("/joboffers")
public class JobOffersController {
	@Autowired
	JobOffersService jobOffersService ;
	@PostMapping("/addJobOffers") 
	@ResponseBody
	public void addJobOffers(@RequestBody JobOffers joboffers) {
		jobOffersService.addJobOffers(joboffers);
		}
	@DeleteMapping("/delete-JobOffers/{id_job}")
	@ResponseBody
	public void deleteJobOffers(@PathVariable("id_job") Integer id_job) {
		jobOffersService.deleteJobOffers(id_job);
		}
	@PutMapping("/update-JobOffers")
	@ResponseBody
	public void  updateJobOffers(@RequestBody JobOffers joboffers) {
		jobOffersService.updateJobOffers(joboffers);
	}
	@GetMapping("/retrieve-all-joboffers")
	@ResponseBody
	public List<JobOffers> getOffers() {
	List<JobOffers> listJobOffers = jobOffersService.retrieveAllJobOffers();
	return listJobOffers;

	}
	
}

package tn.esprit.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.app.entity.JobOffers;
import tn.esprit.app.repository.JobOffersRepository;

@Service
@Slf4j
public class JobOffersServiceImpl implements JobOffersService{
	@Autowired
	JobOffersRepository joboffersRepository ;

	@Override
	public void addJobOffers(JobOffers joboffers) {
		joboffersRepository.save(joboffers);		
	}

	@Override
	public void deleteJobOffers(Integer id_job) {
		joboffersRepository.deleteById(id_job);		
	}

	@Override
	public void updateJobOffers(JobOffers joboffers) {
		joboffersRepository.save(joboffers);
	}

	@Override
	public List<JobOffers> retrieveAllJobOffers() {
		List<JobOffers> joboffers =(List<JobOffers>) joboffersRepository.findAll();
		for (JobOffers joboffer : joboffers ) {
		 log.info("joboffer : "+ joboffer );	
		}
		 return joboffers; 
	}

	

	
}

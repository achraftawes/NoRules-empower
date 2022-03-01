package tn.esprit.app.service;

import java.util.List;

import tn.esprit.app.entity.JobOffers;

public interface JobOffersService {
	public void addJobOffers(JobOffers joboffers);
	public void deleteJobOffers(Integer id_job);
	public void updateJobOffers(JobOffers joboffers);
	public List<JobOffers> retrieveAllJobOffers();
	 

}

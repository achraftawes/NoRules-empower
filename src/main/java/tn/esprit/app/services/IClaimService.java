package tn.esprit.app.services;

import java.util.List;

//import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.app.entities.Claim;
import tn.esprit.app.entities.TypeClaim;
//import tn.esprit.app.entities.TypeClaim;
//import tn.esprit.app.entities.User;

@Service
public interface IClaimService {
	
	public Claim addClaim(Claim claim);
	public Claim addClaimReduced(String body , TypeClaim typeReclamation);
	public List<Claim> getAllClaims();
	 public void deleteClaim(long id);
	public Long addOrUpdateClaim(Claim claim) ;
	public Claim getClaimById(long id);
	
	/*
	public List<Claim> getLastClaims(User user) ;
	public List<Claim> findByTypeClaimsOrderByPostedDesc(TypeClaim typeClaim);
	public List<Claim> findReclamationsBySender(User sender);
	public List<Claim> searchClaim(String msg);*/
	
	

}

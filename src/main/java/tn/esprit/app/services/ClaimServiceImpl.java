package tn.esprit.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.app.entities.Claim;
import tn.esprit.app.entities.TypeClaim;
import tn.esprit.app.repositories.ClaimRepository;

@Service
public class ClaimServiceImpl implements IClaimService{
	@Autowired
	ClaimRepository claimR ;
	
	
	@Override
	public Claim addClaim(Claim claim) {
		
		return claimR.save(claim);
	}


	@Override
	public Claim addClaimReduced(String body, TypeClaim typeReclamation) {
		return (claimR.save(new Claim(body,typeReclamation)));
	}


	@Override
	public void deleteClaim(long id) {
		claimR.deleteById(id);
		
	}


	@Override
	public List<Claim> getAllClaims() {
		return claimR.findAll();
	}


	@Override
	public Long addOrUpdateClaim(Claim claim) {
		claimR.save(claim);
		return claim.getIdClaim();
	}


	@Override
	public Claim getClaimById(long id) {
		return claimR.getClaimById(id);
	}


	@Override
	public List<Claim> getClaimOrderByDESC() {
		
		return claimR.findClaimOrderByPostedDesc();
	}
	
	
	
	

}

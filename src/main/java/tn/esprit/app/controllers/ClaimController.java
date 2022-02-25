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

import tn.esprit.app.entities.Claim;
import tn.esprit.app.entities.TypeClaim;
import tn.esprit.app.services.IClaimService;



@Controller
@RequestMapping("/claim")
public class ClaimController {
	@Autowired
	IClaimService claimS ;
	
	// http://localhost:8086/SheApp/claim/add-claim
	@PostMapping("/add-claim")
	@ResponseBody
	public Claim addClaimF(@RequestBody  Claim claim) {
		return claimS.addClaim(claim);
	}
	
	// http://localhost:8086/SheApp/claim/add-claim-Reduced
	@PostMapping("/add-claim-Reduced")
	@ResponseBody
	public Claim addClaimR(@RequestBody String body , TypeClaim tc) {
		return claimS.addClaimReduced(body, tc);
	}
	
	// http://localhost:8086/SheApp/claim/remove-claim/{claim-id}
	@DeleteMapping("/remove-claim/{claim-id}")
	@ResponseBody
	public void removeClaim(@PathVariable("claim-id") Long id) {
		claimS.deleteClaim(id);
		
		}
	
	// http://localhost:8086/SheApp/claim/retrieve-all-claims
		
		@GetMapping("/retrieve-all-claims")
		@ResponseBody
		public List<Claim> getClaims()  {
			return claimS.getAllClaims();
			
		}
	// http://localhost:8086/SheApp/claim/addOrUpdateClaim
		@PutMapping("/addOrUpdateClaim")
		@ResponseBody
		public Long addOrUpdateClaim(@RequestBody Claim claim) {
			return claimS.addOrUpdateClaim(claim);
		}
	
		// http://localhost:8086/SheApp/claim/retrieve-ClaimId/{claim-id}
		
		@GetMapping("/retrieve-ClaimId/{claim-id}")
		@ResponseBody
		public Claim getClaimById(@PathVariable("claim-id") long id) {
			
			return claimS.getClaimById(id);
					
		}

}

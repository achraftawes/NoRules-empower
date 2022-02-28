package tn.esprit.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim,Long>{
	
	@Query("Select r from Claim r where r.idClaim=:idClaim")
	public Claim getClaimById(@Param("idClaim") long idClaim);
	
	
	@Query("Select c from Claim c ORDER BY c.posted DESC")
	List<Claim> findClaimOrderByPostedDesc();
}

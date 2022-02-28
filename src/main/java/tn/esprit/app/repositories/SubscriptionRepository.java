package tn.esprit.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Subscription;
@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription, Long> {
	
}

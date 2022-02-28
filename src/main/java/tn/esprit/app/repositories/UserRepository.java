package tn.esprit.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.SubscriptionType;
import tn.esprit.app.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUserName(String userName);

	/*@Query("SELECT t from Training t WHERE t.domain in (SELECT s.domain FROM SUBSCRIPTION s WHERE s.user= :user and s.subscriptionType= :subscriptionType))")
	List<Training> retrieveTrainingBySubscriptionType(@Param("user") User user,
			@Param("subscriptionType") SubscriptionType subscriptionType);

	@Query("SELECT j from Job t WHERE j.domain in (SELECT s.domain FROM SUBSCRIPTION s WHERE s.user= :user and s.subscriptionType= :subscriptionType))")
	List<Job> retrieveJobBySubscriptionType(@Param("user") User user,
			@Param("subscriptionType") SubscriptionType subscriptionType);*/

}

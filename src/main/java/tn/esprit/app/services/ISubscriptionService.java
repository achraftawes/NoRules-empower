package tn.esprit.app.services;

import java.util.List;

import tn.esprit.app.entities.Subscription;

public interface ISubscriptionService {

	List<Subscription> retrieveAllSubscription();

	void deleteSubscription(Long id);

	Subscription updateSubscription(Subscription s);

	Subscription retrieveSubscription(Long id);

}

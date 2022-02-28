package tn.esprit.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.app.entities.Subscription;
import tn.esprit.app.repositories.SubscriptionRepository;

@Service
public class SubscriptionServiceImpl implements ISubscriptionService {
	@Autowired
	SubscriptionRepository subscriptionRepository;

	@Override
	public List<Subscription> retrieveAllSubscription() {
		return (List<Subscription>) subscriptionRepository.findAll();
	}

	@Override
	public void deleteSubscription(Long id) {
		Subscription subscription = subscriptionRepository.findById(id).get();
		subscriptionRepository.delete(subscription);

	}

	@Override
	public Subscription updateSubscription(Subscription s) {
		return subscriptionRepository.save(s);
	}

	@Override
	public Subscription retrieveSubscription(Long id) {
		Subscription subscription = subscriptionRepository.findById(id).get();
		return subscription;
	}

}

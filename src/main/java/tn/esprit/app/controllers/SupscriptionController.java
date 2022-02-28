package tn.esprit.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.app.entities.Subscription;
import tn.esprit.app.services.ISubscriptionService;

@RestController
public class SupscriptionController {
	@Autowired
	ISubscriptionService subscriptionService;

	@GetMapping("/retrieve-all-subscriptions")
	@ResponseBody
	List<Subscription> retrieveAllSubscription() {
		return subscriptionService.retrieveAllSubscription();
	}

	@DeleteMapping("/remove-subscription/{subscription-id}")
	@ResponseBody
	void deleteSubscription(@PathVariable("subscription-id") Long id) {
		subscriptionService.deleteSubscription(id);
	}

	@PutMapping("/modify-subscription")
	@ResponseBody
	Subscription updateSubscription(@RequestBody Subscription s) {
		return subscriptionService.updateSubscription(s);

	}

	@GetMapping("/retrieve-subscription/{subscription-id}")
	@ResponseBody
	Subscription retrieveSubscription(@PathVariable("subscription-id") Long id) {
		return subscriptionService.retrieveSubscription(id);
	}

}

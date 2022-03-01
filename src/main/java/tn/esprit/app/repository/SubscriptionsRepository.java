package tn.esprit.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entity.Subscriptions;
@Repository
public interface SubscriptionsRepository  extends CrudRepository<Subscriptions, Integer> {

}

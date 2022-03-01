package tn.esprit.app.Services;

import java.util.List;

import tn.esprit.app.entities.Charityevent;

public interface CharityeventService {
	void addEvent(Charityevent c);
	void removeEvent(Long id_charity);
	void updateEvent(Charityevent c);
	List<Charityevent> retrieveAllEvents();


}

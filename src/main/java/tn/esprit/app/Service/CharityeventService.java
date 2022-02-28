package tn.esprit.app.Service;

import java.util.List;

import tn.esprit.app.entity.Charityevent;

public interface CharityeventService {
	void addEvent(Charityevent c);
	void removeEvent(Long id_charity);
	void updateEvent(Charityevent c);
	List<Charityevent> retrieveAllEvents();


}

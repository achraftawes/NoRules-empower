package tn.esprit.app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.app.Services.CharityeventService;
import tn.esprit.app.entities.Charityevent;

@RestController
@RequestMapping("/charityevent")
public class CharityeventController {

	@Autowired
	CharityeventService charityEventService;
	@PostMapping("/addEvent")
	@ResponseBody
	void addJobOffers(@RequestBody Charityevent c ) {
	charityEventService.addEvent(c);
	}

	@DeleteMapping("/remove-event/{id_charity}")
	@ResponseBody
	public void removeEvent(@PathVariable("id_charity") Long id_charity) {
	charityEventService.removeEvent(id_charity);
	}
	@PutMapping("/update-event")
	@ResponseBody
	public void updateEvent(@RequestBody Charityevent c) {
	charityEventService.updateEvent(c);
	}
	// http://localhost:8085/SpringMVC/client/retrieve-all-clients

	@GetMapping("/retrieve-all-events")
	@ResponseBody
	public List<Charityevent> getEvents() {
	List<Charityevent> listCharityEvents = charityEventService.retrieveAllEvents();
	return listCharityEvents;

	}

	}


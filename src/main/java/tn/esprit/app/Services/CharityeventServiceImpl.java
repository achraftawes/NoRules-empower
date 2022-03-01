package tn.esprit.app.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.app.Repositories.CharityeventRepository;
import tn.esprit.app.entities.Charityevent;
@Slf4j
@Service
public class CharityeventServiceImpl implements CharityeventService {
	@Autowired
	CharityeventRepository charityEventRepository;


	@Override
	public void addEvent(Charityevent c) {
		charityEventRepository.save(c);
		
	}

	@Override
	public void removeEvent(Long id_charity) {
		charityEventRepository.deleteById(id_charity);
		
	}

	@Override
	public void updateEvent(Charityevent c) {
		charityEventRepository.save(c);
		
	}

	@Override
	public List<Charityevent> retrieveAllEvents() {
		List<Charityevent> events =(List<Charityevent>) charityEventRepository.findAll();
		for (Charityevent event : events ) {
		 log.info("event : "+ event );

		}
		return events;
		}

}

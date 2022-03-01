package tn.esprit.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.app.entity.Women;
import tn.esprit.app.repository.WomenRepository;
@Service
@Slf4j
public class WomenServiceImpl implements WomenService {
	@Autowired
	WomenRepository womenRepository ;
	@Override
	public void addWomen(Women women) {
		womenRepository.save(women)		;
	}

	@Override
	public void deleteWomen(Integer idWomen) {
		womenRepository.deleteById(idWomen);		
	}

	@Override
	public void updateWomen(Women women) {
		womenRepository.save(women)	;	
	}

	@Override
	public List<Women> retrieveAllWomen() {
		List<Women> women =(List<Women>) womenRepository.findAll();
		for (Women womens : women ) {
		 log.info("womens : "+ womens );	
		}
		 return women; 
	}

}

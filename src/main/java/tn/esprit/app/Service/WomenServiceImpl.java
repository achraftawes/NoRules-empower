package tn.esprit.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.app.Repository.WomenRepository;
import tn.esprit.app.entity.Women;
@Slf4j
@Service
public class WomenServiceImpl implements WomenService {
	@Autowired
	WomenRepository womenRepository ;

	@Override
	public void addWomen(Women women) {
		womenRepository.save(women);
		
	}

	

	@Override
	public void updateWomen(Women women) {
		womenRepository.save(women) ;
		
	}

	@Override
	public List<Women> retrieveAllWomen() {
		List<Women> women =(List<Women>) womenRepository.findAll();
		for (Women womens : women ) {
		log.info("womens : "+ womens );
		}
		return women;
		}

	


	@Override
	public void removeWomen(Long idWomen) {
		womenRepository.deleteById(idWomen);
		
		
	}

}

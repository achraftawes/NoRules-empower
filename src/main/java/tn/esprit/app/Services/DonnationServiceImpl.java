package tn.esprit.app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.app.Repositories.DonnationRepository;

@Service
public class DonnationServiceImpl implements DonnationService {
	@Autowired
	DonnationRepository donnationRepository;

	@Override
	public int countAllDonnation() {
		
		return donnationRepository.nbreDonations();
	}

}

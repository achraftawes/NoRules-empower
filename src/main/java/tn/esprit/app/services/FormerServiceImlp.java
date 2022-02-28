package tn.esprit.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.app.entities.Former;
import tn.esprit.app.repositories.FormerRepository;

@Service
public class FormerServiceImlp  implements IFormerService{
	@Autowired
	FormerRepository formerR;
	@Override
	public List<Former> getAllFormers() {
		return formerR.findAll();
	}

	@Override
	public Former getFormerById(Long idFormer) {

		return formerR.findById(idFormer).get();
	}

	@Override
	public Former addFormer(Former former) {
		return formerR.save(former);
	}

	@Override
	public void deleteFormer(Long idFormer) {
		formerR.deleteById(idFormer);
		
	}

	@Override
	public void updateFormer(Former former, Long idFormer) {
		
		Former currentFormer=formerR.findById(idFormer).get();
		currentFormer.setFirstName(former.getFirstName());
		currentFormer.setLastName(former.getLastName());
		currentFormer.setEmail(former.getEmail());
		currentFormer.setHourlyFee(former.getHourlyFee());
		
		formerR.save(currentFormer);
	}

}

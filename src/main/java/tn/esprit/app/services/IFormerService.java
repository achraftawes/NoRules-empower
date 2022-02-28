package tn.esprit.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.app.entities.Former;



@Service
public interface IFormerService {
	
	List<Former> getAllFormers();
	Former getFormerById(Long idFormer);
	Former addFormer(Former former);
	void deleteFormer(Long idFormer);
	void updateFormer(Former former , Long idFormer);

}

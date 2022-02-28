package tn.esprit.app.Service;

import java.util.List;

import tn.esprit.app.entity.Women;

	public interface WomenService {
	public void addWomen(Women women);
	void removeWomen(Long idWomen);
	public void updateWomen(Women women);
	public List<Women> retrieveAllWomen();

}

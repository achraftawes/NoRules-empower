package tn.esprit.app.service;

import java.util.List;

import tn.esprit.app.entity.Women;


public interface WomenService {
	public void addWomen(Women women);
	public void deleteWomen(Integer idWomen);
	public void updateWomen(Women women);
	public List<Women> retrieveAllWomen();

}

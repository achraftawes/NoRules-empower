package tn.esprit.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Charityevent implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_charity;
	private String Description;
	@Temporal(TemporalType.DATE)
	private Date dateEvent;
	private String Adress;
	private int numberattendees;
	private String imageEvent;
	
}

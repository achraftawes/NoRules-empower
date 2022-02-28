package tn.esprit.app.entity;

import java.io.Serializable; 
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Subscriptions  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idSub")
	private Integer idSub; // Clé primaire
	@Temporal(TemporalType.DATE)
	private Date StratDate;
	@Temporal(TemporalType.DATE)
	private Date EndDate;
	private Float Price;
	private String Type;
	@OneToOne
	private Women women ;



}

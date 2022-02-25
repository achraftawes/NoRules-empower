package tn.esprit.app.entities;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Claim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="idClaim")
	
	private Long idClaim; 
	
	@Column(name="body", nullable=false)
	private String body;
	private Boolean status ;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date posted = Calendar.getInstance().getTime();

	/*@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "sender_id")*/
	
	private String sender;
	
	@Enumerated(EnumType.STRING)

	private TypeClaim typeClaim;
	

	/*@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "recipient_id")*/
	
	private String recipient;


	public Claim(String body, TypeClaim typeClaim) {
		super();
		this.body = body;
		this.typeClaim = typeClaim;
	}

	
}

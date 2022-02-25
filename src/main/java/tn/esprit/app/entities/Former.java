package tn.esprit.app.entities;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Former {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="idFormer")
	private Long idFormer; 
	private String firstName;
	private String lastName;
	private Integer hourlyFee;
	private String email;
	
	@OneToMany(mappedBy="former")
	private Set<Training> training ;
}

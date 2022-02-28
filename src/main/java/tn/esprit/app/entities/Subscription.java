package tn.esprit.app.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Subscription implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	Long id;
	@Temporal(TemporalType.DATE)
	Date beginDate;
	@Temporal(TemporalType.DATE)
	Date endDate;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "Domain", joinColumns = @JoinColumn(name = "id"))
	@Enumerated(EnumType.STRING)
	List<Domain> domains;
	@Enumerated(EnumType.STRING)
	SubscriptionType subscriptionType;
	@ManyToOne
	User user;

}

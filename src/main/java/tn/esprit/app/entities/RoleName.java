package tn.esprit.app.entities;

import org.springframework.security.core.GrantedAuthority;

public enum RoleName implements GrantedAuthority {
	FORMER, WOMAN, JOB_PROPOSER, EXPERT, DONATOR, ADMINISTRATOR;

	@Override
	public String getAuthority() {
		return "ROLE_" + name();
	}
}

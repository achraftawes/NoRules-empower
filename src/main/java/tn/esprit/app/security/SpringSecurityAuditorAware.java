package tn.esprit.app.security;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

public class SpringSecurityAuditorAware implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		// Just return a string representing the username
		//return Optional.ofNullable("Kindson").filter(s -> !s.isEmpty());
		return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication().getName());
	}

}
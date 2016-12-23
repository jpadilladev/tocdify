package es.webstilos.tocdify.service;

import org.springframework.security.core.userdetails.User;

public interface UserService {

	User getUserByUsername(String name);

	es.webstilos.tocdify.model.user.User saveUser(String username, String password);
	
}

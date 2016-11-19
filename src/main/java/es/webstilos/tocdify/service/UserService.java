package es.webstilos.tocdify.service;

import org.springframework.security.core.userdetails.User;

public interface UserService {

	User getUserByUsername(String name);
	
}

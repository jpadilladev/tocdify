package es.webstilos.tocdify.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import es.webstilos.tocdify.model.user.User;
import es.webstilos.tocdify.model.user.UserWrapper;
import es.webstilos.tocdify.service.UserService;
import lombok.val;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public org.springframework.security.core.userdetails.User getUserByUsername(String name) {
		// TODO recuperar del fichero de configuracion
		val password = "1234";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		return new UserWrapper(new User("jpadilla", hashedPassword));
	}

}

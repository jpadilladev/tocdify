package es.webstilos.tocdify.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import es.webstilos.tocdify.model.settings.Settings;
import es.webstilos.tocdify.model.user.User;
import es.webstilos.tocdify.model.user.UserWrapper;
import es.webstilos.tocdify.service.UserService;
import lombok.val;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private Settings settings;

	@Override
	public org.springframework.security.core.userdetails.User getUserByUsername(String name) {
		val user = settings.getUserSettings().getUser();
		if (user != null) {
			return new UserWrapper(user);
		}
		return null;
	}

	@Override
	public User saveUser(String username, String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		val user = new User(username, hashedPassword);
		// TODO save settings on disk
		return user;
	}

}

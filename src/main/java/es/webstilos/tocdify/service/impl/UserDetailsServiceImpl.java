package es.webstilos.tocdify.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import es.webstilos.tocdify.service.SettingsService;

/**
 * TODO Extract all this user Spring configuration to external libs
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private SettingsService settingsService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return settingsService.getUserByUsername(username);
	}

}

package es.webstilos.tocdify.service;

import org.springframework.security.core.userdetails.User;

import es.webstilos.tocdify.model.settings.Settings;

public interface SettingsService {

	User getUserByUsername(String name);

	void saveUser(String username, String password);

	Settings getSettings();

}

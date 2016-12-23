package es.webstilos.tocdify.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import es.webstilos.tocdify.model.settings.Settings;
import es.webstilos.tocdify.model.user.User;
import es.webstilos.tocdify.model.user.UserWrapper;
import es.webstilos.tocdify.repository.SettingsRepository;
import es.webstilos.tocdify.service.SettingsService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.val;

@Service
@RequiredArgsConstructor
public class SettingsServiceImpl implements SettingsService {

	private final SettingsRepository repository;
	@Getter
	private final Settings settings;

	@Override
	public org.springframework.security.core.userdetails.User getUserByUsername(String name) {
		val user = settings.getUserSettings().getUser();
		if (user != null) {
			return new UserWrapper(user);
		}
		return null;
	}

	@Override
	public void saveUser(String username, String password) {
		settings.getUserSettings().setUser(StringUtils.isNoneBlank(username, password)
				? new User(username, new BCryptPasswordEncoder().encode(password)) : null);
		repository.save(settings);
	}

}

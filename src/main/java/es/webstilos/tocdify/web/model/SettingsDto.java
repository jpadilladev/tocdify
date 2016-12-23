package es.webstilos.tocdify.web.model;

import es.webstilos.tocdify.model.settings.Settings;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.val;

@Data
@NoArgsConstructor
public class SettingsDto {

	private String username;
	private String password;

	public SettingsDto(Settings settings) {
			val user = settings.getUserSettings().getUser();
			this.username = user != null ? user.getUsername() : null;
			this.password = user != null ? user.getPasswordHash() : null;
		}

	}
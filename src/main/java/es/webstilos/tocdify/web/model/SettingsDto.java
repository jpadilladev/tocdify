package es.webstilos.tocdify.web.model;

import java.util.List;

import es.webstilos.tocdify.model.settings.Settings;
import es.webstilos.tocdify.model.templates.Template;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.val;

@Data
@NoArgsConstructor
public class SettingsDto {

	private String username;
	private String password;

	private List<Template> templates;

	public SettingsDto(Settings settings) {
		val user = settings.getUserSettings().getUser();
		this.username = user != null ? user.getUsername() : null;
		this.password = user != null ? user.getPasswordHash() : null;
		this.templates = settings.getTemplatesSettings().getTemplates();
	}

}
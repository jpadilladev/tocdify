package es.webstilos.tocdify.model.settings;

import java.util.ArrayList;
import java.util.List;

import es.webstilos.tocdify.model.templates.Template;
import es.webstilos.tocdify.model.user.User;
import lombok.Data;

@Data
public class Settings {

	@Data
	public static class UserSettings {
		private User user;
	}

	@Data
	public static class ServerSettings {
		private Integer port = 8080;
	}

	@Data
	public static class TemplatesSettings {
		private List<Template> templates = new ArrayList<>();
	}

	private final UserSettings userSettings;
	private final ServerSettings serverSettings;
	private final TemplatesSettings templatesSettings;

	public Settings() {
		this.userSettings = new UserSettings();
		this.serverSettings = new ServerSettings();
		this.templatesSettings = new TemplatesSettings();
	}

}

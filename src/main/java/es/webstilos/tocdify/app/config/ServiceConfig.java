package es.webstilos.tocdify.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.webstilos.tocdify.model.settings.Settings;
import es.webstilos.tocdify.repository.SettingsRepository;
import es.webstilos.tocdify.service.FileService;
import lombok.val;

@Configuration
@ComponentScan(basePackageClasses = FileService.class)
public class ServiceConfig {

	@Bean
	public Settings settings(SettingsRepository repository) {
		val settings = repository.get();
		if (settings == null) {
			return new Settings();
		}
		return settings;
	}
}

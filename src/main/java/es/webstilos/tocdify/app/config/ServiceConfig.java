package es.webstilos.tocdify.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.webstilos.tocdify.model.settings.Settings;
import es.webstilos.tocdify.service.FileService;

@Configuration
@ComponentScan(basePackageClasses = FileService.class)
public class ServiceConfig {

	@Bean
	public Settings settings() {
		return new Settings();
	}
}

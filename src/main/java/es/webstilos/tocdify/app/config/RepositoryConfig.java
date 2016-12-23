package es.webstilos.tocdify.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.webstilos.tocdify.repository.SettingsRepository;

@Configuration
@ComponentScan(basePackageClasses = SettingsRepository.class)
public class RepositoryConfig {

}

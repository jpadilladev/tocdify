package es.webstilos.tocdify.repository;

import es.webstilos.tocdify.model.settings.Settings;

public interface SettingsRepository {

	Settings get();

	void save(Settings settings);

}

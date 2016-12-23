package es.webstilos.tocdify.repository.impl;

import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import es.webstilos.tocdify.model.settings.Settings;
import es.webstilos.tocdify.repository.SettingsRepository;
import lombok.SneakyThrows;
import lombok.val;

@Repository
public class SettingsRepositoryImpl implements SettingsRepository {

	@Value("${path.fs.settings}")
	private String path;

	@Override
	@SneakyThrows
	public Settings get() {
		val file = Paths.get(path).toFile();
		if (file.exists()) {
			return new Gson().fromJson(FileUtils.readFileToString(file), Settings.class);
		}
		return null;
	}

	@Override
	@SneakyThrows
	public void save(Settings settings) {
		FileUtils.writeByteArrayToFile(Paths.get(path).toFile(),
				new Gson().toJson(settings).toString().getBytes(StandardCharsets.UTF_8));
	}

}

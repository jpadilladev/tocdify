package es.webstilos.tocdify.model.templates;

import java.nio.file.Path;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "name")
public class Template {

	private final String name;
	private boolean defaultTemplate;
	private Path basePath;

}

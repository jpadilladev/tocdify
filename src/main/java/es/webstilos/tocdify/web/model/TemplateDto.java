package es.webstilos.tocdify.web.model;

import java.nio.file.Path;

import lombok.Data;

@Data
public class TemplateDto {
	private String name;
	private boolean defaultTemplate;
	private Path basePath;

}

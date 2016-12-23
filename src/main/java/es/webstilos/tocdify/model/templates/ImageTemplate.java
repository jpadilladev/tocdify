package es.webstilos.tocdify.model.templates;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ImageTemplate extends Template {

	private boolean useExif = true;
	private String exifPath;

	public ImageTemplate(String name) {
		super(name);
	}

}

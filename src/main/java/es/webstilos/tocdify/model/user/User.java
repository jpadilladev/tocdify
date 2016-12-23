package es.webstilos.tocdify.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	public String username;
	public String passwordHash;

}

package es.webstilos.tocdify.model.user;

import org.springframework.security.core.authority.AuthorityUtils;

public class UserWrapper extends org.springframework.security.core.userdetails.User {

	private static final long serialVersionUID = 4534023916529072387L;
	private User user;

	public UserWrapper(User user) {
		super(user.getUsername(), user.getPasswordHash(), AuthorityUtils.createAuthorityList());
		this.user = user;
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public String getPassword() {
		return user.getPasswordHash();
	}

}

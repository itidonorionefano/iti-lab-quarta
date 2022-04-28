package iti.quarta.gui;

public class LoginControllerImpl implements LoginController {

	private final LoginModel model;

	public LoginControllerImpl(final LoginModel model) {
		this.model = model;
	}

	@Override
	public boolean login(String username, String password, boolean rememberMe) {
		this.model.setUsername(username);
		this.model.setPassword(password);
		this.model.setRememberMe(rememberMe);
		return model.login();
	}
}

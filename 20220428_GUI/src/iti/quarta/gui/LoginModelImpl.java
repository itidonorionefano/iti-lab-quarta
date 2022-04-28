package iti.quarta.gui;

import java.util.Random;

public class LoginModelImpl implements LoginModel {

	@Override
	public void setUsername(String username) {
		// this.username = username;
	}

	@Override
	public void setPassword(String password) {
		// this.password = password;
	}

	@Override
	public void setRememberMe(boolean rememberMe) {
		// this.rememberMe = rememberMe;
	}

	@Override
	public boolean login() {
		Random random = new Random();
		return random.nextBoolean();
	}
}

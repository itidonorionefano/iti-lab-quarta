package iti.quarta.gui;

public interface LoginModel {
	void setUsername(String username);
	void setPassword(String password);
	void setRememberMe(boolean rememberMe);

	boolean login();
}

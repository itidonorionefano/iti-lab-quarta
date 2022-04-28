package iti.quarta.gui;

public class App {

	public static void main(String[] args) {
		final LoginModel model = new LoginModelImpl();
		final LoginController controller = new LoginControllerImpl(model);
		final LoginView view = new LoginViewImpl(controller);
		view.show();
	}

}

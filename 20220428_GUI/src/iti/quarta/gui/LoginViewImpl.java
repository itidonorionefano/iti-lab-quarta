package iti.quarta.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LoginViewImpl implements LoginView {

	private final LoginController controller;
	private final JFrame frame;

	public LoginViewImpl(final LoginController controller) {
		this.controller = controller;
		this.frame = new JFrame("School Login");
		this.setUp();
	}

	private void setUp() {
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Aggiungo il layout base che servirà per mettere tutti i componenti
		final JPanel borderLayout = new JPanel(new BorderLayout());
		borderLayout.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.frame.add(borderLayout);

		// Aggiungo al centro del mio borderLayout una griglia che contenga i campi di
		// testo
		final JPanel fieldsContainer = new JPanel(new GridLayout(3, 1));
		borderLayout.add(fieldsContainer, BorderLayout.CENTER);

		// Aggiungo i campi di testo
		final JTextField usernameField = new JTextField();
		fieldsContainer.add(usernameField);
		final JPasswordField passwordField = new JPasswordField();
		fieldsContainer.add(passwordField);

		// Aggiungo il layout orizzontale per il "remember me"
		final JPanel rememberMeContainer = new JPanel(new GridLayout(1, 2));
		fieldsContainer.add(rememberMeContainer);

		// Aggiungo quasi centrale l'etichetta e il checkbox
		final JLabel rememberMeLabel = new JLabel("Remember me");
		rememberMeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		rememberMeContainer.add(rememberMeLabel);
		final JCheckBox rememberMeCheckbox = new JCheckBox();
		rememberMeContainer.add(rememberMeCheckbox);

		// Aggiungo il bottone al borderlayout
		final JButton button = new JButton("Login");
		borderLayout.add(button, BorderLayout.SOUTH);
		// Aggiungo l'azione al bottone
		button.addActionListener(actionListener -> {
			String username = usernameField.getText();
			String password = String.valueOf(passwordField.getPassword());
			boolean rememberMe = rememberMeCheckbox.isSelected();
			if (this.controller.login(username, password, rememberMe)) {
				JOptionPane.showMessageDialog(null, "Login Successful", "INFO", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Error", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		});

		// comprimo al minimo l'interfaccia e la mostro
		this.frame.pack();
		this.frame.setMinimumSize(this.frame.getSize());
	}

	@Override
	public void show() {
		this.frame.setVisible(true);
	}

}

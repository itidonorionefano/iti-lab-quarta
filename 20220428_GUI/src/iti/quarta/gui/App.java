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

public class App {

	public static void main(String[] args) {
		
		// Imposto la scala per vedere meglio la mia interfaccia, questo non funzionerà su linux.
		System.setProperty("sun.java2d.uiScale", "1.5");
		
		// Inizializzo il frame e ci metto dentro il mio BorderLayout
		final JFrame frame = new JFrame("School Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Aggiungo il layout base che servirà per mettere tutti i componenti
		final JPanel borderLayout = new JPanel(new BorderLayout());
		borderLayout.setBorder(new EmptyBorder(10, 10, 10, 10));
		frame.add(borderLayout);
		
		// Aggiungo al centro del mio borderLayout una griglia che contenga i campi di testo
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
			JOptionPane.showMessageDialog(null, "Sending data...", "INFO", JOptionPane.INFORMATION_MESSAGE);
		});
		
		// comprimo al minimo l'interfaccia e la mostro
		frame.pack();
		frame.setMinimumSize(frame.getSize());
		frame.setVisible(true);
	}

}

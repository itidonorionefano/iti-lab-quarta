package iti.quarta.slider;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class App {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel borderLayout = new JPanel(new BorderLayout());
		frame.add(borderLayout);
		JPanel verticalLayout = new JPanel(new GridLayout(2, 1));
		borderLayout.add(verticalLayout, BorderLayout.CENTER);

		JSlider slider = new JSlider(0, 10);
		JLabel label = new JLabel(String.valueOf(slider.getValue()));
		label.setHorizontalAlignment(JLabel.CENTER);

		slider.addChangeListener(l -> {
			Thread thread = new Thread(() -> {
				slider.setEnabled(false);
				try {
					Thread.sleep(5000);
					label.setText(String.valueOf(slider.getValue()));
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					slider.setEnabled(true);
				}
			});
			thread.run();

		});

		verticalLayout.add(label);
		verticalLayout.add(slider);

		frame.pack();
		frame.setVisible(true);
	}

}

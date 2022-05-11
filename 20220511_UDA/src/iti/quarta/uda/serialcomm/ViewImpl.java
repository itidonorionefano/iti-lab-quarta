package iti.quarta.uda.serialcomm;

import java.text.DecimalFormat;

public class ViewImpl implements View {

	private double temperature;

	// TODO: remove this draw method, use a real GUI in Swing to show the value.
	private void draw() {
		System.out.println("Temperature:\t" + new DecimalFormat("#.##").format(temperature));
	}

	@Override
	public void setTemperature(final double temperature) {
		this.temperature = temperature;
		draw();
	}

}
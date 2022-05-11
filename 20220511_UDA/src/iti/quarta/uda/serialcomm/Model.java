package iti.quarta.uda.serialcomm;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public abstract class Model implements Runnable {
	private final PropertyChangeSupport changeListener = new PropertyChangeSupport(this);
	private double temperature;

	public Model(final PropertyChangeListener listener) {
		this.changeListener.addPropertyChangeListener(listener);
		new Thread(this).run();
	}

	protected void setTemperature(final double temperature) {
		changeListener.firePropertyChange("temperature", this.temperature, temperature);
		this.temperature = temperature;
	}
}

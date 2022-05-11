package iti.quarta.uda.serialcomm;

import java.beans.PropertyChangeListener;
import java.util.Random;

public class ModelImpl extends Model {

	public ModelImpl(PropertyChangeListener listener) {
		super(listener);
	}

	@Override
	public void run() {
		Random random = new Random();
		while (true) {
			// TODO: here the model should update by itself using jSerialComm
			// Examples can be found in library wiki.
			this.setTemperature(random.nextInt(41) + random.nextDouble());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

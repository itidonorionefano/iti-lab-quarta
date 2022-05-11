package iti.quarta.uda.serialcomm;

import java.beans.PropertyChangeEvent;

public class ControllerImpl implements Controller {

	private final View view;

	public ControllerImpl() {
		this.view = new ViewImpl();
		new ModelImpl(this);
	}

	@Override
	public void propertyChange(PropertyChangeEvent changeEvent) {
		this.view.setTemperature(Double.valueOf(String.valueOf(changeEvent.getNewValue())));
	}

}

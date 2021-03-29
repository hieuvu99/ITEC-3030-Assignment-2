package itec3030.assignments.a2;

import itec3030.smarthome.standards.*;

public abstract class OurFurnace implements Furnace {

	private ControllerInterface controllerinterface;
	private String ID;
	public boolean isOn;

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		isOn = false;
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		isOn = true;
	}

	@Override
	public boolean enabled() {
		// TODO Auto-generated method stub
		return isOn;
	}

	@Override
	public ControllerInterface getController() {
		// TODO Auto-generated method stub
		return controllerinterface;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	@Override
	public void setController(ControllerInterface ci) {
		// TODO Auto-generated method stub
		controllerinterface = ci;
	}

	@Override
	public void setID(String id) {
		// TODO Auto-generated method stub
		ID = id;
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return isOn;
	}

	@Override
	public abstract void turnOff();
		
	

	public abstract void turnOn();
		
	
	
}

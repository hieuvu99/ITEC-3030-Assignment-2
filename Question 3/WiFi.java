package itec3030.assignments.a2;

public class WiFi extends AddOnDecorator {

	public WiFi(OurFurnace furnace) {
		super.furnace = furnace;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("WiFi: Shutting down. ");
		this.furnace.turnOff();
	}

	@Override
	public void turnOn() {
		System.out.println("WiFi: Initialized. ");
		this.furnace.turnOn();
		
		
	}
	
}

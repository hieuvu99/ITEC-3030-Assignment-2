package itec3030.assignments.a2;

public class Humidifier extends AddOnDecorator {

	public Humidifier(OurFurnace furnace) {
		super.furnace = furnace;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Humidifer: Off. ");
		this.furnace.turnOff();
	}

	@Override
	public void turnOn() {
		System.out.println("Humidifer: On. ");
		this.furnace.turnOn();
		
		
	}
	
}

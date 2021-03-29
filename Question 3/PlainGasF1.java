package itec3030.assignments.a2;


public class PlainGasF1 extends OurFurnace {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("PlainGasF1: Up and Running. ");
		enable();
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("PlainGasF1: Turning off. ");
		disable();
	}
	
	

}

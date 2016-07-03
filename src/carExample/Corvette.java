package carExample;

public class Corvette extends Car implements Automotive, Vehicle {
	
	@Override
	public void dance() {
		
		
	}
	
	public void style(){
		
	}

	@Override
	public void moved() {
		//TODO Auto-generated method stub
		drive();
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		int time = in.nextInt();
		carFunctions.drive(speed, time);
	}

}

package carExample;

import carExample.SpyCar;

public class JamesBondSpyCar extends SpyCar implements Boat, AirCraft{

	private int status;
	
	public JamesBondSpyCar(){
		
		carFunctions = new SpyCarFunctionsImpl();
		carFunctions.lockCar();
		carFunctions = new CarFunctionsImpl();
		carFunctions.lockCar();
		SpyCarFunctions spyCarFunctions = (SpyCarFunctions)carFunctions;
		spyCarFunctions.presentWine();
	}
	
	@Override
	public void moved() {

		switch(status){
		
		case 1: drive();
		
		case 2: floatOnWater();
		
		case 3: fly();
		
		default: break;
		}
	}

	@Override
	public void floatOnWater() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		int time = 0;
		
		carFunctions.drive(speed, time);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	
	public void dance() {
		// TODO Auto-generated method stub

	}
}

package carExample;

public class CarFunctionsImpl implements CarFunctions {

	private Car car;
	
	@Override
	public void drive(int speed, int time) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public Integer accelerate(float seconds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer brake(float seconds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean lockCar() {
		// TODO Auto-generated method stub
		return false;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}

package carExample;

public interface CarFunctions {
		
	public int var =1;
	
	
	//Determines the distanced traveled
	public void drive(int  speed, int time);
	
	//Gives out the new distance traveled of the car and sets new speed
	public Integer accelerate(float seconds);
	
	//Gives out the new distance traveled of the car and sets new speed
	Integer brake(float seconds);
	
	//locks and unlocks car
	public boolean lockCar();
}

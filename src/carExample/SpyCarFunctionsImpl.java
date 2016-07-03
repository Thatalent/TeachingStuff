package carExample;

public class SpyCarFunctionsImpl extends CarFunctionsImpl implements SpyCarFunctions{

	private SpyCar spyCar;
	
	//Sets and returns status of snow tires
	@Override
	public boolean autoSnowFlow(){
		
		return  false;
	}

	@Override
	public boolean quickOilSpill() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean presentWine() {
		// TODO Auto-generated method stub
		return false;
	}

	public SpyCar getSpyCar() {
		return spyCar;
	}

	public void setSpyCar(SpyCar spyCar) {
		this.spyCar = spyCar;
	}
	
	@Override
	public boolean lockCar(){
		return false;
		
	}
}

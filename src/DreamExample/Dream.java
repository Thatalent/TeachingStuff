package DreamExample;

public class Dream {

	Dream dreamObject;
	private static final int dreamLimit = 10;
	private int dreamCount;
	
	public Dream(){

		if (this.dreamCount<dreamLimit){
			
			if(Math.random()<0.50){
				
				dreamObject= new Dream(this.dreamCount);
			}
		}
	}
	
	private Dream(int dreamCount) {
		
		this.setDreamCount(++dreamCount);
		
		if (this.getDreamCount()<dreamLimit){
			
			if(Math.random()<0.50){
				
				dreamObject= new Dream(this.getDreamCount());
			}
		}
	}
	
	public Dream(int dreamCount, int dreamLimit) {

		this.setDreamCount(dreamCount);

		if(dreamCount<dreamLimit){
			
			this.dreamObject = new Dream(++dreamCount, dreamLimit);
		}
	}
	
	static public int findNoDreams(Dream dream){
		
		int noDreams = 0;
		
		if(dream.dreamObject != null){
			noDreams = findNoDreams(dream.dreamObject);
		}
		
		return ++noDreams;
	}
	
	static public Dream findDreamWithoutDreams(Dream dream){
		
		Dream noDreams = null;
		
		if(dream.dreamObject != null){
			
			noDreams = findDreamWithoutDreams(dream.dreamObject);
		}
		
		return noDreams;
	}
	
	public int getDreamCount(){
		return this.dreamCount;
	}
	
	public void setDreamCount(int dreamCount){
		this.dreamCount = dreamCount;
	}
}

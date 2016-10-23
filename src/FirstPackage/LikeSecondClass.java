package FirstPackage;

public class LikeSecondClass {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		boolean c = true;
		
		System.out.println(findTheReminder(b, a));
		
	}

	static public boolean areTheyTheSame (int a, int b){
		return a == b;
	}
	
	static public boolean areTheyNotTheSame(int a, int b){
		return a != b;
	}
	
	static public boolean isItEven(int a){
		return a % 2 == 0;
	}
	
	static public boolean doesItDivdeEvenly(int a, int b){
		return a % b == 0;
	}
	
	static public boolean areTheyBothTrue(boolean a, boolean b){
		return a && b;
	}
	
	static public boolean areEitherOfThemTrue(boolean a, boolean b){
		return a || b;
	}
	
	static public int addThemUp (int a, int b){
		return a += b;
	}
	
	static public int subtractThem(int a, int b){
		return a -= b;
	}
	
	static public int multipleThem(int a, int b){
		return a *= b;
	}
	
	static public float divideThem(float a, float b){
		return a /= b;
	}
	
	static public int findTheReminder(int a, int b){
		return a %= b;
	}
}

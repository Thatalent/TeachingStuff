package Variable.Practice;

public class VariablePractice1 {
	
	//For problem 5
	static int changingNumber = 26;
	
	//1. Create a field variable that is equal to 2,147,483,648
	// this is an example of a field variable:
	static long fieldVariable = 2147483648l;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. identify and resolve the error with this segment of code
		
		int run = 9;
		
		System.out.println(run);

		//3. Change the variable name into a readable version of the same context
		
		String thisisaverylongnamethatidonotunderstand = "Long Name is What?";
		
		//4. assign an appropriate value to each variable
		
		char a;
		
		int i = 7;
		
		short s = 1;
		
		long l = 12345678l;
		
		String kidney = "kidney";
		
		double d = 2.5;
		
		float f = 10;
		
		//5. This is how you create an object:
		
		VariablePractice1 varPrac = new VariablePractice1();
		System.out.println(varPrac.fieldVariable);
		
		//change the field changingNumber to the value of 26;
		
		//6. Print out the sum of changingNumber and fieldVaraible using System.out.println()
		
		long sum = fieldVariable + changingNumber;
		
		System.out.println(sum);
	}

}

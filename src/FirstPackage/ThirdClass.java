package FirstPackage;

import java.util.Scanner;

public class ThirdClass {

	public static void main(String[] args) {

		Scanner input  = new Scanner(System.in);
		
		int intgerInput;
		try
		{
			takeInInteger();
		}
		catch(NumberFormatException e)
		{
			System.out.println("You did not input a number.");
		}
	}
	
	private static void takeInInteger() {
		// TODO Auto-generated method stub
		
	}

	public static int takeInIntger(Scanner input, int intgerInput)
	{	
		String firstInput = input.nextLine();

		int integerInput = Integer.parseInt(firstInput);

		return integerInput;
	}

}

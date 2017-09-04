package FirstPackage;

import java.util.Scanner;

public class ThirdClass {

	public static void main(String[] args) {

		//this allows the user to input into the console at the bottom
		Scanner input  = new Scanner(System.in);
		
		int numberOfTimesItWillRepeat = OOP.SolidClass.how_Many_Times_Will_It_Repeat(input);
		
		for(int i = 0; i < numberOfTimesItWillRepeat;/*add a condition so that the loop repeats the same number of times as numberOfTImesItWillRepeat.*/ i++){
		boolean userGaveNumber = true;
		
		int integerInput = 0;
		
		// while (the condition inside is true) { repeat what is inside of here }
		while(userGaveNumber)
		{
			
			//this is the 'try' block. If an exception is thrown here it can be handled by the 'catch' block.
			try
			{
				integerInput = takeInInteger(input, integerInput);
				userGaveNumber = false;
			}
			
			//this is a 'catch' block. By placing an exception in the '()' you can run code based on it's response to an error instead of letting your code break.
			catch(NumberFormatException e)
			{
				System.out.println("You did not input a number.");
			}
//			//catch the two remaining exceptions in from the method takeInInteger(Scanner input, int integerInput)
//			
//			
//			catch(/*place the exception in here*/)
//			{
//				System.out.println("You did not input a number.");
//			}
//			catch(/*place the exception in here*/)
//			{
//				System.out.println("Oh no, something happened!!! :o");
//			}
	}
//		
//		if the condition in the '()' is true then the code inside the '{}' will be run.
		if(integerInput == 0)
		{
			System.out.println("You didn't change the value you jerk!");
		}
		
//		else if(/*Add a condition here*/)
//		{
//			//Print out a message based on your condition here.
//		}
//		
		
		else
		{
			//Print out another statement here
		}
		
		}
	}
	
	
	/** <p>Hey read me. :D <p>
	 * 
	 * Used to take in an integer from the user. 
	 * Can throw three possible exceptions due to the methods {@link #nextLine()} and {@link #parseInt()}
	 * 
	 * @param input
	 * @param integerInput
	 * @return integerInput
	 * @throws NumberFormatException
	 */
	/*By stating that this method can throw a certain exception you can catch that exception in the a 'catch' block
	If you place a ',' after an exception, you can list another exception to be thrown
	Add the remaining two exceptions to the throws statement */
	public static int takeInInteger(Scanner input, int integerInput) throws NumberFormatException
	{	
		System.out.println("Please input an integer and press 'Enter/Return' on your keyboard.");
		
		//this can throw two exceptions
		String firstInput = input.next();

		//this can throw one exception
		integerInput = Integer.parseInt(firstInput);

		return integerInput;
	}

}

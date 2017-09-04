package OOP;

import java.util.Scanner;

public class SolidClass {
	
	public static int how_Many_Times_Will_It_Repeat(Scanner input)
	{
		int numberOfTimesItWillRepeat = 0;
		while(numberOfTimesItWillRepeat == 0){
		try
		{
			System.out.println("Input an integer and press Enter.");
			numberOfTimesItWillRepeat = input.nextInt();
			if(numberOfTimesItWillRepeat > 0  && numberOfTimesItWillRepeat < 15 )
			{
			return numberOfTimesItWillRepeat;
			}
			
			else
				numberOfTimesItWillRepeat = 0;
				throw(new Exception());
		}
		catch(Exception e)
		{
			System.out.println("No good mate. Try again.");
		}
		}
		System.out.println("An error occurred. Program will not repeat.");
		return 0;
	}
	
//	public static void main(String[] args) {
//		
//		Scanner input  = new Scanner(System.in);
//		
//		System.out.println("Input a number:");
//		
//		int number_Of_Times_Looped = input.nextInt();
//		
//		for( int i = 0; i < number_Of_Times_Looped; i++)
//		{
//			System.out.println("This has printed out " + (i+1) + " number of times");
//		}
//	}

}

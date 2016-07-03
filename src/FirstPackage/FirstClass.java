package FirstPackage;

import java.util.Scanner;


public class FirstClass {

	static int integer;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int integer = input.nextInt();
		long longInteger = input.nextLong();
		short shortInteger = input.nextShort();
		boolean bool = input.nextBoolean();
		bool = input.nextBoolean();
		char character = input.next().charAt(0);
		//char characterA = 'Z';
		float floatNumbers= input.nextFloat();
		double doubles = input.nextDouble();
		byte bytes = input.nextByte();
		integer = (int)doubles;
		 
		int i = 9, fave = 2, life = 42;
		
		String variable = "variable";
		
		variable = input.nextLine();
		//int a_Number = characterA;
		//integer = FirstClass.integer + FirstClass.integer;
		
		
		//System.out.println(characterA);
		System.out.println(longInteger);
		System.out.println(integer);
		//System.out.println(a_Number);
		System.out.println(doubles);
		System.out.println(floatNumbers);
		System.out.println((int)character);
		System.out.println(bool);
		System.out.println(bytes);
		System.out.println(shortInteger);
		System.out.println(variable);

	}

}

package StringBuilderWork;

//Predict the out of this code (there are no errors)

public class FirstProblemSB {

	public static void main(String[] args){
		
		String str1= null;
		
		System.out.println(str1);
		
		str1 = str1 + null;
		
		StringBuilder strB1 = new StringBuilder(str1);
		
		strB1.append("a");
		System.out.println(strB1);
	}
}

package StringBuilderWork;

// Predict the outcome of this code (there are no errors)

public class SecondProblemSB {

	public static void main(String[] args){
		
		StringBuilder strB1 = new StringBuilder("foo"), strB2, strB3;
		
		String str1 = "goo", str2 = "abcd", str3 = "moo";
		
		strB2= new StringBuilder(str2.concat(str3));
		
		strB3= new StringBuilder(str1.substring(0, 1).concat(str3.substring(2, 3).concat(str2.substring(2, 4))));
		
		String[] strings = {strB1.toString(), str1, str2, strB3.toString().replace('o', '2')};
		
		strB1.append(strings[3].substring(2));
		
		System.out.println(strB1.toString() + strB2.toString());
	}
}

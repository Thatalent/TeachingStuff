package FirstPackage.If.Statements;

/**
 * Created by jdhudson on 9/28/17.
 */
public class If_Practice1 {

    public static void main(String[] args) {


        //1. Make the if statement print "even" to the console if int a is an even number.
        //hint. % is an operator that returns the reminder after dividing two integers

        int a = 0;

        if (){
            System.out.println();
        }
        else{
            System.out.println("odd");
        }

        //2. Create an if statement that prints assigns int b the product of (a + 10) times 2

        int b;


        //3. Without changing the if condition statements, change the code so that when num = 0 it prints "bbb"

        int num  = 0;

        if (num > 0)
            if (num < 10)
                System.out.println("aaa");
            else if (num == 10)
                System.out.println("");
            else
                System.out.println("bbb");


        //4. What value, when assigned to int start will cause int end to print out as 3?

        int start;

        int end;

        if(start++ == 3){
            end = start;
        }
        else if(++start < 1){
            end = start + 2;
        }
        else{
            end = ++start;
        }

        System.out.println(end);


        // 5. Assign int input a value that will cause int result to be equal to 5

        int input;

        int result;

        if (input++ > 1) {
            if (++input < 2) {
                result = ++input;
            }
            else if (--input > 2)
                if (input++ > 3)  result = ++input;
                else if (--input < 4)  result = ++input + 1;
                else if (input++ > 4)  result = input++;
                else  result = input + 1;
            else
                result = ++input;

        }
        else{
            if(input++ > 1){
                if(input-- >2)
                    if(++input < 3)
                        if(++input > 3) result = ++input;
                        else result = ++input + 1;
                    else if(input++ > 3)
                        if(input++ > 4) result = --input;
                        else if(input-- > 5) results = --input;
                        else result = 5;
                    else result = ++input;
            }
        }

        System.out.println(result);

    }
}

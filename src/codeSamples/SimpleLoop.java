import java.util.Scanner;

public class SimpleLoop {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Input number of iterations: ");

        int loop_number = input.nextInt();

        System.out.println("Using for loop with input");

        for(int i=0; i<loop_number; i++){

            System.out.println("Printing random number for iteration "+i+": "+(int)(Math.random()*10));
        }

        System.out.println("\nUsing while loop with input");

        int times_repeated = loop_number;
        while(times_repeated>0){

            System.out.println("Number of times repeated "+times_repeated+": Random number: "+(int)(Math.random()*10));

            --times_repeated;
        }

        System.out.println("\nUsing do-while loop with input");

        int counter = 0;
        do{
            System.out.println("Counted "+counter+" iterations in do while loop and print random number: "+(int)(Math.random()*10));
            ++counter;
        }
        while((int)(Math.random()*10) < loop_number || counter<loop_number);

        input.close();
    }
}

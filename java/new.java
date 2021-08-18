import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Problem2();
    }
public static void Problem2() {
		/*
		    Write a program that asks a number n-times.
		    Find the sum and average of all the inputed numbers.

		    Example:

		    System : "How many number that you want to count?"
		    User Input : 2
		    System : "Please input the 1 number: "
		    User Input: 10
		    System : "Please input the 2 number: "
		    User Input: 20
		    System : "Sum: 30 | Average: 15"
		*/

        int nNumber;
        int sum=0;
        double average=0;
        Scanner in = new Scanner(System.in);
        Scanner in1= new Scanner(System.in);
        do {
            System.out.print("How many number that you want to count? ");
            nNumber = in.nextInt();
            if (nNumber <= 0) {
                System.out.println("nNumber cannot be zero or negative!");
            }
        } while (nNumber <= 0);
        // Start your program here
        for(int i=1; i<=nNumber; i++){
         System.out.println("Please input the " +i+ " number: ");
         int nNumber1=in1.nextInt(); 
         sum=sum + nNumber1;
         average = (double) sum / nNumber;
         }
            System.out.println("Sum: " + sum + " | average: " + average);
   
        // End your program here
}
}

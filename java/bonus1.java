import java.util.Scanner;
public class main{
	public static void main(String[]args){
		BonusProblem1();
	}
	public static void BonusProblem1() {
		/*  Write a program to make a series of number
		
	    	rules:  the fourth number must be the sum of the first and third number
		            the fifth number must be the sum of the second number and fourth number, etc
		    input:  count, first number, second number, third number
		    
		
    		example: 
    		System: "enter number of series"
    		input: 8
    		System: "enter first number"
    		input: 1
    		System: "enter second number"
    		input: 2
            System: "enter third number"
            input: 3
            System: "series of number: 1,2,3,4,6,9,13,19"
		*/
		Scanner in = new Scanner(System.in);
        int nCount, firstNumber, secondNumber, thirdNumber,sumtot,forthNumber;

 
        System.out.print("Enter number of terms of series : ");
        nCount = in.nextInt();
        System.out.print("Enter the first number for the series: ");
        firstNumber = in.nextInt();
        System.out.print("Enter the second number for the series: ");
        secondNumber = in.nextInt();
        System.out.print("Enter the third number for the series: ");
        thirdNumber = in.nextInt();
        
        System.out.print(firstNumber + " , " + secondNumber + " , " + thirdNumber + " , ");
       sumtot=0;
	   forthNumber=4;
        for(int i = 4; i <= nCount; i++){
				System.out.print(sumtot+", ");
				sumtot= thirdNumber+firstNumber;
				forthNumber=sumtot;
        }
		System.out.println("");
		}
	}

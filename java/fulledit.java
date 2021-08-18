/**
 * IS184203-Genap-2019/20 - Computing Lab. Work
 * Name of Project  : Module 02
 * Student ID       : 05211940000102
 * Student Name     : ZAINAL ABIDIN
 * Class            : B
 * Submission Date  : dd-mm-yyyy
 */

/**
 * 
 * NEVER DO 'COPY-PASTE' WHILE YOU ARE CODING
 * 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   	    //Problem1();
		//Problem2();
		Problem3();
		//BonusProblem();     
		//BonusProblem1();     
    }
    
    public static void Problem1() {
        /**
        buatah program dengan output sebagai berikut:
        dengan input n sebagai tinggi segitiga
        
        contoh:
        System : "berapa tinggi segitiga?"
		User Input : 5
		System :
        
        *
        **
        ***
        ****
        *****
        
        */
        
        // Start your program here
        System.out.println("berapa tinggi segitiga?");
		Scanner input= new Scanner(System.in);
		int user=input.nextInt();
		for(int i=1;i<=user;i++){
		for(int j=1; j<=i;j++){
			System.out.print("*");
		}	
			System.out.println();
		}
        
        // End your program here
        
		separator();
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
		Scanner in = new Scanner(System.in);
		do {
		    System.out.print("How many number that you want to count? ");  
            nNumber = in.nextInt();
            if(nNumber <= 0)
            {
                System.out.println("nNumber cannot be zero or negative!");
            }
		} while (nNumber <= 0);
		
		// Start your program here
		int sum=0;
		double average=0;
		Scanner in1= new Scanner(System.in);
		for(int i=1; i<=nNumber;i++){
			System.out.println("Please input the "+i+" number: ");
			int nNumber1=in1.nextInt();
			sum=sum+nNumber1;
			average=(double)sum/nNumber;
		}
		System.out.println("Sum: "+sum+" | Average: "+average);
        // End your program here
        
        separator();
	}
	
	public static void Problem3() {
		/*
		    Buatlah program yang mengeluarkan nilai GANJIL
		    muali dari angka 1 sampai dengan n
		    
		    nilai n didapat dari scanner
		    
		    Example:
		    
		    System : "Enter number of series: "
		    User Input : 7
		    System : "Genap(0) atau Ganjil(1): "
            User Input : 1
		    System : "7 odd numbers: 1 3 5 7 9 11 13"

		*/
		Scanner in = new Scanner(System.in);
		// Start your program here
		System.out.println("Enter number of series");
 		 int user1=in.nextInt();
 		  System.out.println("Genap(0) atau Ganjil(1)");
 		int user2=in.nextInt();
		if(user2==0){
			int i;
			for(i=0;i<user1*2;i+=2){
			System.out.print(i+" ");
			}
		}
		else if(user2==1){
			int j;
			for(j=1;j<user1*2;j+=2){
			System.out.print(j+" ");
			}
		}
		System.out.println();
        // End your program here
        
        separator();
	}
	public static void BonusProblem() {
	    /*
	        Use some simple loops to generate all possible coordinates from (0,0) up to (5,5).
	        
	        Output: 
	        
	        (0,0) (0,1) (0,2) (0,3) (0,4) (0,5)
            (1,0) (1,1) (1,2) (1,3) (1,4) (1,5)
            (2,0) (2,1) (2,2) (2,3) (2,4) (2,5)
            (3,0) (3,1) (3,2) (3,3) (3,4) (3,5)
            (4,0) (4,1) (4,2) (4,3) (4,4) (4,5)
            (5,0) (5,1) (5,2) (5,3) (5,4) (5,5)
	    */
	   for(int a=1;a<=5;a++){
	   for(int b=1;b<=5;b++ ){
	   System.out.print(" (" + a + "," + b + ") ");
				}
	   System.out.println(" ");
				}
	   separator();
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
        
        int nCount, firstNumber, secondNumber, thirdNumber;

 
        System.out.print("Enter number of terms of series : ");
        nCount = in.nextInt();
        System.out.print("Enter the first number for the series: ");
        firstNumber = in.nextInt();
        System.out.print("Enter the second number for the series: ");
        secondNumber = in.nextInt();
        System.out.print("Enter the third number for the series: ");
        thirdNumber = in.nextInt();
        
        System.out.print(firstNumber + " " + secondNumber + " " + thirdNumber + " ");
       
 
        for(int i = 4; i <= nCount; i++)
        {
           int x= thirdNumber+firstNumber;
		   firstNumber=secondNumber;
		   secondNumber=thirdNumber;
		   x=thirdNumber;
		   
        }
        
        separator();
	}
	
	public static void separator(){
	    System.out.println("------------------------------- " );
	    System.out.println();
	}
}

/**
 * DECLARATION OF ORIGINAL WORK
 * I, hereby declare that the code is my original work. 
 * I have honored the principles of academic integrity and have upheld 
 * ITS''s  Student Code of Academic in the completion of this work.
 */

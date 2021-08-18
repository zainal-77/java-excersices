import java.util.Scanner;
public class Session2 {
	public static void main(String [] args){
		//Problem1();
		//Problem1B();
		//Problem2();
		//Problem3();
		//Problem3B();
	BonusProblem();}
	//BonusProblem1();	
    public static void Problem1() {
        System.out.println("Problem 1 " );
		// Write a program to count the sum of the first n natural number
		int nNumber = 0;
		int sum = 0;
		
		// Buat scanner
		Scanner in = new Scanner(System.in);
		// Tanya user tentang input
        System.out.print("Input number: ");
        // Mengambil input dari user
        nNumber = in.nextInt();
        
        // Start your program here
        for(int i=1; i<=nNumber; i++){
            // Jumlahkan ke variable sum
            sum+=i;
        }
        // End your program here
        
		System.out.println("The Sum of Natural Number upto " + nNumber + " terms : " + sum);
	}
	public static void Problem1B() {
        System.out.println("Problem 1B " );
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
        System.out.print("Berapa tinggi segitiga: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // First loop for vertical axis
        for(int i = 1; i<=n; i++) {
            // Second loop for horizontal axis
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // End your program here
	}
	public static void Problem2() {
	    System.out.println("Problem 2 " );
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
		int inputNumber;
		double sum = 0;
		
		// Loopin n-kali untuk menanyakan angka dari user
		for(int i=1; i <= nNumber; i++) {
		    // Menyanyakan input dari user
		    System.out.print("Please input the "+i+" number: ");
		    inputNumber = in.nextInt();
		    // Menjumlahkan angka yang dimasukkan user ke variable sum
		    sum += inputNumber;
		}
		
		// Menghitung rata-rata setelah kita telah memiliki sum-nya
		double avg = sum/nNumber;
		System.out.println("Sum: " + sum + " | Average: " + avg);
        // End your program here
        
	}
	
	public static void Problem3() {
		System.out.println("Problem 3 " );
		/*
		    Write a program to make fibonacci series
		    
		    Example:
		    
		    System : "Enter number of series: "
		    User Input : 7
]
:/
		*/
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of series: ");
		int nCount = in.nextInt();
		
		int firstNumber = 0;
		int secondNumber = 1;
		
		System.out.print("Fibonacci Series of "+ nCount +" numbers: ");
		System.out.print(firstNumber + " " + secondNumber);
		// Start your program here
		int nextNumber;
		for(int i = 3; i<=nCount; i++) {
		    nextNumber = firstNumber + secondNumber;
		    System.out.print(" "+nextNumber);
		    firstNumber = secondNumber;
		    secondNumber = nextNumber;
		}
		
		
        // End your program here
        
	}
	public static void Problem3B() {
	    System.out.println("Problem 3B " );
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
		System.out.print("Enter number of series: ");
		int nCount = in.nextInt();
		System.out.print("Genap(0) atau Ganjil(1): ");
		int choice = in.nextInt();
		
		// BACA TERNARY / SHORTHAND BIAR PAHAM
		System.out.print(choice == 0 ? nCount + " even numbers: " : nCount + " odd numbers: ");
	
	    
		for(int i = 0; i < nCount;i++) {
		    // Rumus genap
    		if(choice == 0) {
    		    System.out.print( 2*i );
    		} else {
    		    // Rumus ganjil
    		    System.out.print( 2*i+1 );
    		}
		}
		
        // End your program here
	}
	public static void BonusProblem() {
	    System.out.println("Bonus Problem " );
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
	  for(int i = 0; i<=5; i++){
	      for(int j=0; j<=5; j++){
	          System.out.print("("+i+","+j+") ");
	      }
	      System.out.println("");
	  }
	}
	public static void BonusProblem1() {
	    System.out.println("Bonus Problem 1 " );
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
        
        System.out.print("Series of number: " + firstNumber + "," + secondNumber + "," + thirdNumber);
       
        int nextNumber;
 
        for(int i = 4; i <= nCount; i++)
        {
            nextNumber = firstNumber + thirdNumber;
            System.out.print(","+nextNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = nextNumber;
        }
        
	}
}
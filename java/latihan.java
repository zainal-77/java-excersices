/**
 * IS184203-Genap-2019/20 - Computing Lab. Work
 * Name of Project  : Module 03
 * Student ID       : Your NRP here
 * Student Name     : Your Full Name Here
 * Class            : Your Class here
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
   	    Problem1();
		Problem2();
		Problem3();
    }
    /*
        Problem 1
        Make a program to print the contents of the array from the front and back.
        Example:
        Array = {"A","B","C","D","IUP"}
        Output 1 = A B C D IUP
        Output 2 = IUP D C B A
     */
     
    // Your code here
     public static void Problem1(){
		String [] Array= {"A","B","C","D","IUP"};
		for (int i=0; i< Array.length;i++){
			System.out.print(Array[i]+" ");
		}
		System.out.println();
		 for (int j= Array.length-1; j>=0;j--){
			 System.out.print(Array[j]+" ");
		 }
	 }
    /* 
        Problem 2
        Make a program to check whether a string is a palindrome or not.
        Example 1:
        Input : "wasitacaroracatisaw"
        Output : The String is palindrome
        Example 2:
        Input : "Hello World"
        Output : The String is not palindrome
        
     */
     
    // Your code here
     public static void Problem2(){
		 Scanner kamu= new Scanner(System.in);
		 String check="";
		 System.out.println("ENTER SAYANGKU");
		 String str= kamu.nextLine();
		 int banyak= str.length();
		 for(int i=banyak-1; i>=0;i--){
			 check= check+str.charAt(i);
		 }
		 if(str.equals(check)){
		 System.out.println("POLINDROME SAYANG");}
		 else{System.out.println("BUKAN SAYANG");}
		 separator();
		 }
		 
    /*
        Problem 3
        Make a program to capitalize the first letter of each word in the input sentence.
        Example:
        Input : "alice in wonderline"
        Output : "Alice In Wonderline"
     */
     
    // Your code here
     public static void Problem3(){
		 Scanner sayang= new Scanner(System.in);
		 System.out.println("ketik sayangku");
		 String judul= sayang.nextLine();
		 char y[]=judul.toCharArray();
		 int size= judul.length();
		 y[0]= (char)(y[0]-32);
		 int i=1;
		 while(i!=size){
			 if(y[i]==' '){
				 y[i+1]=(char) (y[i+1]-32);}
				 i++;
			 }
			System.out.println(y);
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

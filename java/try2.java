/**
 * IS184203-Genap-2019/20 - Midterm Test
 * Name of Project  : Midterm Test
 * Student ID       : 05211940000102
 * Student Name     : Zainal Abidin
 * Class            : B
 * Submission Date  : 30-03-2020
 */

/**
 * 
 * NEVER DO 'COPY-PASTE' WHILE YOU ARE CODING
 * 
 */
 
import java.util.Scanner;

public class MidtermTest {
public static void main(String [] args){
        System.out.println("Midterm Test");
        Scanner input=new Scanner(System.in);
		System.out.println("COVID-19  RISK SELF-ASSESMNET PROGRAM");
		System.out.print("##################################################");
		System.out.println();
		System.out.print("What is your name?");
		String name= input.nextLine().toLowerCase();
		System.out.print("Are you (M)ale or (W)omen?");
		String Gender=input.nextLine().toLowerCase();
	    System.out.print("Are you married? (Y)es or (N)o");
		String userchoice1=input.nextLine();
		System.out.print("How old are you?");
		int userchoice3=input.nextInt();
		System.out.print("##################################################");
		System.out.println();
		
		String jawab = "";
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Have you recently traveled to an area with known local spread of COVID-19?");
        jawab = sc.nextLine();
        if(jawab.equals("Y") || jawab.equals("y")) {
            score += 1;
        }
        System.out.println("Have you come into close contact (within 6 feet) with someone who has a laboratory "
                + "confirmed COVID - 19 diagnosis in the past 14 days?");
        jawab = sc.nextLine();
        if(jawab.equals("Y") || jawab.equals("y")) {
            score += 1;
        }
        System.out.println("Do you have a fever (greater than 100.4 F or 38.0 C) OR symptoms of lower respiratory "
                + "illnes such as cough, shortness of breath, difficulty breathing or sore throat?");
        jawab = sc.nextLine();
        if(jawab.equals("Y") || jawab.equals("y")) {
            score += 1;
        }
        System.out.println("Are you a first responder, healthcare worker, or employee or attendee of a child or "
                + "adult care facility?");
        jawab = sc.nextLine();
        if(jawab.equals("Y") || jawab.equals("y")) {
            score += 1;
        }
        
        
		System.out.print("##################################################");
		System.out.println();
        System.out.println("\nDear "+name+" ("+Gender+"/"+userchoice1+"/"+userchoice3+"),\n");
        System.out.println("Our recommendation is:");
        if(score>=3){
        System.out.println("\"You may need COVID-19 testing.\"");
        }
        else if(score==2){
        System.out.println("\"You may need COVID-19 testing OR self-quarantine at home OR your symptoms may or may not be related to COVID-19.\"");
        }
        else if(score==1){
        System.out.println("\"selfquarantine at home.\"");
            }
        else if(jawab.equals("Y")){
        System.out.println("\"your symptoms may or may not be related to COVID-19.\"");
            }
        else if(!jawab.equals("Y")){
        System.out.println("\"practice social distancing and watch for symptoms\"");
            }
        else{
        System.out.println("\"practice social distancing and watch for symptoms.\"");
        }
        
        System.out.println("\nBe Safe!\nThank you.");

    }
    
}
/*
 * DECLARATION OF ORIGINAL WORK
 * I, hereby declare that the code is my original work. 
 * I have honored the principles of academic integrity and have upheld 
 * ITS''s  Student Code of Academic in the completion of this work.
 */
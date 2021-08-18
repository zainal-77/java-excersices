/**
 * IS184203-Genap-2019/20 - Midterm Test
 * Name of Project  : Midterm Test
 * Student ID       : 05211940000001
 * Student Name     : Yoga Cahya Romadhon
 * Class            : A
 * Submission Date  : 30-03-2020
 */

/**
 * 
 * NEVER DO 'COPY-PASTE' WHILE YOU ARE CODING
 * 
 */
 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Midterm Test");
        Scanner input = new Scanner(System.in);
        String name;
        char gender,married;
        int age,score=0;
        char[] answer = new char[4];
        System.out.println("COVID-19 Risk Self-assessment Program");
        separator();
        
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.print("Are you (M)ale or (F)emale? ");
        gender = input.nextLine().toUpperCase().charAt(0);
        System.out.print("Are you married? (Y)es or (N)o? ");
        married = input.nextLine().toUpperCase().charAt(0);
        System.out.print("How old are you? ");
        age = Integer.parseInt(input.nextLine());
        separator();
        
        System.out.println("\nPlease kindly answer the following questions:\n");
        System.out.print("1. Have you recently traveled to an area with known local spread of COVID-19? (Y)es or (N)o? ");
        answer[0]=input.nextLine().toUpperCase().charAt(0);
        if(answer[0]=='Y'){
            score++;
        }
        System.out.print("2. Have you come into close contact (within 6 feet) with someone who has a laboratory confirmed COVID - 19 diagnosis in the past 14 days? (Y)es or (N)o? ");
        answer[1]=input.nextLine().toUpperCase().charAt(0);
        if(answer[1]=='Y'){
            score++;
        }
        System.out.print("3. Do you have a fever (greater than 100.4 F or 38.0 C) OR symptoms of lower respiratory illness such as cough, shortness of breath, difficulty breathing or sore throat? (Y)es or (N)o? ");
        answer[2]=input.nextLine().toUpperCase().charAt(0);
        if(answer[2]=='Y'){
            score++;
        }
        System.out.print("4. Are you a first responder, healthcare worker, or employee or attendee of a child or adult care facility? (Y)es or (N)o? ");
        answer[3]=input.nextLine().toUpperCase().charAt(0);
        if(answer[3]=='Y'){
            score++;
        }
        System.out.println();
        separator();
        
        System.out.println("\nDear "+name+" ("+gender+"/"+married+"/"+age+"),\n");
        System.out.println("Our recommendation is:");
        if(score>=3){
            System.out.println("\"You may need COVID-19 testing.\"");
        }
        else if(score==2){
            System.out.println("\"You may need COVID-19 testing OR self-quarantine at home OR your symptoms may or may not be related to COVID-19.\"");
        }
        else if(score==1){
            if(answer[0]=='Y'||answer[1]=='Y'){
                System.out.println("\"selfquarantine at home.\"");
            }
            else if(answer[2]=='Y'){
                System.out.println("\"your symptoms may or may not be related to COVID-19.\"");
            }
            else if(answer[3]=='Y'){
                System.out.println("\"practice social distancing and watch for symptoms\"");
            }
        }
        else{
            System.out.println("\"practice social distancing and watch for symptoms.\"");
        }
        System.out.println("\nBe Safe!\nThank you.");
        separator();
    }
    
    public static void separator(){
        System.out.println("######################################################################");
    }
}    
    

/**
 * DECLARATION OF ORIGINAL WORK
 * I, hereby declare that the code is my original work. 
 * I have honored the principles of academic integrity and have upheld 
 * ITS''s  Student Code of Academic in the completion of this work.
 */
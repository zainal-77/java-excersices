import java.util.Scanner;

public class MidtermTest {
public static void main(String [] args){
	
	//INFORMASI BIODATA TERKAIT:
        System.out.println("Midterm Test");
        Scanner input=new Scanner(System.in);
		System.out.println("\nCOVID-19  RISK SELF-ASSESMNET PROGRAM");
		
		PEMISAH();

		System.out.print("What is your name? ");
		String nama=input.nextLine();
		System.out.print("Are you (M)ale or (W)omen? ");
		char Gender=input.nextLine().toUpperCase().charAt(0);
	    System.out.print("Are you married? (Y)es or (N)o? ");
		char Status=input.nextLine().toUpperCase().charAt(0);
		System.out.print("How old are you? ");
		int umur=input.nextInt();

		PEMISAH();
		System.out.println();
	
	//JAWABAN MENGENAI KONDISI DARI USER:
		System.out.println("Please kindly answer the following questions:\n");
		char [] jawab=new char[4];
		int score=0;
		Scanner sc=new Scanner(System.in);

	//1
		System.out.print("1.Have you recently traveled to an area with known local spread of COVID-19?\n(Y)es or (N)o ? ");
		jawab[0]=sc.nextLine().toUpperCase().charAt(0);
		if(jawab[0]=='Y'){
			score+=1;
		}
	//2
		System.out.print("2.Have you come into close contact (within 6 feet) " 
		+"with someone who has a\n laboratory confirmed COVID-19 diagnosis in the past 14 days?\n(Y)es or (N)o? ");
		jawab[1]=sc.nextLine().toUpperCase().charAt(0);
		if(jawab[1]=='Y'){
			score+=1;
		}
	// 3
		System.out.print("3.Do you have a fever (greater than 100.4 F or 38.0 C) OR symptoms of lower"
		+"\nrespiratory illness such as cough, shortness of breath,\ndifficulty breathing or sore throat?\n(Y)es or (N)o? ");
		jawab[2]=sc.nextLine().toUpperCase().charAt(0);
		if(jawab[2]=='Y'){
			score+=1;
		}
	// 4
		System.out.print("4.Are you a first responder, healthcare worker, or employee or attendee of a \nchild or adult care facility?"
		+"\n(Y)es or (N)o? ");
		jawab[3]=sc.nextLine().toUpperCase().charAt(0);
		if(jawab[3]=='Y'){
			score+=1;
		}

		System.out.println();
		PEMISAH();
		System.out.println();
		
	//PENENENTUAN JAWABAN DARI HASIL SCORE:
		System.out.print("Dear "+nama+" ("+Gender+"/"+Status+"/"+umur+"),\n");
		System.out.println("\nOur recommendation is:");
		if (score>=3){
		System.out.println("\" You may need COVID-19 testing.\"");
		}
		else if(score==2){
		System.out.println(" \"You may need COVID-19 testing OR self-quarantine at home "
		+"OR your symptoms may or may not be related to COVID-19.\"");
		}
		else if(score==1){
			if(jawab[0]=='Y'||jawab[1]=='Y'){
				System.out.println("\"self-quarantine at home.\"");
			}
			else if(jawab[2]=='Y'){
				System.out.println("\"your symptoms may or may not be related to COVID-19.\"");
			}
			else if(jawab[3]=='Y'){
				System.out.println("\"practice social distancing and watch for symptoms\"");
			}
		}
		else{System.out.println("\"practice social distancing and watch for symptoms\"");}
		System.out.println("\nBe Safe! \nThank You :)\n");
		PEMISAH();

		System.out.println("\nMADE BY ZAINAL ABIDIN");
}

	//PEMISAH TANDA:
		public static void PEMISAH(){
			System.out.println("#########################################################");
		}
}
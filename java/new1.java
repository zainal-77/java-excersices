import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Problem3();
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
 		System.out.println("User input:"+user1);
 		System.out.println("Genap(0) atau Ganjil(1)");
 		int user2=in.nextInt();
 		System.out.println("User input:"+user2);
        int n;
 	    if(user2==0){
      	n = 0;
 	    for(int i=1;i<=user1;i++){
 	      System.out.println(n);
          n+=2;
	    }
 	    }
 	     else if(user2==1){
		int n1=0;
 	        for(int j=1; j<=user1;j++){		
 	            System.out.println(n1);
		    n1+=1;
 	        }
 	    }
	}   
}
         // End your program here
                
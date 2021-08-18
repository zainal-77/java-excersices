	public class main{
	public static void main(String[]args){
	BonusProblem();}
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
   for(int a=0; a<=5; a++){
      for(int b=0; b<=5; b++){
        System.out.print(" (" + a + "," + b + ") ");
      }
      System.out.println(" ");
    }
	}
	}
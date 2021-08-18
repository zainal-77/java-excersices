import java.util.Scanner;
public class mySolution{
public static void main(String [] args){
Problem3();}
public static void Problem3(){
        Scanner saya= new Scanner(System.in);
		boolean dapet=true;
        String [][] myArray= {{"was","it","a","car","or","a","cat","i","saw"},{"A","B","C","D","IUP","E","F","G","H"}};
        String ketik= saya.nextLine();
        for(int j=0;j<=myArray.length-1;j++){
        for (int i=0; i<=myArray[j]-1;i++){
        if(myArray[i][j].equals(ketik)){
			 dapet=true;
             System.out.println(ketik);
			 break;}
		}
		}
             if(dapet==false){
				 System.out.println("tidak dapet");
			 }
}
}
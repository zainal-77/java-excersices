import java.util.Scanner;
public class pascaltriangle{
public static void main(String []args){
Scanner kamu= new Scanner(System.in);
System.out.print("Enter kamu mau berapa banyak?");
int banyak=kamu.nextInt();
int spasi=banyak;
int number=1;
for(int i= 0;i<banyak;i++){
	for(int j=1;j<=spasi;j++){
		System.out.print(" ");}
		number=1;
		for(int s=0;s<=i;s++){
			System.out.print(number+" ");
			number= number*(i-s)/(s+1);
		}
		spasi--;
		System.out.println();
}
}
}
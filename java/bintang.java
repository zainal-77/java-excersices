import java.util.Scanner;
public class BINTANG{
public static void main(String [] args){
Scanner input= new Scanner(System.in);
System.out.println("Masukkin ke bolongonnya");
int kamu= input.nextInt();
for(int i=1;i<=kamu;i++){
for(int j=kamu;j>=i;j--){
	if(j%2==0){
		System.out.print(" "+j+" ");
	}
	else{
System.out.print(" * ");}
}
System.out.println(" ");}
}
}
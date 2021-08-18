import java.util.Scanner;
public class myArray{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int [] c= new int[n];
		for(int i=0;i<n;i++){
			c[i]=i++;
			System.out.println(c[i]);
		}
		
	}
}
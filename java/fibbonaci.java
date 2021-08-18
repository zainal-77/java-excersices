import java.util.Scanner;
	public class fibbonaci{
		public static int fibbo(int n){
			Scanner sc =new Scanner(System.in);
			int user=sc.nextInt();
			if(n==0 || n==1){
				return n;
			}
			else {
				return (fibbo(n-1)+fibbo(n-2));
			}
		}
		public static void main(String[]args){
			Scanner sc= new Scanner(System.in);
			int i ,j,next;
			next=0;
			i=0;
			j=1;
			System.out.println("Enter the number what you want fucker???????");
			int user= sc.nextInt();
			System.out.println("Hasil bilangan fibbonaci adalah here we go");
			for(int s=0;s<=user;++s){
			System.out.print(i+",");
			next=i+j;
			i=j;
			j=next;
			}
	System.out.println(" ");
		}
	}
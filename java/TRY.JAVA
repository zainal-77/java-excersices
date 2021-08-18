import java.util.Scanner;
public class Main{
public static void main(String[]args){
	//coba1();
    //coba2();
	coba3();}
	public static void coba1(){
	Scanner sayang= new Scanner(System.in);
    System.out.println("Masukkan nrp mu Sayang tiga digit terakhir aja ya");
	int nrp= sayang.nextInt();
    int rumusmyluckynumber=(nrp)%3+1;
	System.out.println(rumusmyluckynumber);
			System.out.println();
	int y=0;
	for(int i=0;i<=3;i++){
	for(int j=0;j<=i;j++){
		y+=rumusmyluckynumber;
		System.out.print(y+" ");
		}
		System.out.println();
	}
	System.out.println("-------------");
	}
	public static void coba2(){
	String desiderata = "Go placidly amid the noise and haste, " +
						"and remember what peace there may be in silence. " +
						"As far as possible, without surrender, " +
						"be on good terms with all persons.";
	String [] baru=desiderata.split(" ");
	int banyak=0;
	int jumlah=0;
	int haduuh=0;
	for(int i=0;i<=baru.length-1;i++){
		if(baru[i].charAt(0)=='a')banyak++; 
	    if(baru[i].indexOf('a')!=-1)jumlah++;
		if(baru[i].toLowerCase().charAt(0)=='a')haduuh++;}
		System.out.println("jumlah huruf yang berawalan \'a\' adalah "+jumlah);
		System.out.println("jumlah huruf yang berawalan \'a\' adalah "+banyak);
		System.out.println("jumlah huruf yang berawalan \'a\' adalah "+haduuh);
	}
	public static void coba3(){
		Scanner lulus= new Scanner(System.in);
		System.out.println("KETIK NAMA WISUDAWAN");
		String nama=lulus.nextLine();
		String [] array=nama.split(" ");
		for(int i=)
	}
	}
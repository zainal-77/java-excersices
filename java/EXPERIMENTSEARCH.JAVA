import java.util.Scanner;
public class Experiment{

 public static void main(String [] args){

 	
 	System.out.println("SELAMAT DATANG");
 	System.out.println();
 	String [][][] total={{{"kamu","aku"},{"1","2","3"}},{{"4","5","6"}}};
 	System.out.print("[");
 	for( int i=0;i<total.length;i++){
 		for( int j=0;j<total[i].length;j++){
 			for(int k=0;k<total[i][j].length;k++){
 			System.out.print(total[i][j][k]+",");
 		}
 		}
 		}
 		System.out.print("]");
 		 System.out.println();
 	String b="1	99	10	60	94	20 	69	95	95	29	60	3	18	34	73	50	35	88	16	48"
			+"	21	100	20	69	6	52	32	45	1	35	8	19	1	15	20	77	42	24	61	25"
			+"	19	1	17	52	76	17	11	39	100	45	69	95	54	85	10"
			+"	58	4	80	7	90	45	70	51	14	56	94	69	3	61	97	49	98	42	95	69"
			+"	17	48	49	88	34	98	100	41	5	12	42	84	96	54	54	60	96	72	87	67	7	52	29	70	74";
 	String[]q=b.split(""); // TUJUANNYA MENGINPUTKAN SEMUA KEDALAM ARRAY
 	System.out.print("[");
 	for(int i=0;i<q.length;i++){
 		System.out.print(q[i].replace("	",","));
 	}
 	System.out.println("]");
}
}
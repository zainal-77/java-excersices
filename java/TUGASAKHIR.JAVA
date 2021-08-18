import java.util.Scanner;
import java.util.Arrays;


abstract class Search{
	public abstract int SearchMethod(int [] arr, int find);
}
//#############################################################################################################
class BinarySearch extends Search{
	public int SearchMethod(int [] arr, int find){
		int left=0;
		int right=arr.length-1;
		while(left<=right){
			int middle=(left+right)/2;
			if(find<arr[middle]){
				right=middle-1;
			}
			else if(find>arr[middle]){
				left=middle+1;
			}
			else{return middle;}
			}	
		return -1;
	}
}

//#############################################################################################################
/*Class JumpSearch extends Search{
	public int Search SearchMethod(int [] arr , int find){
	int z=arr.length;
	int step=(int)Math.floor(Math.sqrt(z));
	int prev=0;
	while(arr[Math.min(n,step)-1]<find){
		prev=step;
		step+=(int)Math.floor(Math.sqrt(z));
		if(prev>=find){
			return -1;
		}
	}
	while(arr[prev]<find){
		prev++;
		if(prev=Math.min(z,step)){
			return -1;
		}
	}
	if(arr[prev]=find){
		prev=find;
	}
	return -1;
	}
}
*/
//#############################################################################################################
//#############################################################################################################
public class TUGASAKHIR1{
	public static void InsertionSort(int [] arr){
		int i,j,AsumsiMin;
		for(i=1;i<arr.length;++i){
			AsumsiMin=arr[i];
			for(j=i-1;j>=0 && arr[j]>AsumsiMin;--j){
				arr[j+1]=arr[j];
			}
			arr[j+1]=AsumsiMin; // ketika j nya minus 
		}
		for(int m=0;m<arr.length;m++){
			System.out.println(arr[m]+" ");
		}
	}

	public static void main(String[]args){
		BinarySearch cari= new BinarySearch();
		System.out.println("PERCOBAAAN");
		Scanner input= new Scanner(System.in);
		int [] arr ={100,400,300,2000,653,1232};
		int find=input.nextInt();
		InsertionSort(arr);
		System.out.println(cari.SearchMethod(arr,find));
	}
}
/*Class tanda{
public static void tanda(){
	System.out.println("########################################################################################################");
	System.out.println();
}
}
*/

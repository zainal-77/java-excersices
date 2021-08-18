import java.util.Scanner;
public class search{
	public static int binarySeacrh(int [] arr, int x){  // ANGKA DALAM ARRAY WAJIB URUT
		int left=0;
		int right=arr.length-1;
		while(left<=right){
			int middle=(left+right)/2;
			if(x<arr[middle]){
				right=middle-1;
			}
			else if(x>arr[middle]){
				left=middle+1;
			}
			else{return middle;}
		}
		return -1;
	}


	public static int Linearsearch(int [] arr, int x){ // ANGKA DALAM ARRAY TIDAK WAJIB URUT
		int n= arr.length;
		for(int i=0; i<n;i++){
			if(arr[i]==x)
				return i;
		}
		return -1;
	}


	public static int jumpsearch(int [] arr, int x){
		int n=arr.length;
		int step=(int)Math.floor(Math.sqrt(n));									

		int prev=0;

		while(arr[Math.min(n,step)-1]<x){
			prev=step;
			step+=(int)Math.floor(Math.sqrt(n));
			if(prev>=n)
				return -1;
		}
		while(arr[prev]<x){
			prev++;
		if(prev==Math.min(step,n))
			return -1;
		}
		if(arr[prev]==x)
			return prev;

			return -1;
	}

	public static void main(String [] args){ // ANGKA DALAM ARRAY WAJIB URUT
		Scanner input=new Scanner(System.in);
		int [] arr={5,6,7,8,9,10,1};
		System.out.println("silahkan input angka yang yang dicari");
		int x=input.nextInt();
		int result= binarySeacrh(arr,x);
		if(result==-1){
			System.out.println("tidak ada "+result);
		}
		else{System.out.println("ada di index "+result);}
	}
}
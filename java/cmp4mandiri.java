public class SortingAlgorithm{

	public static void main(String[]args){
		int [] a={5,1,3,4,2,100,25,500,13};
		System.out.println("1. The original series of number:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
			System.out.println();

			System.out.println("\n2. The sorted series of number (Algorithm: Buble Sort, Order: Ascending):");
			bubleSort(a,'a');

			int [] b={5,1,3,4,2,100,25,500,13};
			System.out.println("\n3. The sorted series of number (Algorithm: Buble Sort, Order: Descending):");
			bubleSort(b,'d');

			int [] c={5,1,3,4,2,100,25,500,13};
			System.out.println("\n4. The sorted series of number (Algorithm: Selection Sort, Order: Ascending):");
			selectionSort(c,'a');

			int [] d={5,1,3,4,2,100,25,500,13};
			System.out.println("\n5. The sorted series of number (Algorithm: Selection Sort, Order: Descending):");
			selectionSort(d,'d');

			int [] e={5,1,3,4,2,100,25,500,13};
			System.out.println("\n6. The sorted series of number (Algorithm: Insertion Sort, Order: Ascending):");
			insertionSort(e,'a');

			int [] f={5,1,3,4,2,100,25,500,13};
			System.out.println("\n7. The sorted series of number (Algorithm: Insertion Sort, Order: Descending):");
			insertionSort(f,'d');
		}

	
	//BUBLE SORT ALGORITHMS	
	static void bubleSort(int [] arr, char order ){
		//make some modification HERE
		for(int j=arr.length-1;j>0;j--){
		if(order=='a'){				// ASCENDING 
			for(int x=0;x<j;x++){ 		// X SEBAGI ASUMSI MINIMUM
				if(arr[x+1]<arr[x]){ 
				 int temp=arr[x]; // PROSES SWAP
				 arr[x]=arr[x+1];
				 arr[x+1]=temp; //(X+1) SEBAGAI REAL MINIMUM
				}
				}
			}
				if(order=='d'){				// DESCENDING
				for(int x=0;x<j;x++){
					if(arr[x+1]>arr[x]){
					int temp=arr[x]; // PROSES SWAP
					arr[x]=arr[x+1];
					arr[x+1]=temp;
					}
				}
			}
		}

		//print out the array
		for(int i=0;i<arr.length;i++){	// HASIL AKHIR OUTPUT
			System.out.print(arr[i]+" ");
		}

		System.out.println();
	}
		//SELECTION SORT ALGORITHMS		
	static void selectionSort(int [] arr, char order){ // MENCARI DENGAN MENYELEKSI  
		//make some modification HERE
		int indexmax,indexmin,i,j,k; 
		for(i=0;i<arr.length-1;++i){ 
			indexmin=arr[i]; // ASUSMSI NILAI MINIMUM
			if(order=='a'){ // ASCENDING 
			for(j=i+1;j<arr.length;++j){ // ANGKA SETELAH NILAI YANG DIASUMSI MINIMUM 
				if(arr[j]<indexmin){ // JIKA SETELAHNYA LEBIH KECIL MAKA DITUKAR
					indexmin=arr[j];	// REAL MINIMUM
					k=j; // POSISI DALAM INDEX ARRAY DISWAP
					int smallernumber=arr[i];	// PROSES SWAP
					arr[i]=arr[j];
					arr[j]=smallernumber; // HASIL SETELAH SWAP
				}
				}
			}
			if(order=='d'){ // DESCENDING
			indexmax=arr[i]; 	// ASUSMSI NILAI MAXIMUM
			for(j=i+1;j<arr.length;++j){ // ANGKA SETELAH NILAI YANG DIASUMSI MAXIMUM
				if(arr[j]>indexmax){ // JIKA ANGKA NILAI SETELAHNYA YANG DIASUMSI LEBIH BESAR MAKA DITUKAR 
					indexmax=arr[j]; // REAL MAXIMUM
					k=j; // POSISI DALAM INDEX ARRAY DISWAP
					int biggernumber=arr[i]; // PROSES SWAP
					arr[i]=arr[j];
					arr[j]=biggernumber; // HASIL SETELAH SWAP
					}
				}
			}
		}
		//print out the array
		for(int m=0;m<arr.length;m++){ // HASIL AKHIR OUTPUT 
			System.out.print(arr[m]+" ")
			;
	}

		System.out.println();
}

	//INSERION SORT ALGORITHM
	static void insertionSort(int [] arr, char order){
		//make some modification HERE:
		int i,j,itemmax,itemmin; 
		for(i=1;i<arr.length;++i){ // LOOPING POSISI INDEX ARRAY
		itemmin=arr[i]; // NILAI ASUMSI MINIMUM 
		if(order=='a'){ // ASCENDING
			for(j=i-1;j>=0 && arr[j]>itemmin; --j){ //LOOPING ANGKA SEBELUM NILAI YANG DIASUMSI MINIMUM , JIKA LEBIH KECIL MAKA DITUKAR 
				arr[j+1]=arr[j]; //  SWAP
				}
				arr[j+1]=itemmin;
				}
		if(order=='d'){
		itemmax=arr[i]; // NILAI ASUMSI MAXIMUM 
			for(j=i-1;j>=0 && arr[j]<itemmax; --j){ //LOOPING ANGKA SEBELUM NILAI YANG DIASUMSI MAXIMUM , JIKA LEBIH BESAR MAKA DITUKAR 
				arr[j+1]=arr[j]; //SWAP
				}
				arr[j+1]=itemmax;
				}
				}
		//print out the arrayfff
		for(int p=0;p<arr.length;p++){ // HASIL AKHIR OUTPUT
			System.out.print(arr[p]+" ");
		}

		System.out.println();
	}
}
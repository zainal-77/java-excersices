/**
 * IS184203C-Genap-2019/20 - Computing Assignment 04
 * Name of Project  : Sorting Algorithm
 * Student ID       : Your NRP here
 * Student Name     : Your Full Name Here
 * Class            : Your Class here
 * Submission Date  : dd-mm-yyyy
 */

/**
 *        
 * NEVER DO 'COPY-PASTE' WHILE YOU ARE CODING
 * 
 */

public class SortingAlgorithm {

    public static void main(String[] args) {
        int [] a={5,1,3,4,2,100,25,500,13};
        System.out.println("1. The original series of number:");
        for(int i=0; i<a.length;i++){
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
    
    //buble sort algorithm
    static void bubleSort(int []arr, char order ){
       //make some modification here
       for (int j=arr.length-1;j>0;j--){
        if(order=='a'){
           for (int x=0;x<j;x++){
               if (arr[x+1]<arr[x]){
                   int temp=arr[x];
                   arr[x]= arr[x+1];
                   arr[x+1] = temp;
               }
           }
         }
         if(order=='d'){
            for (int x=0;x<j;x++){
               if (arr[x+1]>arr[x]){
                   int temp=arr[x];
                   arr[x]= arr[x+1];
                   arr[x+1] = temp;
               }
           }
         }
       }
       
       //print out the array
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
    
    //selection sort algorithm
    static void selectionSort(int []arr, char order ){
       //make some modification here

       for (int s = 0; s < arr.length-1 ; ++s)  
        {   int k; 
          if(order=='a'){
            int indexmin=arr[s]; 
            for (int j = s + 1; j < arr.length; ++j){  
                if (arr[j] < indexmin){  
                  indexmin =arr[j];
                  k=j;            // real minimum         
                  int smallerNumber = arr[s];  // proses swap 
                  arr[s] = arr[j];  
                  arr[j] = smallerNumber;
    }  
 }  
}
                if(order=='d'){
                int indexmax=arr[s];
                for (int j = s + 1; j < arr.length; ++j){  
                if (arr[j] > indexmax){  
                  indexmax =arr[j];
                  k=j;            // real minimum         
                  int biggerNumber = arr[s];  // proses swap 
                  arr[s] = arr[j];  
                  arr[j] = biggerNumber;
                }
  }
}
}
       //print out the array
        for(int m=0; m<arr.length;m++){
            System.out.print(arr[m]+" ");
        }
        System.out.println();
 }  
    //insertion sort algorithm
    static void insertionSort(int []arr, char order ){
       //make some modification here
      int itemmin,j,i,itemmax;
       for(i=1;i<arr.length;++i){
        itemmin=arr[i];
        if(order=='a'){
        for(j=i-1;j>=0 && arr[j]>itemmin;--j)
        {
          arr[j+1]=arr[j];
        }
          arr[j+1]=itemmin;
          }


          // descending
           itemmax=arr[i];
        if(order=='d'){
        for(j=i-1;j>=0 && arr[j]<itemmax;--j)
        {
          arr[j+1]=arr[j];
        }
          arr[j+1]=itemmax;
          }
         }
       //print out the array
        for(int r=0; r<arr.length;r++){
            System.out.print(arr[r]+" ");
        }
        System.out.println(); 
  }
}

/**
 * DECLARATION OF ORIGINAL WORK
 * I, hereby declare that the code is my original work. 
 * I have honored the principles of academic integrity and have upheld 
 * ITS''s  Student Code of Academic in the completion of this work.
 */

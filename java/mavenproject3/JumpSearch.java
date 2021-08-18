/**
 * IS184203C-Genap-2018/19 - Computing Assignment 05
 * Name of Project  : Searching Algorithm
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

 //complete your code here
 public class JumpSearch extends Search{
     JumpSearch(String name){
         super(name);
     }
 
boolean doSearch(String s, String [] data){
    Sort a = new Sort();
    a.doSort(data);
    
    int n=data.length;
    int step=(int)Math.floor(Math.sqrt(n));
    int r=s.compareTo(data[Math.min(end,data.length)-1]);
    int prev=0;
    while(data[Math.min(step,n)-1]<s){
    prev=step;
    step+=Math.floor(Math.sqrt(n));
    if(data[prev]>=n){
    return false;
    }
 }
    while (data[prev]<s){
    prev++;
    if(prev==Math.min(n,step)){
    return false;
}
   if(data[prev]==s){
    return true;
   }
    }
   return false;
}

boolean doSearch(int x, int [] data ){
    Sort a= new Sort();
    a.doSort(data);
    
    int n=data.length;
    int step=(int)Math.floor(Math.sqrt(n));
    int prev=0;
    
    while(data[Math.min(step,n)-1]<x){
        prev=step;
        step+=Math.floor(Math.sqrt(n));
        
        if(data[prev]>=n){
            return false;
        }
    }
    while(data[prev]<x){
        prev++;
        if(prev==Math.min(step,n)){
            return false;
        }
        else if (data[prev]==x){
            return true;
        }
    }
    return false;
        }
    }

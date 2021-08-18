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

public class Main {

    public static void main(String[] args) {
        int [] data1={199,200,1,15,100,500,1001,1002,1006};
        String [] data2={"Alayka","Sumi","Ati","Zulaikha","Alif","Firman"};
        
        //Experiment 1: Linear Search
        System.out.println("Experiment 1:");
        
        Search s = new LinearSearch("Linear Search");
        
        // Over Data 1
        System.out.println("Data 1:");
        s.printData(data1);
        System.out.println();
        int key1=1006;
        System.out.println("Key:"+ key1);
        double start = System.nanoTime();
        boolean found= s.doSearch(key1,data1);
        double end = System.nanoTime();
        double timesTaken= end-start;
        
        String status;
        
        if (found){
            status="found";
        } else{
             status="not found";
        }
        System.out.println("the key '"+key1+"' is "+status+" using "+s.printName()+" times required:"+ timesTaken+" (in nanoseconds)");
        
        // Over Data 2
        System.out.println("Data 2:");
        s.printData(data2);
        System.out.println();
        String key2="Firman";
        System.out.println("Key:"+ key2);
        
        start = System.nanoTime();
        found= s.doSearch(key2,data2);
        end = System.nanoTime();
        timesTaken= end-start;
        
       if (found){
            status="found";
        } else{
             status="not found";
        }
        System.out.println("the key '"+key2+"' is "+status+" using "+s.printName()+" times required:"+ timesTaken+" (in nanoseconds)");
        
        
        //Experiment 2: Binary Search
        //Complete your code here!
        
        
        
        //Experiment 3: Jump Search
        //Complete your code here!
        
        
    }
}

/**
 * DECLARATION OF ORIGINAL WORK
 * I, hereby declare that the code is my original work. 
 * I have honored the principles of academic integrity and have upheld 
 * ITS''s  Student Code of Academic in the completion of this work.
 */
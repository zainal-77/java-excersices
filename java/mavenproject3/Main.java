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
        
        System.out.println("BISMILLAHIROHMANNNIOHIM");
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
        System.out.println("the key '"+key1+"' is "+status+" using "+s.printName()+" times required:"+ timesTaken +" (in nanoseconds)");
        
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
        System.out.println("the key '"+key2+"' is "+status+" using "+s.printName()+" times required:"+ timesTaken +" (in nanoseconds)");
        
        
        //Experiment 2: Binary Search
        //Complete your code here!
        System.out.println("\nEXPERIMENT 2 :");
        
        Search binary = new BinarySearch("Binary Search");
        
        //OVER DATA 1       :
        System.out.println("Data 1 :");
        binary.printData(data1);
        System.out.println();
        int key3=1001;
        System.out.println("Key :"+key3);
        
        //WAKTU             :
        start       =System.nanoTime();
        found       =binary.doSearch(key3,data1);
        end         =System.nanoTime();
        timesTaken  =end-start;
        
        if(found){
            status="found";
        }
        else{
            status="not found";
        }
        
         System.out.println("the key '"+key3+"' is "+status+" using "+binary.printName()+" times requires"+ timesTaken+" (in nanoseconds)");
        
        //OVER DATA 2       :
        System.out.println("Data 2 :");
        binary.printData(data2);
        System.out.println();
        String key4="Zulaikha";
        System.out.println("Key :"+key4);
        
        start     = System.nanoTime();
        found     = binary.doSearch(key4,data2);
        end       = System.nanoTime();
        timesTaken= end-start;
        
        //WAKTU             :
        if(found){
            status="found";
        }
            else{
                    status="not found";
                    }
         System.out.println("the key '"+key4+"' is "+status+" using "+binary.printName()+" times requires"+ timesTaken+" (in nanoseconds)");
                    
       
        
        
        //Experiment 3: Jump Search
        //Complete your code here!
        System.out.println("\nEXPERIMENT 3 :");
        
        Search jump= new JumpSearch("Jump Search");
        
        System.out.println("Data 1 :");
        jump.printData(data1);
        System.out.println();
        int key5=500;
        System.out.println("Key :"+key5);
        
        //WAKTU
        start       =System.nanoTime();
        found       =jump.doSeacrh(key5,data1);
        end         =System.nanoTime();
        timesTaken  =end-start;
        
        if(found){
            status="found";
        }
        else{
            status="not found";
        }
        
         System.out.println("the key '"+key5+"' is "+status+" using "+jump.printName()+" times required"+ timesTaken +" (in nanoseconds)");
         
         //OVER DATA 2      :
         System.out.println("Data 2:");
         jump.printData(data2);
         System.out.pritnln();
         String key6="Alif";
         System.out.println("Key :"+key6);
         
         //WAKTU
         start      =System.nanoTime();
         found      =jump.doSearch(key6,data2);
         end        =System.nanoTime();
         timesTaken =end-start;
         
         if(found){
             status="found";
         }
         else{
             status="not found";
         }
         System.out.println("the key '"+key6+"' is "+status+" using "+jump.printName()+" times required"+ timesTaken +" in(nanoseconds)");
         
         System.out.println("MADE BY ZAINAL ABIDIN");
         }
        }
  

/**
 * DECLARATION OF ORIGINAL WORK
 * I, hereby declare that the code is my original work. 
 * I have honored the principles of academic integrity and have upheld 
 * ITS''s  Student Code of Academic in the completion of this work.
 */
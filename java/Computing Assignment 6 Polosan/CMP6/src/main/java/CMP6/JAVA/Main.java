package CMP6.JAVA;

/**
 * IS184203C-Genap-2018/19 - Computing Assignment 06
 * Name of Project  : Stack and Queue
 * Student ID       : 05211940000102
 * Student Name     : Zainal Abidin
 * Class            : B
 * Submission Date  : dd-mm-yyyy
 */

/**
 * 
 * NEVER DO 'COPY-PASTE' WHILE YOU ARE CODING
 * 
 */
public class Main {

    public static void main(String[] args) {
        int [] data1={1,2,3,4,5,7,8,9,10};
        String [] data2= {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        
        System.out.println("BISMILLAHIROHMANIROHIM");
        System.out.println("\n1. Experiment with LinkedList Queue:");
        System.out.println("Data 1:");
        
        long start = System.nanoTime();
        Queue myLLQ = new LinkedListQueue();
        for(int i=0;i<data1.length;i++){
            System.out.println("Enquee #"+(i+1)+":"+myLLQ.enqueue(data1[i]));
        }
        for (int i=0;i<data1.length/2;i++){
            System.out.println("Dequee #"+(i+1)+":"+myLLQ.dequeue());
        }
        long end = System.nanoTime();
        long timesTaken=end-start;
        System.out.println("Running time for experiment with LinkedList Queue over Data 1 is: "+ timesTaken+" nano seconds");
        
        System.out.println("Data 2:");
        
        start = System.nanoTime();
        myLLQ = new LinkedListQueue();
        for(int i=0;i<data2.length;i++){
            System.out.println("Enquee #"+(i+1)+":"+myLLQ.enqueue(data2[i]));
        }
        for (int i=0;i<data2.length/2;i++){
            System.out.println("Dequee #"+(i+1)+":"+myLLQ.dequeue());
        }
        end = System.nanoTime();
        timesTaken = end-start;
        
        System.out.println("Running time for experiment with LinkedList Queue over Data 2 is: "+ timesTaken+" nano seconds");
        
        System.out.println("\n2. Experiment with Array Stack:");
        System.out.println("Data 1:");
        
        start = System.nanoTime();
        Stack myLLS = new ArrayStack();
        for(int i=0;i<data1.length;i++){
            System.out.println("Push #"+(i+1)+":"+myLLS.push(data1[i]));
        }
        for (int i=0;i<data1.length/2;i++){
            System.out.println("Pop #"+(i+1)+":"+myLLS.pop());
        }
        end = System.nanoTime();
        timesTaken=end-start;
        
        System.out.println("Running time for experiment with Array Stack over Data 1 is: "+ timesTaken+" nano seconds");
        
        System.out.println("Data 2:");
        
        start = System.nanoTime();
        myLLS = new ArrayStack();
        for(int i=0;i<data2.length;i++){
            System.out.println("Enquee #"+(i+1)+":"+myLLS.push(data2[i]));
        }
        for (int i=0;i<data2.length/2;i++){
            System.out.println("Dequee #"+(i+1)+":"+myLLS.pop());
        }
        end = System.nanoTime();
        timesTaken = end-start;
        
        System.out.println("Running time for experiment with Array Stack over Data 2 is: "+ timesTaken+" nano seconds");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n3. Experiment with Array Queue:");
        //complete your code here
        System.out.println("Data 1:");
              
        start=System.nanoTime();
        myLLQ = new ArrayQueue();
        for(int i=0;i<data1.length;i++){
            System.out.println("Enquee #"+(i+1)+":"+myLLQ.enqueue(data1[i]));
        }
        for(int i=0;i<data1.length/2;i++){
        System.out.println("Deguee #"+(i+1)+":"+myLLQ.dequeue());    
        }
        end= System.nanoTime();
        timesTaken=end-start;
        System.out.println("Running time for the experiment with Array Queue over Data 1 is: "+timesTaken+" nano seconds");
        
        System.out.println("Data 2:");
        
        start=System.nanoTime();
        myLLQ= new ArrayQueue();
        for(int i=0;i<data2.length;i++){
            System.out.println("Enguee #"+(i+1)+":"+myLLQ.enqueue(data2[i]));
        }
        for(int i=0;i<data2.length/2;i++){
            System.out.println("Dequee #"+(i+1)+":"+myLLQ.dequeue());
        }
        end=System.nanoTime();
        timesTaken=end-start;
        System.out.println("Running time for the experiment with Array Queue over Data 2 is: "+timesTaken+" nanoseconds");
        
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n4. Experiment with LinkedList Stack:");
        //complete your code here
        System.out.println("Data 1:");
        
        start=System.nanoTime();
        myLLS=new LinkedListStack();
        for(int i=0;i<data1.length;i++){
            System.out.println("Push #"+(i+1)+":"+myLLS.push(data1[i]));
        }
        for(int i=0;i<data1.length/2;i++){
            System.out.println("Pop #"+(i+1)+":"+myLLS.pop());
        }
        end=System.nanoTime();
        timesTaken=end-start;
        System.out.println("Running time for the experiment with LinkedList Stack over Data 1 is: "+timesTaken+" nanoseconds");
       
        System.out.println("Data 2:");
        
        start=System.nanoTime();
        myLLS=new LinkedListStack();
        for(int i=0;i<data2.length;i++){
            System.out.println("Push #"+(i+1)+":"+myLLS.push(data2[i]));
        }
        for(int i=0;i<data2.length/2;i++){
            System.out.println("Pop #"+(i+1)+":"+myLLS.pop());
        }
        end=System.nanoTime();
        timesTaken=end-start;
        System.out.println("Running time for the experiment with LinkedList Stack over Data 2 is: "+timesTaken+" nanoseconds");
        System.out.println("\nMADE BY ZAINAL");
    }
}

/**
 * DECLARATION OF ORIGINAL WORK
 * I, hereby declare that the code is my original work. 
 * I have honored the principles of academic integrity and have upheld 
 * ITS''s  Student Code of Academic in the completion of this work.
 */
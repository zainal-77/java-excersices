package com.mycompany.mavenproject4;


/**
 * IS184203C-Genap-2019/20 - Computing Assignment 05
 * Name of Project  : Searching Algorithm
 * Student ID       :
 * Student Name     :
 * Class            : Your Class here
 * Submission Date  : 17-05-2020
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
        System.out.println("1.First Condition , Just Binary and jump are sorted");
        //Experiment 1: Linear Search
        System.out.println("Experiment 1: LINIEAR SEARCH");
        
        Search s = new LinearSearch("Linear Search");
        
        // Over Data 1
        System.out.println("Data 1:");
        s.printData(data1);
        System.out.println();
        int key1=1001;
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
        System.out.println("the key '"+key1+"' is "+status+" using "+s.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        
        // Over Data 2
        System.out.println("Data 2:");
        s.printData(data2);
        System.out.println();
        String key2="Alif";
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
        System.out.println("the key '"+key2+"' is "+status+" using "+s.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        
        
        //Experiment 2: Binary Search
        //Complete your code here!
        System.out.println("\nEXPERIMENT 2 : BINARY SEARCH");
        
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
        
         System.out.println("the key '"+key3+"' is "+status+" using "+binary.printName()+" times required : "+ timesTaken+" (in nanoseconds)");
        
        //OVER DATA 2       :
        System.out.println("Data 2 :");
        binary.printData(data2);
        System.out.println();
        String key4="Alif";
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
         System.out.println("the key '"+key4+"' is "+status+" using "+binary.printName()+" times required : "+ timesTaken+" (in nanoseconds)");
                    
        
        //Experiment 3: Jump Search
        //Complete your code here!
        System.out.println("\nEXPERIMENT 3 : JUMP SEARCH");
        
        Search jump= new JumpSearch("Jump Search");
        
        int [] data3={199,200,1,15,100,500,1001,1002,1006};
        String [] data4={"Alayka","Sumi","Ati","Zulaikha","Alif","Firman"};
        System.out.println("Data 1 :");
        jump.printData(data3);
        System.out.println();
        int key5=1001;
        System.out.println("Key :"+key5);
        
        //WAKTU
        start       =System.nanoTime();
        found       =jump.doSearch(key5,data3);
        end         =System.nanoTime();
        timesTaken  =end-start;
        
        if(found){
            status="found";
        }
        else{
            status="not found";
        }
        
         System.out.println("the key '"+key5+"' is "+status+" using "+jump.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
         
         //OVER DATA 2      :
         System.out.println("Data 2:");
         jump.printData(data4);
         System.out.println();
         String key6="Alif";
         System.out.println("Key :"+key6);
         
         //WAKTU
         start      =System.nanoTime();
         found      =jump.doSearch(key6,data4);
         end        =System.nanoTime();
         timesTaken =end-start;
         
         if(found){
             status="found";
         }
         else{
             status="not found";
         }
         System.out.println("the key '"+key6+"' is "+status+" using "+jump.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        
         seperator();
         System.out.println("\n2.Second Condition, All have been Sorted ");
         System.out.println("Experiment 1: LINIEAR SEARCH");
        
        
        Search l= new liniearSearch1(" liniear Search");
        // Over Data 1
        System.out.println("Data 1:");
        l.printData(data1);
        System.out.println();
        int key99=1001;
        System.out.println("Key:"+ key99);
        start = System.nanoTime();
        found= s.doSearch(key99,data1);
        end = System.nanoTime();
        timesTaken= end-start;
     
        if (found){
            status="found";
        } else{
             status="not found";
        }
        System.out.println("the key '"+key99+"' is "+status+" using "+l.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        
        // Over Data 2
        System.out.println("Data 2:");
        l.printData(data2);
        System.out.println();
        String key98="Alif";
        System.out.println("Key:"+ key98);
        
        start = System.nanoTime();
        found= l.doSearch(key98,data2);
        end = System.nanoTime();
        timesTaken= end-start;
        
       if (found){
            status="found";
        } else{
             status="not found";
        }
        System.out.println("the key '"+key2+"' is "+status+" using "+l.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        
        
        //Experiment 2: Binary Search
        //Complete your code here!
        System.out.println("\nEXPERIMENT 2 : BINARY SEARCH");
        
       
        //OVER DATA 1       :
        System.out.println("Data 1 :");
        binary.printData(data1);
        System.out.println();
        int key97=1001;
        System.out.println("Key :"+key97);
        
        //WAKTU             :
        start       =System.nanoTime();
        found       =binary.doSearch(key97,data1);
        end         =System.nanoTime();
        timesTaken  =end-start;
        
        if(found){
            status="found";
        }
        else{
            status="not found";
        }
        
         System.out.println("the key '"+key97+"' is "+status+" using "+binary.printName()+" times required : "+ timesTaken+" (in nanoseconds)");
        
        //OVER DATA 2       :
        System.out.println("Data 2 :");
        binary.printData(data2);
        System.out.println();
        String key95="Alif";
        System.out.println("Key :"+key95);
        
        start     = System.nanoTime();
        found     = binary.doSearch(key95,data2);
        end       = System.nanoTime();
        timesTaken= end-start;
        
        //WAKTU             :
        if(found){
            status="found";
        }
            else{
                    status="not found";
                    }
         System.out.println("the key '"+key95+"' is "+status+" using "+binary.printName()+" times required : "+ timesTaken+" (in nanoseconds)");
                    
        
        //Experiment 3: Jump Search
        //Complete your code here!
        System.out.println("\nEXPERIMENT 3 : JUMP SEARCH");
          
        
        System.out.println("Data 1 :");
        jump.printData(data1);
        System.out.println();
        int key92=1001;
        System.out.println("Key :"+key92);
        
        //WAKTU
        start       =System.nanoTime();
        found       =jump.doSearch(key92,data1);
        end         =System.nanoTime();
        timesTaken  =end-start;
        
        if(found){
            status="found";
        }
        else{
            status="not found";
        }
        
         System.out.println("the key '"+key92+"' is "+status+" using "+jump.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
         
         //OVER DATA 2      :
         System.out.println("Data 2:");
         jump.printData(data2);
         System.out.println();
         String key93="Alif";
         System.out.println("Key :"+key93);
         
         //WAKTU
         start      =System.nanoTime();
         found      =jump.doSearch(key93,data2);
         end        =System.nanoTime();
         timesTaken =end-start;
         
         if(found){
             status="found";
         }
         else{
             status="not found";
         }
         System.out.println("the key '"+key93+"' is "+status+" using "+jump.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        
         
         seperator();
         //EXPERIMENTS DENGAN DATASETS YANG LEBIH BESAR DAN BANYAK
        System.out.println("EXPERIMENTS DENGAN DATASETS YANG LEBIH BESAR DAN BANYAK");
        int [] data6={1,50,6,4,63,78,13,66,86,87,57,80,88,19,55,48,40,41
                ,8,51,37,64,100,22,9,52,60,33,90,38,75,27,83,70,85,73,32,31,23
                ,43,2,3,76,46,96,82,35,9,29,69,25,5,74,59,20,84,26,58,53,65,11,
                61,17,56,94,30,34,62,47,15,14,42,71,45,36,12,79,39,16,98,77,
                24,21,28,7,54,95,93,72,9,89,18,44,68,49,91,67,81,99,10};
        
        String [] data7={"Blair","Marlene","Elfrieda","Claire","Clelia","Pauline","Shirely","Raven","Amber","Elmer "
                +"Elizbeth","Hye","Tajuana","Carleen,"
                +"Henry","Li","Gabriel","Audrie","Lasonya","Jonie,"
                +"Olinda","Ema","Apryl","Hortensia","Dell","Willette","Lonny","Joella","Evelyne","Shelby "
                +"Irvin","Samara","Lilli","Maryjane","Evelynn","Kandra","Leanna","Matha","Dung","Adalberto","Todd "
                +"Barbera","Renea","Bonny","Terresan","Elton,"
                +"Jaquelyn","Calvin","Hyo","Cedrick","Carroll","Karol","Shelia,","Lauran "
                +"Rosana","Alexandra","Elizebeth","Cornelius","Beverlee","Amelia","Shannon "
                +"Dwayne","Yoshiko","Earnest","Mirella","Kermit","Kassandra","Fallon "
                +"Dennis","Estell","Regena","Lakiesha","Trudy,"
                +"Ermelinda","Natashia","Amado","Melida","Evelin","Trenton","Debrah "
                +"Ardelia","Dominic","Sally","Tynisha","Waltraud","Gracia "
                +"Dante","Lesia","Lynette","Kenya","Prince","Janene","Mignon","Shandra "
                +"Merrilee","Estrella","Miquel","Twyla","Gertrudis","Waneta"};
        
       
        //Experiment 1: Linear Search
        System.out.println("\nThird Condition , Just binary and jump are sorted:");
        System.out.println("Experiment 1: LINIEAR SEARCH");
        
        
        // Over Data 1
        System.out.println("Data 1:");
        s.printData(data6);
        System.out.println();
        int key7=59;
        System.out.println("Key:"+ key7);
        start = System.nanoTime();
        found= s.doSearch(key7,data6);
        end = System.nanoTime();
        timesTaken= end-start;
        
        if (found){
            status="found";
        } else{
             status="not found";
        }
        System.out.println("the key '"+key7+"' is "+status+" using "+s.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        
        // Over Data 2
        System.out.println("Data 2:");
        s.printData(data7);
        System.out.println();
        String key8="Waneta";
        System.out.println("Key:"+ key8);
        
        start = System.nanoTime();
        found= s.doSearch(key8,data7);
        end = System.nanoTime();
        timesTaken= end-start;
        
       if (found){
            status="found";
        } else{
             status="not found";
        }
        System.out.println("the key '"+key8+"' is "+status+" using "+s.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        
        
        //Experiment 2: Binary Search
        //Complete your code here!
        System.out.println("\nEXPERIMENT 2 : BINARY SEARCH");
        
        
        //OVER DATA 1       :
        System.out.println("Data 1 :");
        binary.printData(data6);
        System.out.println();
        int key9=59;
        System.out.println("Key :"+key9);
        
        //WAKTU             :
        start       =System.nanoTime();
        found       =binary.doSearch(key9,data6);
        end         =System.nanoTime();
        timesTaken  =end-start;
        
        if(found){
            status="found";
        }
        else{
            status="not found";
        }
        
         System.out.println("the key '"+key9+"' is "+status+" using "+binary.printName()+" times required : "+ timesTaken+" (in nanoseconds)");
        
        //OVER DATA 2       :
        System.out.println("Data 2 :");
        binary.printData(data7);
        System.out.println();
        String key10="Waneta";
        System.out.println("Key :"+key10);
        
        start     = System.nanoTime();
        found     = binary.doSearch(key4,data7);
        end       = System.nanoTime();
        timesTaken= end-start;
        
        //WAKTU             :
        if(found){
            status="found";
        }
            else{
                    status="not found";
                    }
         System.out.println("the key '"+key10+"' is "+status+" using "+binary.printName()+" times required : "+ timesTaken+" (in nanoseconds)");
                    
        //Experiment 3: Jump Search
        //Complete your code here!
        System.out.println("\nEXPERIMENT 3 : JUMP SEARCH");
        
        
     // TUJUANNYA DATA DITULIS KARENA JIKA TIDAK PADA JUMP SEACRH AKAN MENGOUTPUTKAN DATA YANG SUDAH TERURUT, SOLUSINYA DITULIS ULANG     
        int [] data8={1,50,6,4,63,78,13,66,86,87,57,80,88,19,55,48,40,41
                ,8,51,37,64,100,22,9,52,60,33,90,38,75,27,83,70,85,73,32,31,23
                ,43,2,3,76,46,96,82,35,9,29,69,25,5,74,59,20,84,26,58,53,65,11,
                61,17,56,94,30,34,62,47,15,14,42,71,45,36,12,79,39,16,98,77,
                24,21,28,7,54,95,93,72,9,89,18,44,68,49,91,67,81,99,10};
        
          String [] data9={"Blair","Marlene","Elfrieda","Claire","Clelia","Pauline","Shirely "
                +"Raven","Amber","Elmer "
                +"Elizbeth","Hye","Tajuana","Carleen "
                +"Henry","Li","Gabriel","Audrie","Lasonya","Jonie " 
                +"Olinda","Ema","Apryl","Hortensia","Dell","Willette","Lonny","Joella","Evelyne","Shelby "
                +"Irvin","Samara","Lilli","Maryjane","Evelynn","Kandra","Leanna","Matha","Dung","Adalberto","Todd "
                +"Barbera","Renea","Bonny","Terresan","Elton"
                +"Jaquelyn","Calvin","Hyo","Cedrick","Carroll","Karol","Shelia","Lauran "
                +"Rosana","Alexandra","Elizebeth","Cornelius","Beverlee","Amelia","Shannon "
                +"Dwayne","Yoshiko","Earnest","Mirella","Kermit","Kassandra","Fallon "
                +"Dennis","Estell","Regena","Lakiesha","Trudy "
                +"Ermelinda","Natashia","Amado","Melida","Evelin ","Trenton","Debrah "
                +"Ardelia","Dominic","Sally","Tynisha","Waltraud","Gracia "
                +"Dante","Lesia","Lynette","Kenya","Prince","Janene","Mignon","Shandra "
                +"Merrilee","Estrella","Miquel","Twyla","Gertrudis","Waneta"};
     
        
        System.out.println("Data 1 :");
        jump.printData(data8);
        System.out.println();
        int key11=59;
        System.out.println("Key :"+key11);
        
        //WAKTU
        start       =System.nanoTime();
        found       =jump.doSearch(key11,data8);
        end         =System.nanoTime();
        timesTaken  =end-start;
        
        if(found){
            status="found";
        }
        else{
            status="not found";
        }
        
         System.out.println("the key '"+key11+"' is "+status+" using "+jump.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
         
         //OVER DATA 2      :
         System.out.println("Data 2:");
         jump.printData(data9);
         System.out.println();
         String key12="Waneta";
         System.out.println("Key :"+key12);
         
         //WAKTU
         start      =System.nanoTime();
         found      =jump.doSearch(key12,data9);
         end        =System.nanoTime();
         timesTaken =end-start;
         
         if(found){
             status="found";
         }
         else{
             status="not found";
         }
         System.out.println("the key '"+key12+"' is "+status+" using "+jump.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        /////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nFourth Condition All Sorted");
        seperator();
        
        //Experiment 1: Linear Search

        System.out.println("Experiment 1: LINIEAR SEARCH");
        
        
        // Over Data 1
        System.out.println("Data 1:");
        l.printData(data6);
        System.out.println();
        int key55=59;
        System.out.println("Key:"+ key55);
        start = System.nanoTime();
        found= l.doSearch(key55,data6);
        end = System.nanoTime();
        timesTaken= end-start;
        
        if (found){
            status="found";
        } else{
             status="not found";
        }
        System.out.println("the key '"+key55+"' is "+status+" using "+l.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        
        // Over Data 2
        System.out.println("Data 2:");
        l.printData(data7);
        System.out.println();
        String key56="Waneta";
        System.out.println("Key:"+ key56);
        
        start = System.nanoTime();
        found= l.doSearch(key56,data7);
        end = System.nanoTime();
        timesTaken= end-start;
        
       if (found){
            status="found";
        } else{
             status="not found";
        }
        System.out.println("the key '"+key56+"' is "+status+" using "+l.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        
        
        //Experiment 2: Binary Search
        //Complete your code here!
        System.out.println("\nEXPERIMENT 2 : BINARY SEARCH");
        
        
        //OVER DATA 1       :
        System.out.println("Data 1 :");
        binary.printData(data6);
        System.out.println();
        int key57=59;
        System.out.println("Key :"+key57);
        
        //WAKTU             :
        start       =System.nanoTime();
        found       =binary.doSearch(key57,data6);
        end         =System.nanoTime();
        timesTaken  =end-start;
        
        if(found){
            status="found";
        }
        else{
            status="not found";
        }
        
         System.out.println("the key '"+key57+"' is "+status+" using "+binary.printName()+" times required : "+ timesTaken+" (in nanoseconds)");
        
        //OVER DATA 2       :
        System.out.println("Data 2 :");
        binary.printData(data7);
        System.out.println();
        String key58="Waneta";
        System.out.println("Key :"+key58);
        
        start     = System.nanoTime();
        found     = binary.doSearch(key58,data7);
        end       = System.nanoTime();
        timesTaken= end-start;
        
        //WAKTU             :
        if(found){
            status="found";
        }
            else{
                    status="not found";
                    }
         System.out.println("the key '"+key58+"' is "+status+" using "+binary.printName()+" times required : "+ timesTaken+" (in nanoseconds)");
                    
        //Experiment 3: Jump Search
        //Complete your code here!
        System.out.println("\nEXPERIMENT 3 : JUMP SEARCH");
        
        System.out.println("Data 1 :");
        jump.printData(data8);
        System.out.println();
        int key59=59;
        System.out.println("Key :"+key59);
        
        //WAKTU
        start       =System.nanoTime();
        found       =jump.doSearch(key59,data8);
        end         =System.nanoTime();
        timesTaken  =end-start;
        
        if(found){
            status="found";
        }
        else{
            status="not found";
        }
        
         System.out.println("the key '"+key59+"' is "+status+" using "+jump.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
         
         //OVER DATA 2      :
         System.out.println("Data 2:");
         jump.printData(data9);
         System.out.println();
         String key60="Waneta";
         System.out.println("Key :"+key60);
         
         //WAKTU
         start      =System.nanoTime();
         found      =jump.doSearch(key60,data9);
         end        =System.nanoTime();
         timesTaken =end-start;
         
         if(found){
             status="found";
         }
         else{
             status="not found";
         }
         System.out.println("the key '"+key60+"' is "+status+" using "+jump.printName()+" times required : "+ timesTaken +" (in nanoseconds)");
        
         seperator();
         System.out.println("\nMADE BY ZAINAL ABIDIN");
         }
         public static void seperator(){
             System.out.println("--------------------------------------------------------------------------------------------------");
         }
        }


  

/**
 * DECLARATION OF ORIGINAL WORK
 * I, hereby declare that the code is my original work. 
 * I have honored the principles of academic integrity and have upheld 
 * ITS''s  Student Code of Academic in the completion of this work.
 */
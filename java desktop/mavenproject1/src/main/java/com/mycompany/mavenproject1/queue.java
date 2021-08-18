/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ZainalAbidin
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String [] args){
        Queue<String> queue = new LinkedList<>();

       

        queue.add("element 0");
        queue.add("element 1");
        queue.add("element 2");

        //access via Iterator
        Iterator<String> iterator = queue.iterator();
        while(iterator.hasNext()){
          String element = iterator.next();
          System.out.println(element);
        }
        
        //access via new for-loop
        for(String element : queue) {
        System.out.println(element);
}
        
        
        
        /*queue.add("Mazda");

        boolean containsMazda = queue.contains("Mazda");
        boolean containsHonda = queue.contains("Honda");
        System.out.println(containsMazda);
        System.out.println(containsHonda);
        
      /*Queue<String> queue = new LinkedList<String>();
        queue.offer("element 1");
        queue.offer("element 2");
         queue.offer("element 3");
          queue.offer("element 4");
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println("size"+queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.size());*/
        
    }
} 


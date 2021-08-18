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
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class dequeue {
    public static void main(String [] args){
        //Deque deque = new LinkedList();
        //Deque deque = new ArrayDeque();
        Deque<String> deque = new ArrayDeque<>(2);
        deque.add("element 1");
        deque.add("element 3");
        deque.add("element 4");
      
        System.out.println(deque.poll());
        //System.out.println(deque.pollLast());
        //System.out.println(deque.size())
        //System.out.println(deque.poll());
       
        
      /*Deque<String> deque = new ArrayDeque<>();

      deque.add("element 0");
      deque.add("element 1");
      deque.add("element 2");
      System.out.println(deque);

      Iterator<String> iterator = deque.iterator();
      while(iterator.hasNext()){
      String element = iterator.next();
      System.out.println(element);
      }
        for(String element : deque) {
    System.out.println("\n"+element);
}
        */
    }
}

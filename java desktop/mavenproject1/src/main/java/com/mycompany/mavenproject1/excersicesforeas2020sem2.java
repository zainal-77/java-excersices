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
import java.util.*;
public class excersicesforeas2020sem2 {
    public static void main(String [] agrs){
        Stack<String> list = new Stack<String>();
                //Stack<int> stack = new Stack<int>();
        list.push("A");
        list.push("B");
        list.push("C");
        System.out.println(list);
      Stack<String> stack=new Stack<String>();
      while(list.size()>0){
         stack.add(list.remove(0));}
      while(stack.size()>0){
         list.push(stack.pop());
      }
      System.out.println(list);
    }
}

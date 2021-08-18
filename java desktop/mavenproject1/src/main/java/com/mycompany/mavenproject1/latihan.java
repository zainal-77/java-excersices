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
import java.util.Stack;
import java.util.Queue;

public class latihan {
    public static void main(String []args){
        Queue<Integer> s=new LinkedList<Integer>();
        s.add(10);
        s.add(4);
        System.out.println(s.size());
        System.out.println(s.peek());
        s.add(5);
        System.out.println(s.remove());
        s.add(3);        
        System.out.println(s.remove());
        System.out.println(s.peek());
        System.out.println(s.remove());
        s.add(7);
        System.out.println(s.peek());
        
        
        }
}

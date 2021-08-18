package com.mycompany.mavenproject4;


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
        
public class BinarySearch extends Search{
    BinarySearch(String name){
        super(name);
    }
    
    @Override
    boolean doSearch(String s, String [] data){
        Sort a= new Sort();
        a.doSort(data);
        
        //complete your code here
        int left =0;
        int right=data.length-1;
        int middle;
        while(left<=right){
            middle=(left+right)/2;
            if(s.compareTo(data[middle])==0){
                return true;
            }
            else if(s.compareTo(data[middle])<0){
                right=middle-1;
            }
            else {
                left=middle+1;
            }
        }
         return false;
        }
       
    
    @Override
    boolean doSearch(int s, int[] data){
        //complete your code here
        Sort a= new Sort();
        a.doSort(data);
        
        int left =0;
        int right=data.length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if(data[middle]==s){
                return true;
            }
            else if(s<data[middle]){
                right=middle-1;
            }
            else {
                left=middle+1;
            }
        }
        return false; // sama dengan RETURN -1
        }   
    }
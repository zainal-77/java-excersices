package com.mycompany.mavenproject4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZainalAbidin
 */
public class liniearSearch1 extends Search{
    
     liniearSearch1(String name) {
        super(name);
    }

    @Override
    boolean doSearch(String s, String[] data) {
        Sort a= new Sort();
        a.doSort(data);
        for(int i=0;i<data.length;i++){
            if(data[i].equals(s)){
                return true;
            }
        }
        return false;
    }

    @Override
    boolean doSearch(int x, int[] data) {
        Sort a= new Sort();
        a.doSort(data);
        for(int i=0;i<data.length;i++){
            if(data[i]==x){
                return true;
            }
        }
        return false;
    }
}

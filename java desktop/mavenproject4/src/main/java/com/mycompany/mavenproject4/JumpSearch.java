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

// complete your code here
public class JumpSearch extends Search {
    JumpSearch(String name) {
        super(name);
    }

    @Override
    boolean doSearch(String s, String[] data) {
        Sort a = new Sort();
        a.doSort(data);

        int n = data.length;
        int step = (int) Math.floor(Math.sqrt(n));

        int prev = 0;
        while (s.compareTo(data[Math.min(prev, n-1)]) > 0) {
            prev = step;
            step += Math.floor(Math.sqrt(n));

        }
        if (prev > n) {
            prev = n-1;
            step -= 2*(int) Math.floor(Math.sqrt(n));
        }

        while (data[prev].compareTo(s) >= 0) {
            if (prev == step)
                return false;
            if (data[prev].equals(s))
                return true;
            prev--;
        }

        return false;

    }

    @Override
    boolean doSearch(int s, int[] data) {
        Sort a = new Sort();
        a.doSort(data);

        int n = data.length;
        int step = (int) Math.floor(Math.sqrt(n));

        int prev = 0;
        while (data[Math.min(prev, n-1)] < s) {
            prev = step;
            step += Math.floor(Math.sqrt(n));

        }
        if (prev > n) {
            prev = n-1;
            step -= 2*(int) Math.floor(Math.sqrt(n));
        }

        while (data[prev] >= s) {
            if (prev == step)
                return false;
            if (data[prev]==s)
                return true;
            prev--;
        }

        return false;
    }
}

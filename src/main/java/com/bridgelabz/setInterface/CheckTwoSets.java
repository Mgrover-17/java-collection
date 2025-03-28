package com.bridgelabz.setInterface;

import java.util.HashSet;

public class CheckTwoSets {
    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        //set1.add(3);
        HashSet<Integer>set2=new HashSet<>();
        set2.add(1);
        set2.add(2);
        if (set1.size() == set2.size() && set1.containsAll(set2)) {
            System.out.println("true"); // Sets are equal
        } else {
            System.out.println("false"); // Sets are not equal
        }

    }
}

package com.bridgelabz.setInterface;

import java.util.HashSet;

public class FindSubsets {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(2);
        set.add(5);
        HashSet<Integer>set2=new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

            if(set2.containsAll(set)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
        }

    }
}

package com.bridgelabz.setInterface;

import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>();
        set1.add(1);
        set1.add(2);

        HashSet<Integer>set2=new HashSet<>();
        set2.add(2);
        set2.add(4);

        HashSet<Integer>unionSet=new HashSet<>();
        for(int n:set1){
            unionSet.add(n);
        }
        for(int n:set2){
            unionSet.add(n);
        }

        HashSet<Integer>intersectionSet=new HashSet<>();
        for(int n:set1)
        if(set2.contains(n)){
            intersectionSet.add(n);
        }

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);

    }

}

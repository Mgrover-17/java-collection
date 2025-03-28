package com.bridgelabz.setInterface;

import java.util.HashSet;

public class SymmetricDifference {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        HashSet<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        HashSet<Integer>unionSet=new HashSet<>();
        for(int n:set1){
            unionSet.add(n);
        }
        for(int n:set2){
            unionSet.add(n);
        }
        HashSet<Integer>intersectionSet=new HashSet<>();
        for(int n:set1){
            if(set2.contains(n)){
                intersectionSet.add(n);
            }
        }
        HashSet<Integer>symmetricDiffSet=new HashSet<>();
        for(int n:unionSet){
            if(!intersectionSet.contains(n)){
                symmetricDiffSet.add(n);
            }
        }
        //System.out.println(unionSet);
        //System.out.println(intersectionSet);
        System.out.println(symmetricDiffSet);
    }
}

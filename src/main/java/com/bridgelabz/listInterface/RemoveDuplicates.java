package com.bridgelabz.listInterface;

import java.util.*;


public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int num:list){
            set.add(num);
        }
        System.out.println(set);
    }
}

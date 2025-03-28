package com.bridgelabz.listInterface;

import java.util.*;

public class FindFrequency {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));
        HashMap<String,Integer>map=new HashMap<>();
        for(String count:list){
            map.put(count,map.getOrDefault(count,0)+1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

    }
}

package com.bridgelabz.listInterface;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer>reversedList=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            reversedList.add(list.get(i));
        }
        System.out.println("reversed list is: "+reversedList);
    }
}

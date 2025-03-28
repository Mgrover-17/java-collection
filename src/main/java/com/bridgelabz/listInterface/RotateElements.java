package com.bridgelabz.listInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateElements {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int rotateBy=2;

        int listSize= list.size();
        int rotatePosition=rotateBy%listSize;

        ArrayList<Integer>rotatedList=new ArrayList<>();
        rotatedList.addAll(list.subList(rotatePosition,listSize)); //from rotate position to end
        rotatedList.addAll(list.subList(0,rotatePosition));
        System.out.println(rotatedList);
    }
}

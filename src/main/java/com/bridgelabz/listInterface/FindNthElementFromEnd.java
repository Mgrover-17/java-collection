package com.bridgelabz.listInterface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class FindNthElementFromEnd {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n=2;
        Stack<String> st = new Stack<>();
        for (String ele : list) {
            st.push(ele);
        }
        if(n<=0 || n> st.size()){
            System.out.println("invalid");
            return;
        }
        for (int i = 1; i < n; i++) {
            st.pop();
        }
        System.out.println("The " + n + "nd/th element from the end is: " + st.pop());



    }
}

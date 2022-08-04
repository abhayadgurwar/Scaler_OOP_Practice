package com.Stack_Queue;

import java.util.Stack;

public class First_StackProg {
    public static void main(String[] args) {
        Stack<Integer> stackInt = new Stack<>();

        stackInt.push(2);
        stackInt.push(4);
        stackInt.push(7);

        while(!stackInt.isEmpty()){
            System.out.println(stackInt.peek());
            stackInt.pop();
        }
    }

}

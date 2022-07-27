package com.javatpoint.methodReferences;

import java.util.function.BiFunction;

class Arithmatic3{
    public static int add(int a, int b){
        return a+b;
    }
}

public class MethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Arithmatic3::add;

        int result = adder.apply(10,20);
        System.out.println(result);
    }
}

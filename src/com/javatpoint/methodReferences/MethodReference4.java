package com.javatpoint.methodReferences;

import java.util.function.BiFunction;

class Arithmatic4{
    public static int add(int a, int b){
        return a+b;
    }
    public static float add(int a, float b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }
}

public class MethodReference4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer>adder1= Arithmatic4::add;
        BiFunction<Integer, Float, Float>adder2 = Arithmatic4::add;
        BiFunction<Float, Float, Float>adder3 = Arithmatic4::add;

        int result1 = adder1.apply(10,20);
        float result2 = adder2.apply(10, 30.0f);
        float result3 = adder3.apply(20f, 50f);

        System.out.println(result1 +"--"+ result2 +"--" + result3);
    }
}
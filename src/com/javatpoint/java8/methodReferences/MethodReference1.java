package com.javatpoint.java8.methodReferences;

interface Sayable{
    void say();
}

public class MethodReference1 {

    public static void saySomething(){
        System.out.println("Hello, This is static method");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReference1::saySomething;

        sayable.say();
    }
}

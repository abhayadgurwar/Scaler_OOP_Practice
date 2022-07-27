package com.javatpoint.java8.methodReferences;

public class MethodReference2 {
    public static void  ThreadStatus(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread T2 =  new Thread(MethodReference2::ThreadStatus);

        T2.start();

        //System.out.println("--"+ ThreadStatus());
    }
}

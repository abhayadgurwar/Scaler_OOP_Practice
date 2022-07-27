package com.javatpoint.java8.methodReferences;

interface sayable{
    void say();
}
public class InstanceMethodReference1 {
    public  void saySomething(){
        System.out.println("Hello, This is non-static method");
    }

    public static void main(String[] args) {
        InstanceMethodReference1 instanceMethodReference1 =  new InstanceMethodReference1();
        Sayable sayable =  instanceMethodReference1::saySomething;
        sayable.say();

        Sayable sayable2 = new InstanceMethodReference1()::saySomething;
        sayable2.say();
    }
}

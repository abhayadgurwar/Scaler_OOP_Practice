package com.pluralsight.singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance =  DbSingleton.getInstance();
       /* DbSingleton test = new DbSingleton();*/ // Another way to create
        System.out.println(instance);

        /*DbSingleton anotherInstance =  DbSingleton.getInstance();
        DbSingleton test = new DbSingleton();
        System.out.println(anotherInstance);*/
    }
}

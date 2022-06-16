package com.scaler.constructors;

public class Student {

    String name;

    String address;
    String email;

    String batch;
    double psp;

    String state;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void changeBatch(String newBatch){ this.batch=newBatch; }

    void pauseCourse() {this.state = "PAUSED" ;}

    void abhay() {
        System.out.println("Abhay");
    }





}

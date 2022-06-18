package com.scaler.accessModifiers.packageOne;

public class Student1 {
    String name;
    private String address;
    public String email;
    String batch;
    double psp;
    String state;

    int age;

    Student1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Student1(Student1 other){
        name = other.name;
        address =  other.address;
        email =  other.email;
        psp =  other.psp;
        state =  other.state;
        age =  other.age;
    }

    public Student1() {

    }

    void changeBatch(String newBatch){ this.batch=newBatch; }
    void pauseCourse() {this.state = "PAUSED" ;}
    void abhay() {
        System.out.println("Abhay");
    }
}

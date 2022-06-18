package com.scaler.accessModifiers;
public class Student {
    String name;
    private String address;
    public String email;
    String batch;
    double psp;
    String state;

    int age;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Student(Student other){
        name = other.name;
        address =  other.address;
        email =  other.email;
        psp =  other.psp;
        state =  other.state;
        age =  other.age;
    }

    public Student() {

    }

    void changeBatch(String newBatch){ this.batch=newBatch; }
    void pauseCourse() {this.state = "PAUSED" ;}
    void abhay() {
        System.out.println("Abhay");
    }
}

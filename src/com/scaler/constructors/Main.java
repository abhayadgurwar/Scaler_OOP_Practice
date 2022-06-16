package com.scaler.constructors;

public class Main {
    public static void main(String[] args) {
        Student abhay = new Student("Abhay", "Balewadi");
       /* abhay.name = "Abhay";
        abhay.address="Balewadi";*/
        abhay.state="ACTIVE";
        abhay.pauseCourse();
        abhay.abhay();

        Student naman =  new Student("NAMAN", null);
        //naman.name="NAMAN";
        naman.batch="Best batch of Scaler";
        naman.abhay();

        System.out.println("Doing something");

    }
}

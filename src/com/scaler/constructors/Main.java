package com.scaler.constructors;

public class Main {
    public static void main(String[] args) {
        Student kartik = new Student("Abhay", "Balewadi");
       /* abhay.name = "Abhay";
        abhay.address="Balewadi";*/
        kartik.state="ACTIVE";
        kartik.pauseCourse();
        kartik.abhay();
        kartik.age=20;

        Student naman =  new Student("NAMAN", null);
        //naman.name="NAMAN";
        naman.batch="Best batch of Scaler";
        naman.abhay();
        System.out.println("Doing something");

        Student prakash =  new Student();

        Student kartikCopy =  new Student(kartik);

        System.out.println(kartik.age);
        System.out.println("-----------------");
        kartikCopy.age= 30;
        System.out.println(kartikCopy.age);

        System.out.println("Random");
    }
}

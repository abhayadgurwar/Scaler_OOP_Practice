package com.scaler.inheritance;

public class Client {

    public static void main(String[] args) {
        Instructor instructor =  new Instructor();
        instructor.name = "Naman";
        instructor.description= "Super cool";

        User user =  new User();
        user.name = "Kartk";

        Mentor mentor =  new Mentor();
        mentor.name ="Abhimanyu";
        mentor.email="abhi@gmail.com";
        mentor.description="Boss";
    }
}

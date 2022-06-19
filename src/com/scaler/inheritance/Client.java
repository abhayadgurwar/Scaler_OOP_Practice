package com.scaler.inheritance;

public class Client {

    public static void main(String[] args) {
        Instructor instructor =  new Instructor();
//        instructor.name = "Naman";
        instructor.setName("Naman");
//        instructor.description= "Super cool";
        instructor.setDescription("Super Cool");
        instructor.saySomething();

        User user =  new User();
        user.setName("Kartk");

        Mentor mentor =  new Mentor();
        mentor.setName("Abhimanyu");
        mentor.setEmail("abhi@gmail.com");
        mentor.setDescription("Boss");
    }
}

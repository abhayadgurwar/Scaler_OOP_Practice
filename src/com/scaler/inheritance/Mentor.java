package com.scaler.inheritance;

import java.util.List;

public class Mentor extends  User{

    private List<Student> mentees;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public List<Student> getMentees() {
        return mentees;
    }

    public void setMentees(List<Student> mentees) {
        this.mentees = mentees;
    }


}

package com.scaler.inheritance;

public class Instructor extends  User{

    private String assignBatch;
    private String description;

    public String getAssignBatch() {
        getPassword();
        return assignBatch;
    }

    public void setAssignBatch(String assignBatch) {
        this.assignBatch = assignBatch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

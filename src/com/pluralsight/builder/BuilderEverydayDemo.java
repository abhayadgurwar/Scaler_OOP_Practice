package com.pluralsight.builder;

public class BuilderEverydayDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("This is the example of ");

        builder.append("how to use StringBuilder");

        System.out.println(builder.toString());
    }

}

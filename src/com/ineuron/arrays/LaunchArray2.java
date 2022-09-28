package com.ineuron.arrays;

import java.util.Scanner;

public class LaunchArray2 {
    public static void main(String[] args) {
        // 2D array
        Scanner scan = new Scanner(System.in);

        int [][]arr =  new int[3][4];

        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                System.out.println("Enter marks of class " + i + " marks "+ j);
                arr[i][j]= scan.nextInt();
            }
        }
        System.out.println("Marks of students are");
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

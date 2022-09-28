package com.ineuron.arrays;

import java.util.Scanner;

public class LaunchArray3 {
    public static void main(String[] args) {
        // 3D array
        Scanner scan = new Scanner(System.in);

        int [][][]arr =  new int[3][2][3];

        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                for(int k=0; k<arr[i][j].length; k++) {
                    System.out.println("Enter marks of School " + i + " Class " + j + " Marks " + k);
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("Marks of students are");
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                for(int k=0; k<arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
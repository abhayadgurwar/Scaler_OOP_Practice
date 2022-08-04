package com.ineuron.arrays;

import java.sql.Array;
import java.util.Scanner;

public class LunchArray1 {
    public static void main(String[] args) {
        int []arr = new int[5];
        arr[0] = 10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        for (int num: arr) {
            //System.out.println(num);
        }

        int []a = new int[5];
        Scanner scan =  new Scanner(System.in);

        for(int i=0; i<a.length; i++){
            System.out.println("Please enter the marks of "+ i);
            a[i] = scan.nextInt();
        }
        for(int marks: a){
            System.out.println(marks);
        }

    }
}

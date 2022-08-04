package com.arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        // indexWithLength(2);

        //slidingWindow(4);
       // getArrayfromUser();

        inputArrayAndSort();


    }
    public static void inputArrayAndSort(){

        Scanner scn  =  new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =  scn.nextInt();
        int[] arr =  new int[n];

        for(int i = 0; i<n ;i++){
            System.out.println("Enter the value for"+ i+"th index");
            arr[i] = scn.nextInt();
        }
        //Arrays.sort(arr);
        //System.out.println("Display my array : ");
        for(int i = 0; i<n; i++){
            if(arr[i]<0)
                System.out.println(arr[i]);
        }

    }
    public static void ArrayInput2(){
        int []  arr = {1,2,3,4,5,6,-8,-5,9,-10};
        Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
    }

    public static void getArrayfromUser(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =  scn.nextInt();
        int[] arr =  new int[n];

        for(int i = 0; i<n ;i++){
            System.out.println("Enter the value for"+ i+"th index");
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Display my array : ");
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);

        }
    }


    public static void indexWithLength(int k) {
        int[] arr = {1, 2, 3, 4};
        int i, j, sum = 0;
        int len = arr.length;

        for (i = 0; i < len - k; i++) {
            for (j = i + (len - 1); j < len - 1; j++) {


            }

        }


    }

    public static void maxSubArrayWithLengthK(int k) {
        int[] arr = {1, 2, 3, 4};
        int maxSum = 0, i, j;
        int len = arr.length;
        for (i = 0; i < len - k; i++) {
            int sum = 0;
            for (j = i + (k - 1); j < len - 1; j++) {

                for (k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }

            }
        }
        System.out.println("maxSum " + maxSum);
    }

    public static void slidingWindow(int k) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxSum = 0, sum = 0, i, j;
        int len = arr.length;

        for (i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Initial SUm " + sum);
        for (i = 1; i <= len - k; i++) {
            for (j = i + k - 1; j < len - 1; j++) {
                sum = sum - arr[i - 1];
                sum = sum + arr[j];
            }
        }
        System.out.println("Sum " + sum);
    }

    public static void sumOfAllSubArraySumOptimised(int k) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxSum = 0, sum = 0, i, j, ans = 0;
        int len = arr.length;
        for (i = 0; i < len; i++) {


        }
    }

    public void printAllSubarray() {
        {
            ArrayList<String> cars = new ArrayList<String>();

            cars.add("BMW");

            System.out.println(cars);

            //ArrayList<Integer> arr[] = new ArrayList<Integer>;
            int[] arr = {1, 2, 3, 4};
            ArrayList<Integer> newArr = new ArrayList<Integer>();
            int i, j, sum = 0;
            int len = arr.length;
            for (i = 0; i < len; i++) {
                int inerSum = 0;
                for (j = i; j < len; j++) {
                    newArr.add(i);
                    newArr.add(j);
                    inerSum = inerSum + arr[j];

                    //OR
                    //sum = sum + arr[j];

                    for (int k = i; k <= j; k++) {

                        System.out.print(arr[k] + " ");
                        sum = sum + arr[k];
                        System.out.println("Sum " + sum + "\n");
                    }
                }
                System.out.println("inerSum " + inerSum);
            }
            System.out.println(sum);


        }
    }
}
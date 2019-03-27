package com.company;

import java.util.Scanner;

public class func {

    public static void main(String[] args) {
    array();
    fun(3,6);
    }
    public static int[] array(){
        int[] arr;
        int in;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        in=sc.nextInt();
        arr = new int[in];
        int max = arr[0];
        for(int i=0;i<in;i++) {
            System.out.print("You number array ");
            arr[i]=sc.nextInt();
         }
        for(int i=0;i<arr.length;i++)
            if(arr[i]>max) max =arr[i];
        System.out.print("You max number " + max + "\n");
        return arr;
    }
    public static void fun(int a, int b){
        int res = 1;
        for(int i =1;i<b;i++)
        {
            res *= a;
        }
        System.out.print("Result = " + res);

    }

}

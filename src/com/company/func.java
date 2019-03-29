package com.company;

import java.util.Scanner;

public class func {

    public static void main(String[] args) {
    array();
    int temp = func(5,3);
    System.out.println("End number " + temp);
    }

    public static int[] array(){
        int[] arr;
        int in;
        System.out.print("Enter number ");
        Scanner sc = new Scanner(System.in);
        in = sc.nextInt();
        arr = new int[in];
        int max = arr[0];
        for(int i=0;i<in;i++){
            System.out.print("Number you array ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<in;i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.print("Max number " + max + "\n");
        return arr;
    }
    public static int func(int a, int b) {
        int result = 1;
        for (int i = 1; i < b; i++)
            result *= a;
    //    System.out.print("End number ");
        return result;
    }
}

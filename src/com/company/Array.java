package com.company;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int[] arr;
        int in;
        System.out.print("Enter you number ");
        Scanner sc = new Scanner(System.in);
        in = sc.nextInt();
        arr = new int[in];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("You number array ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Max number " + max);
    }
}
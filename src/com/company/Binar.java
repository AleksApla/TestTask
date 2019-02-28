package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Binar {

    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.print("Введите число ");
        int curs = a.nextInt();
        int arr[] = new int[curs];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nSorted: \n");
        Arrays.sort(arr);
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}

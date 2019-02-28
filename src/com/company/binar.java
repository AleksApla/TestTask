package com.company;

import java.util.Scanner;

public class binar {

    public static void main(String[] args) {
        // write your code here
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.print("Введите бинарное число ");
        double curs = a.nextDouble();
        System.out.print("Введите количество ");
        double num = b.nextDouble();
        double rez = num / curs;
        System.out.println("Количество долларов " + rez);
    }


}

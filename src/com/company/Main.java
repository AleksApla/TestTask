package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.print("Введите бинарное число ");
        double curs = a.nextDouble();
        System.out.print("Введите количество ");
        double num = b.nextDouble();
        double rez =num / curs;
        double newDouble = new BigDecimal(rez).setScale(3, RoundingMode.UP).doubleValue();
        System.out.println("Количество долларов " + format(rez));

    }

    public static double format(double d){
        DecimalFormat df = new DecimalFormat("#.##");
        d = Double.valueOf(df.format(d));
        return d;
    }
}

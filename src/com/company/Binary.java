package com.company;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class Binary {
    public static void binar(int a){
        int b;
        String temp = "";
        while(a !=0){
            b = a%2;
            temp = b + temp;
            a = a/2;
        } System.out.print(temp);
    }
    public static void main(String [] args) {
        binar(3);
    }
}


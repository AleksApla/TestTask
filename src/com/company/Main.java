package com.company;

        import java.awt.*;
        import java.math.BigDecimal;
        import java.math.RoundingMode;
        import java.text.DecimalFormat;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Persone sam = new Persone(110,90);
        System.out.println("His weight " + sam.weight + "\n" + "His height " + sam.height + "\n");
        sam.say("Gorge");
        Persone vova = new Persone("Vova");
        System.out.print("His name is " + vova.name + "\n");

        Constr box = new Constr("black", 30);
            System.out.print("Color = " + box.color + "\n" + "Size box = " + box.size + "\n");


         Persone eee = new Persone();
         System.out.println(eee.weight);

    }
}

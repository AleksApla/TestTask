package com.company;

public class Persone {
    public int weight = 10;
    public int height;
    public String name;

    public void say(String sas){
        System.out.print("Hello " + sas + "\n");
    }

    public Persone(String n) {
        name = n;

    }
    public Persone(int w, int h) {
    weight = w;
    height = h;
    }
    public Persone() {

    }
    }

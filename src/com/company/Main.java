package com.company;

import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
        long[] mass = new long[100];
        for (int i = 0; i < mass.length; i++) { mass[i] = round(Math.random() * 100);}
        for (long i: mass) {System.out.print(i + " ");}
    }
}

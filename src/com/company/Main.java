package com.company;

import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
        int[][] mass = new int[25][40]; // Любые размеры 1 и 2 списка, у меня это 25 и 40
        int num = 1;
        boolean a = true;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (a) {
                    mass[i][j] = num++;
                } else {
                    mass[i][j] = num--;
                }
            }
            if (a) {num--;} else {num++;}
            num += mass[i].length;
            a = !a;
        }

        for (int[] i : mass) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}

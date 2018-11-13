package com.company;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        double a = 2;
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int exp = in.nextInt();
        a = Math.pow(a, exp);
        System.out.printf("2^" + exp + "=" + "%.0f", a);
    }
}

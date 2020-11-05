package com.codegym;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = scanner.nextInt();
        if (n < 2) {
            System.out.println(n + " number is not a Prime number.");
        } else {
            int i = 2;
            boolean prime = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime)
                System.out.print(n + " is a Prime number");
            else
                System.out.print(n + " is not a Prime number");
        }
    }
}


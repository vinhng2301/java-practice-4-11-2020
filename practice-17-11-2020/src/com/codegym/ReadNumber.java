package com.codegym;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        if (number > 10 ) {
            System.out.println("Out of reach!");
        }
        else if (number == 0) {
            System.out.printf("Zero");
        }
        else if (number == 1) {
            System.out.printf("One");
            }
        else if (number == 2) {
            System.out.printf("Two");
            }
        else if (number == 3) {
            System.out.printf("Three");
        }
        else if (number == 4) {
            System.out.printf("Four");
        }
        else if (number == 5) {
            System.out.printf("Five");
        }
        else if (number == 6) {
            System.out.printf("Six");
        }
        else if (number == 7) {
            System.out.printf("Seven");
        }
        else if (number == 8) {
            System.out.printf("Eight");
        }
        else if (number == 9) {
            System.out.printf("Nine");
        }
        else if (number == 10) {
            System.out.printf("Ten");
        }

    }
    }


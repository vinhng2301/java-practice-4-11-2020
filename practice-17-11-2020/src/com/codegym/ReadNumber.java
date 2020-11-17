package com.codegym;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        if (number > 10) {
            System.out.println("Out of reach!");
        }
        else if (number == 1) {
            System.out.printf("Một");
            }
        else if (number == 2) {
            System.out.printf("Hai");
            }
        else if (number == 3) {
            System.out.printf("Ba");
        }
        else if (number == 4) {
            System.out.printf("Bốn");
        }
        else if (number == 5) {
            System.out.printf("Năm");
        }
        else if (number == 6) {
            System.out.printf("Sáu");
        }
        else if (number == 7) {
            System.out.printf("Bảy");
        }
        else if (number == 8) {
            System.out.printf("Tám");
        }
        else if (number == 9) {
            System.out.printf("Chín");
        }
        else if (number == 10) {
            System.out.printf("Mười");
        }


    }
    }


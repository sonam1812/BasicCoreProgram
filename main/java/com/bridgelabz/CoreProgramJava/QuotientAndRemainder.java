package com.bridgelabz.CoreProgramJava;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
        System.out.println("Enter the numerator : ");
        Scanner numberScan = new Scanner(System.in);
        int numerator = numberScan.nextInt();
        System.out.println("Enter the denominator :  ");
        Scanner number2Scan = new Scanner(System.in);
        int denominator = number2Scan.nextInt();
        int quotient = numerator / denominator;
        int remainder = numerator % denominator;
        System.out.println("The quotient for given division is : " + quotient);
        System.out.println("The remainder for given division is : " + remainder);
    }
}



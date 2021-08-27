package com.bridgelabz.CoreProgramJava;
import java.util.Scanner;


public class Factors {
	 public static void main(String[] args) {
	        System.out.println("Enter number for prime factorization : ");
	        Scanner numberScan = new Scanner(System.in);
	        int number = numberScan.nextInt();
	        while (number % 2 == 0) {
	            System.out.print(2 + ",");
	            number /= 2;
	        }

	        for (int i = 3; i <= Math.sqrt(number); i += 2) {
	            while (number % i == 0) {
	                System.out.print(i + ",");
	                number /= i;
	            }
	        }

	        if (number > 2)
	            System.out.print(number);
	    }
	
}

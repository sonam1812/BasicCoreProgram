package com.bridgelabz.CoreProgramJava;
import java.util.Scanner;

public class LargestNum {
	 public static void main(String[] args) {
		 Scanner numberScan = new Scanner(System.in);
	        System.out.println("Enter the first number : ");
	       
	        int a = numberScan.nextInt();
	        System.out.println("Enter the second number : ");
	        
	        int b = numberScan.nextInt();
	        System.out.println("Enter the third number : ");
	        
	        int c = numberScan.nextInt();

	        if (a > b) {
	            if (a > c) {
	                System.out.println(a + " is the greatest.");
	            } else System.out.println(c + " is the greatest.");
	        } else if (b > c) {
	            System.out.println(b + " is the greatest.");
	        }
	    }
}



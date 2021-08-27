package com.bridgelabz.CoreProgramJava;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int num;
	        System.out.println("Enter the number to calculate if it's even or odd :");
	        Scanner input = new Scanner(System.in);
	        num = input.nextInt();
	        
	        if (num % 2 == 0) 
	            System.out.println("The number is even.");
	         
	        else
	        	System.out.println("The number is odd.");
	    }
	}





package com.bridgelabz.CoreProgramJava;
import java.util.Scanner;

public class HarmonicNum {
	 public static void main(String[] args) {
	        System.out.println("Enter the number to calculate it's harmonic : ");
	        Scanner numberScan = new Scanner(System.in);
	        int number = numberScan.nextInt();
	        float harmonic = 1;
	        for (int i = 2; i <= number; i++) {
	            harmonic += (float) 1 / i;
	        }
	        System.out.println(harmonic);
	    }
	}




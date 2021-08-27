package com.bridgelabz.CoreProgramJava;
import java.util.Scanner;
public class PoweOf2 {
	 public static void main(String[] args) {
		    
		  
	        System.out.println("Enter a number for power of 2 : ");
	        Scanner numberScan = new Scanner(System.in);
	        int number = numberScan.nextInt();
	        int num = 2;
	        for (int i = 1;i < number; i++)
	        {
	             num *= 2;
	        }
	        System.out.println(num);
	    }
	}


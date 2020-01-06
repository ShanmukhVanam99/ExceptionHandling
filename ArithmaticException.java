package com.to.ExceptionHandling;

import java.util.Scanner;

public class ArithmaticException {
	public static void main(String args[]) 
{ 
    Scanner scn = new Scanner(System.in); 
    try
    { 
        int n = Integer.parseInt(scn.nextLine()); 
        if (99%n == 0) 
            System.out.println(n + " is a factor of 99"); 
    } 
    catch ( ArithmeticException e) 
    { 
        System.out.println("Exception encountered " + e); 
    } 
    scn.close();
}

}

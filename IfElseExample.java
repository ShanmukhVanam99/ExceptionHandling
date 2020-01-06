package com.to.cj2;

import java.util.Scanner;

public class IfElseExample {

	private static Scanner sc;

	public static void main(String[] args) {
		int a = 0,b = 0,c = 0;
		try{
		
		 sc = new Scanner(System.in);
		 System.out.println("enter a value");
		 a=sc.nextInt();
		 System.out.println("enter b value");
		 b=sc.nextInt();
		 System.out.println("enter c value");
		 c=sc.nextInt();
		}
		catch(Exception e){
			System.out.println("Exception has occured "+e);
		}
		 
		 if(a>b)
		 {
			 if(a>c)
			 {
				 System.out.println("a is the biggest number");
			 }
		 }
		
		 else if(b>c)
		 {
			 System.out.println("b is the biggest number");
		 }
		 else
		 {
			 System.out.println("c is the biggest number");
		 }
		 }
	
	

	
}



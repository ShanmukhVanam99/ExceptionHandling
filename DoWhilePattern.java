package com.to.cj3;

import java.util.Scanner;

public class DoWhilePattern {

	private static Scanner sc;

	public static void main(String[] args) {
		int i=0,j,n = 0;
		try{
		sc = new Scanner(System.in);
		System.out.println("enter n value");
		 n=sc.nextInt();
		}
		catch(Exception e){
			System.out.println("Exception has occured plz rectify what you have typed "+e);
		}
		do                                                                
		   {                                                                          
			System.out.println("   ");                                                          
		      j=0;                                                                    
		      do                                                             
		       {                                                                      
		    	  System.out.print(" * ");                                                       
		         j++;                                                                 
		       }while(j<=i);                                                                     
		       System.out.println("");                                                          
		       i++;                                                                   
		   }while(i<n);
		
	}

}

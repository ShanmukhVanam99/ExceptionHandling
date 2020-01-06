package com.to.ExceptionHandling;

public class ArrayIndexOutOfBoundsException {
	public static void main(String args[])
	   {
	      try{
	        int a[]=new int[10];
	        //Array has only 10 elements
	        a[11] = 9;
	      }
	      catch(Exception e){
	         System.out.println ("Exception has occured "+e);
	      }
	   }

}

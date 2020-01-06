package com.to.ExceptionHandling;

public class StringIndexOutOfBoundException {
	public static void main(String args[])
	   {
	      try{
		 String str="beginnersbook";
		 System.out.println(str.length());;
		 char c = str.charAt(0);
		 System.out.println(c);
		 c = str.charAt(40);
		 System.out.println(c);
	      }catch(StringIndexOutOfBoundsException e){
		  System.out.println("Exception hass occured"+e);
	       }
	   }

}

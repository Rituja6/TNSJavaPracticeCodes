// Program to define overloaded methods for Palindrome checking
package com.dayten.compiletimepolymorphism;

public class Operations {
	
	// check whether number is palindrome
	public static boolean isPalindrome(int number)
	{
		int rev =0;
		int dummyNumber = number; 
		
		while(number!=0)
		{
			rev = rev*10+number%10;     
			number /=10;	
		}
		return dummyNumber == rev;
	}
	
	public static boolean isPalindrome(String str)
	{
		String rev;
		rev = new StringBuffer(str).reverse().toString();
		return str.equals(rev);
		
	}
	
    	

}

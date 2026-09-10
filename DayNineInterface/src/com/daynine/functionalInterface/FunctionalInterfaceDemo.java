package com.daynine.functionalInterface;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		GreetClass g = new GreetClass();
		System.out.println(g.Greet()); 
		
		// using Lambda Expression 
		
		GreetInterface g1 = () -> {
			return "Good Morning";
		};
		
		System.out.println(g1.Greet());
	}

}

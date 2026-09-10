package com.daytwo.loopingstatement;

public class NestedForLoopDemo {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++)  //rows // outer for loop
		{
			for(int j=1; j<=i; j++) //coloumns // inner for loop
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}

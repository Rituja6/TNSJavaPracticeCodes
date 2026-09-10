package com.daythree.accessmodifiers;

public class PublicDemo { // outer class

	public class loopdemo
	{
		//innerclass
	}
	
	public void data()
	{
		int a =10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PrivateDemo obj1 = new PrivateDemo(); // can not access the private method
//		obj1.show();
//		
		
		DefaultDemo obj2 = new DefaultDemo();
		obj2.data();
		
		

	}

}

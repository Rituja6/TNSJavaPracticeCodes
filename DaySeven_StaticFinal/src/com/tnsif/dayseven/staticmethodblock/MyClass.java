package com.tnsif.dayseven.staticmethodblock;

public class MyClass {
private int section;
private static int srNo;

//static method
static void display()
{
	System.out.println("Serial No"+ srNo);
	//System.out.println(section);
}

void data()
{
	System.out.println("Serial No"+ srNo);

}

// static block 

 static{
   System.out.println("Static Block");	
}
public static void main(String[] args) {
	MyClass obj = new MyClass();
    MyClass.display();
}
}

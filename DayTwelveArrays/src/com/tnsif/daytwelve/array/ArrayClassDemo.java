package com.tnsif.daytwelve.array;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {

		//Get the Array
	int intArr[] = {10,20, 15, 22, 35, 18, 14};
	
	//To Print the elements in one line 
		System.out.println("Array is "+ Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		System.out.println("________After Sorting___________");
		System.out.println("Array is "+ Arrays.toString(intArr));
		
		int intKey = 22;
		System.out.println(intKey + "Found at index = "+ Arrays.binarySearch(intArr,intKey));
		System.out.println(intKey + "Found at index = "+ Arrays.binarySearch(intArr, 1, 6, intKey));
		
		System.out.println("First Array : "+ Arrays.toString(intArr));
		
		int intArr1[]= {10, 15, 22};
		System.out.println("Second Array : "+ Arrays.toString(intArr1));
		
		// To compare both arrays
		if(Arrays.equals(intArr, intArr1))
		{
			System.out.println("Both arrays are equal");
		}
		else
			System.out.println("Arrays are not equal");


		// creates a new array with a specified length
		System.out.println("\nNew Arrays by copyOF:\n");
		int intArr2[] = Arrays.copyOf(intArr, 10);
		System.out.println("Array is "+ Arrays.toString(intArr2));
		intArr2[8]=55;
		System.out.println("Array is "+ Arrays.toString(intArr2));
		
		//To fill the arrays with key 22
		Arrays.fill(intArr, intKey);
		System.out.println("Integer array after filling 22 : "+ Arrays.toString(intArr));



	}

}

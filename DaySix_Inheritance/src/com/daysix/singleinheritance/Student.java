//Program to demonstrate Single inheritance
package com.daysix.singleinheritance;

public class Student extends Citizen{  // child class
	private int rollNo;
	private String collegeName;
	
	public Student() {
		super();
	}

	public Student(String name, long adharNo, String address, long phone, int rollNo, String collegeName) {
		super(name, adharNo, address, phone);

		 this.rollNo = rollNo;
		 this.collegeName= collegeName;
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", Address=" + getAddress() + ", getPhone()=" + getPhone()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
	
	
	
	

}

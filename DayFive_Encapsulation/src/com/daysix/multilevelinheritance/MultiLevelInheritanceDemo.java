//Program to demonstrate Multilevel Inheritance
package com.daysix.multilevelinheritance;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {

		Person p1 = new Person("Atharva", 8978677681l);
		System.out.println(p1);

		p1 = new Employee("Pranav", 6768493212l, "IT", 45609d);
		System.out.println(p1);
		
		p1 = new LevelOneEmployee("Madhura",9876854323l, "Account", 60000, 7898, "Signing authority");
		System.out.println(p1);

		
		int a =10;
		
	}

}

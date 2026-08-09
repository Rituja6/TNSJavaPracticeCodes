import java.util.Scanner;

public class Commission {
	private String name;
	private String address;
	private long phone;
	private double sales_amount; 

public void acceptDetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter full name:");
	name=sc.nextLine();
	System.out.println("Enter address:");
	address=sc.nextLine();
	System.out.println("Enter phone no:");
	phone=sc.nextLong();
	System.out.println("Enter sales_amount:");
	sales_amount=sc.nextDouble();
	
	sc.close();
}

public void calculateCommission() {
	double commission=0;
	
	if(sales_amount>=100000) {
		commission=sales_amount*0.10;
	}else if(sales_amount>=50000 && sales_amount<100000){
		commission=sales_amount*0.05;
	}else if(sales_amount>=30000 && sales_amount<50000) {
		commission=sales_amount*0.03;
	}else {
		commission=0;
	}
	System.out.println("---Details---");
	System.out.println("Name:"+name);
	System.out.println("Address:"+address);
	System.out.println("Phone no:"+phone);
	System.out.println("Sales_amount:"+sales_amount);
	System.out.println("Calculated commission:"+commission);
	
}
}



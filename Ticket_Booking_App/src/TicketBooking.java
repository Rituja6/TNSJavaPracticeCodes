import java.util.Scanner;

public class TicketBooking {
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	
	public TicketBooking() {
		System.out.println("Default constructor");
	}

	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}

	public String getStageEvent() {
		return stageEvent;
	}

	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public void processBooking(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter stage event:");
		stageEvent=sc.next();
		System.out.println("Enter Customer name:");
		customer=sc.next();
		System.out.println("Enter Number of seats:");
		noOfSeats=sc.nextInt();
		
		System.out.println("---Select Payment Mode---");
		System.out.println("1. Cash");
		System.out.println("2.Wallet");
		System.out.println("3.Credit card");
		System.out.println("Enter choice from(1-3):");
		int choice=sc.nextInt();
		
		if(choice==1) {
			System.out.println("Enter amount:");
			double amount=sc.nextDouble();
			makePayment(amount);
		}else if(choice==2) {
			System.out.println("Enter wallet number:");
			String walletNo=sc.next();
			System.out.println("Enter amount:");
			double amount =sc.nextDouble();
			makePayment(walletNo,amount);
		}else if(choice==3) {
			System.out.println("Enter credit card number:");
			String card=sc.next();
			System.out.println("Enter CCV:");
			String ccv=sc.next();
			System.out.println("Enter card holder name:");
			String name=sc.next();
			System.out.println("Enter amount:");
			double amount=sc.nextDouble();
			makePayment(card,ccv,name,amount);
		}else {
			System.out.println("Invalid choice");
		}
		sc.close();
	}
	
	public void makePayment(double amount) {
		System.out.println("StageEvent:"+stageEvent);
		System.out.println("Customer:"+customer);
		System.out.println("No of Seats:"+noOfSeats);
		System.out.println("Amount:"+amount);
	}
	public void makePayment(String walletNo,double amount) {
		System.out.println("StageEvent:"+stageEvent);
		System.out.println("Customer:"+customer);
		System.out.println("No of Seats:"+noOfSeats);
		System.out.println("Wallet No:"+walletNo);
		System.out.println("Amount:"+amount);
	}
	public void makePayment(String card,String ccv,String name,double amount) {
		System.out.println("Card:"+card);
		System.out.println("CCV:"+ccv);
		System.out.println("Name:"+name);
		System.out.println("Amount:"+amount);
	}
}

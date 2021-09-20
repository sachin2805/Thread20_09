package thread;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Booking extends Thread
{
	String name,train,cm;
	int age,z;
	Booking(String name)
	{
		this.name=name;
	}
	Scanner sc = new Scanner(System.in);
	void display()
	{
		System.out.println("\nDetails : \nName : "+name+"\nAge : "+age);
		System.out.println("Save press 1 otherwise any = ");
		int x=sc.nextInt();
		next(x);
	}
	void pay()
	{
		System.out.println("Payment is succesfull....");
		System.out.println("Your Ticked is Booked ... \nName : "+name+"\nAge : "+age+"\nTrain name : "+train+"\nCompartment : "+cm);
		MultiThread20_09_21 c=new MultiThread20_09_21();
		c.main(null);
	
			
	}
	void next(int x)
	{
		if(x==1)
		{
			System.out.println("Enter Train : ");
			train=sc.next();
			System.out.println("Enter Compartment :\n1.Sleeper\n2.AC\n3.Genral");
			int y=sc.nextInt();
			if(y==1) {
			System.out.println("Pay bill 210");
			cm="Sleeper";}
			else if(y==2) {
			System.out.println("Pay bill 500");
			cm="AC";}
			else {
			System.out.println("Pay bill 100");
			cm="General";}
			
			System.out.println("Press 1 to pay ,Press 2 for back,Press any for cancel = ");
			z=sc.nextInt();
			if(z==1)
				pay();
			else if(z==2)
			next(1);
			else
				System.out.println("your Transaction is canceled.. !!!");
				
		}
		else
		{
			System.out.println("\nFill again\nEnter Name : ");
			name=sc.next();
			System.out.println("Enter Age : ");
			age=sc.nextInt();
			display();
		}
	}
	public void run()
	{
		
		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter Age : ");
		age=sc.nextInt();
		display();
		
	
	}
}
class Booking1 extends Booking implements Runnable
{
	Thread t;
	Scanner sc = new Scanner(System.in);
	
	Booking1(String name)
	{
		super(name);
	
		
	
		t=new Thread(this,name);
	}
	void check(String x)
	{
		
		if(name==x)
		{
			System.out.println("Your Booking is done ... ");
		}
	}
	@Override
	public void run() {

		System.out.println("For checking booking status \nEnter the name : ");
		String xname=sc.next();
		
		check(xname);
	}

}
public class MultiThread20_09_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("_____________Steps_____________\n1.Profile\n2.Select Train\n3.Select Compartment\n4.Pay Bill\n5.Confirmation");
		System.out.println("1.Booking\n2.Cheking");
		int ch=sc.nextInt();
		Booking b=new Booking("Dev");
		b.start();
	
		
	  try {
		TimeUnit.SECONDS.sleep(10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 Runnable r1 = new Booking1("");
		Thread t1=new Thread(r1);
		t1.start();
		
		//Booking1 b1 = new Booking1("Dev");
	}

}

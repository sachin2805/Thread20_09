package thread;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Thread_main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to thread ");
	
		Runnable r1=new Runnable()
		{
			public void run()
			{
				System.out.println("Undefined --> Email");
			}
			
		};
		Runnable r2=new Runnable()
		{
			public void run()
			{
				System.out.println("Offers --> Email");
			}
			
		};
		Runnable r3=new Runnable()
		{
			public void run()
			{
				System.out.println("Selection --> Email");
			}
			
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r1);
		t1.start();
		t2.start();
		t3.start();
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("bye");

	}

}
/*OUTPUT
Welcome to thread 
Undefined --> Email
Undefined --> Email
Undefined --> Email
bye
*/
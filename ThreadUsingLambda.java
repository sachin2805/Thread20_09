package thread;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class ThreadUsingLambda {

	public static void main(String[] args) {
			
			System.out.println("Welcome to thread ");

			Thread t1=new Thread(()->System.out.println("Undefined --> Email"));
			Thread t2=new Thread(()->System.out.println("Offers --> Email"));
			Thread t3=new Thread(()->System.out.println("Selection --> Email"));
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
Offers --> Email
Selection --> Email
bye
*/



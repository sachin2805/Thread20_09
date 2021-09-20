package thread;

import java.util.concurrent.TimeUnit;

class ConnectSql implements Runnable
{

	Thread t;
	String db;
	ConnectSql(String db)
	{
		this.db=db;
		t=new Thread(this,db);  //create object of thread
	}
	@Override
	public void run() {
		System.out.println("Connection Of Mysql ->"+db);
	}
	
}
public class ThreadAll {a

	public static void main(String[] args) {
		ConnectSql s=new ConnectSql("DataBase");
		s.t.start();
	
		try {
			TimeUnit.SECONDS.sleep(2);  //Use For Proper sequence or for maintain sequence
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		ConnectSql s1=new ConnectSql("Cloud");
		s1.t.start();
		
		try {
			TimeUnit.SECONDS.sleep(2);  //Use For Proper sequence or for maintain sequence
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		ConnectSql s2=new ConnectSql("Oracle");
		s2.t.start();
	}

}

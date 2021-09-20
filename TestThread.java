package thread;


class ConnectSql extends Thread
{

	@Override
	public void run() {
		System.out.println("Connection Of Mysql");
	}
	
}
public class TestThread {

	public static void main(String[] args) {
		ConnectSql s=new ConnectSql();
		s.start();
		

	}

}
/*OUTPUT :
Connection Of Mysql
*/
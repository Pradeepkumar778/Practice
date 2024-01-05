package assisted;

class ThreadDm1 extends Thread {
	public void run()
	{
		for (int i=1;i<=5;i++ )
		{
			System.out.println("Thread-A - " + i);
		}
		
	}
}
class ThreadDm2 extends Thread {
	public void run()
	{
		for (int i=1;i<=5;i++ )
		{
			System.out.println("Thread-B - " + i);
		}
		
	}
}
class ThreadDm3 implements Runnable {
	public void run()
	{
		System.out.println("Creating a Thread by Implementing Runnable");
	}
}

public class threadDemo {

	public static void main(String[] args) {
		ThreadDm1 td1 = new ThreadDm1();
		ThreadDm2 td2 = new ThreadDm2();
		
	    td1.start();
		td2.start();
		
		ThreadDm3 td3 = new ThreadDm3();
		Thread th = new Thread(td3);
        th.start();
	}

}

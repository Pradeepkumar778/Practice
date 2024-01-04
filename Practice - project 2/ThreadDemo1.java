package assisted;
class Demoth extends Thread {
	public void run() 
	{
		for (int i=1;i<=5;i++) 
		{
		System.out.println("Thread X -" + i);
		
		try
		{
			Thread.sleep(1000);
	    }
		catch(Exception e) {}
        }
	  }
	}
public class ThreadDemo1 {

	public static void main(String[] args) {
		Demoth dt = new Demoth();
		dt.start();

	}

}

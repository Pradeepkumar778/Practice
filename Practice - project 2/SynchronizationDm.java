package assisted;
class sharedResources
{
	public synchronized void wish(String name) 
	{
		for (int i=1;i<=5;i++) 
		{
			System.out.println("Good Morning "+ name);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}
class sync extends Thread
{
	private String name;
	private sharedResources sr;
	
	public sync(String name , sharedResources sr)
	{
		this.name = name;
		this.sr = sr;
	}
	public void run()
	{
		sr.wish(name);
	}
	
}

public class SynchronizationDm {

	public static void main(String[] args) {
		sharedResources sr = new sharedResources ();
		
		sync s1 = new sync("pradeep",sr);
		s1.start();
		
		sync s2 = new sync("pavan",sr);
		s2.start();
				

	}

}

package assisted;

interface Myinterface1
{
	default void show()
	{
		System.out.println("Default Myinterface1");
	}
}
interface Myinterface2
{
	default void show()
	{
		System.out.println("Default Myinterface2");	
	}
}

public class DiamondDemo implements Myinterface1,Myinterface2 {
	public void show()
	{
	Myinterface1.super.show();
	Myinterface2.super.show();
	}

	public static void main(String[] args) {
		DiamondDemo obj = new DiamondDemo();
		obj.show();
	

	}

}

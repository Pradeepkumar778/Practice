package assisted;

class method 
{
	public void Division(int x, int y)
	{
		int z=x/y;
		System.out.println("The value of Z is " + z);
	}
	
}
public class callingMethod {

	public static void main(String[] args) {
	
		method md = new method();
		md.Division(12,6);
		

	}

}

package assisted;

class Demo
{
	Demo(int a ,int b)
	{
		int c = a+b;
		System.out.println("The value of c is "+ c);
	}
	Demo()
	{
		System.out.println("This is a constructor without paramters");
	}
}
public class Const {

	public static void main(String[] args) {
		
		Demo dm = new Demo(10,20);
		Demo dm1 = new Demo();

	}

}

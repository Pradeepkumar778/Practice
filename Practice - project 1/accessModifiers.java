package assisted;

class modifiers{
	
	public void Sample1()
	{
		System.out.println("This is public access modifier");
	}
	private void Sample2()
	{
		System.out.println("This is private access modifier");
	}
	protected void Sample3()
	{
		System.out.println("This is protected access modifier");
	}
	void sample4()
	{
		System.out.println("This is Default access modifier");
	}
}


public class accessModifiers extends modifiers {

	public static void main(String[] args) {
		modifiers mod = new modifiers();
		accessModifiers A = new accessModifiers();
	    mod.Sample1();
		//mod.sample2();
		mod.Sample3();
		mod.sample4();

	}

}

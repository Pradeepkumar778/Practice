package assisted;
import java.util.*;

public class TryCatchdm {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter two number ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int c = a*b;
			System.out.println("The multiplication of two numbers "+ c);
			
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("value should be a integer");
		}
		
		
		

	}

}

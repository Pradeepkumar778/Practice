package assisted;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
	
	try 
	{
		System.out.println("Starting of try block");
		System.out.println("Enter the first number :");
		int x = sc.nextInt();
		System.out.println("Enter the second number :");
		int y = sc.nextInt();
		
		int z = x/y;
		System.out.println("division of two values is : " + z);
		
	}catch (Exception e)
	{
		System.out.println("This is catch block");
		System.out.println(e);
	}

	}

}

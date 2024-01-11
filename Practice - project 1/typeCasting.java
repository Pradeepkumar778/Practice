package assisted;

public class typeCasting {

	public static void main(String[] args) {
		
		//implicit 
		System.out.println("Implicit Type Casting");
		int a = 100;
		System.out.println("The interger value is : "+ a );
		
		double b = a;
		System.out.println("The double value is : "+ b );
		
		//explicit
		System.out.println("Explicit Type Casting");
		double c = 75.75;
		System.out.println("The double value is : "+ c );
		
		int d = (int)c;
		System.out.println("The double value is : "+ d );
	}

}

package assisted;
import java.util.*;

public class FourthSmallestElement {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int n=s.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.print("Enter "+(i+1)+" Element : ");
			arr.add(s.nextInt());
		}
		Collections.sort(arr);
		System.out.println("Fourth smallest element in the array is : "+arr.get(3));
		
	 }

}

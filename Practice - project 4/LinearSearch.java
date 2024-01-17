package assisted;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {25,2,90,45,55,60,75,100};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value to search : ");
		int value=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				System.out.println("Value found at "+(i+1)+ " position");
				return;
			}
		}
		System.out.println("Value not found");

	  }
 
	}



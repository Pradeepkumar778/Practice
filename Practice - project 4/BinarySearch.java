package assisted;
import java.util.*;
import java.util.Scanner;

public class BinarySearch {
	public static void BinarySearching(int x[], int sval, int findex, int lindex)
	{
		int mid = (findex+lindex)/2;
		
		while(findex<=lindex)
		{
			if(x[mid]==sval)
			{
				System.out.println("Value Found...");
				break;
			}
			else if(x[mid]<sval)
				findex = mid+1;
			else if(x[mid]>sval)
				lindex = mid-1;
			
			mid = (findex+lindex)/2;
		}
		
		if(findex>lindex)
			System.out.println("Value Not Found");
	}

	public static void main(String[] args) {
		int x[] = {11,13,4,25,16,10};
		System.out.println("Array Values : ");
		
		for(int n : x)
			System.out.print(n + "\t");
		
		Arrays.sort(x);

		System.out.println("\nArray Values in Sorted Order : ");
		
		for(int n : x)
			System.out.print(n + "\t");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter value to Search : ");
		int sval = sc.nextInt();

		BinarySearching(x, sval, 0, x.length-1);
	}

	}



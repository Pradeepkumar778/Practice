package assisted;

class SortingMethods{
	public int[] BubbleSortAlg(int x[])
	{
		for(int i=0;i<x.length;i++) 
		{
			for(int j=i+1;j<x.length;j++) 
			{
				if(x[i]>x[j])
				{
					int temp = x[i]; 
					x[i] = x[j]; 
					x[j] = temp;
				}
			}
		}
		return x;
	}
}

public class BubbleSort {

	public static void main(String[] args) {
		SortingMethods sm = new SortingMethods();
		int x[] = {7,12,10,9,3};
		System.out.println("Before Sorting : ");
		for(int n:x)
		{
			System.out.print(n + "\t");
		}
		System.out.println("\nAfter Sorting(Bubble Sort) : ");
		for(int n : sm.BubbleSortAlg(x))
		{
			System.out.print(n + "\t");
		}

	}


	}


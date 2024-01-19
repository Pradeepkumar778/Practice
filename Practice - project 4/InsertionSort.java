package assisted;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {

		int[] arr= {100,50,25,80,60,45,15};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					swap(arr,j-1,j);
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		

	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	   }

	}



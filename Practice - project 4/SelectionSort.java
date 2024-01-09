package assisted;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {35,90,12,25,50,5};
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	 }
	}

	



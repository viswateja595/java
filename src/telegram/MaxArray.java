package telegram;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArray {
	
	void maxArray(int[] arr, int length)
	{
		int[] result=Arrays.copyOf(arr, length);
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		for (int i = 0; i < result.length; i++) {
			if(max==result[i])
			{
				System.out.println(result[i]);
				System.out.println(i);
			}
		}
	}
	public static void max(int arr[])
	{
		int index=0;
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[j]<arr[i])
				{
					max=arr[i]; index=j;
				}
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int length=scanner.nextInt();
		int[] arr=new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
	MaxArray maxArray=new MaxArray();
	maxArray.maxArray(arr, length);
	max(arr);
	}
}

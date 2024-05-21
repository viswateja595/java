package viswe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

class HackerRank{
	
	public static void main(String []argh)
	{
		int length=5;
		int arr[]= {1,-2,4,-5,1};
		int negetive=0;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = i; j < arr.length; j++) {
				sum+=arr[j];
				if(sum<0)
					negetive++;
			}
		}
		System.out.println(negetive);
	}
}
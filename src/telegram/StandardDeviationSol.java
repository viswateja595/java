package telegram;

import java.util.Scanner;

public class StandardDeviationSol {
	
	public static void standardDeviation(int arr[],int n) {
		double average=0;
		double standardDeviation=0;
		for (int i = 0; i < arr.length; i++) {
			average=average+arr[i];
		}
		average=average/n;
		System.out.println(average);
		
		for (int i = 0; i < arr.length; i++) {
			standardDeviation=standardDeviation+Math.pow((arr[i]-average),2);
		}
		System.out.println(standardDeviation);
		System.out.println(standardDeviation/n);
	}
	
	public static void main(String[] args) {
		int[] arr= {3,8,4,2,5,6,7};
		standardDeviation(arr, 7);
	}
}

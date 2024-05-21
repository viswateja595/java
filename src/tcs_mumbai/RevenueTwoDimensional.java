package tcs_mumbai;

import java.util.List;
import java.util.Scanner;

public class RevenueTwoDimensional {
	public static void result(int[][] array)
	{
		for (int k = 0; k < array.length; k++) {
			int max=array[k][0];
			for (int k2 = 0; k2 < array[0].length; k2++) {
				if(array[k][k2]>=max)
					max=array[k][k2];
			}
			System.out.print(max+" ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i=3,j=4;
		int[][] array=new int[i][j];
		for (int k = 0; k < i; k++) {
			for (int k2 = 0; k2 < j; k2++) {
				array[k][k2]=scanner.nextInt();
			}
		}
		result(array);
		
	}
}

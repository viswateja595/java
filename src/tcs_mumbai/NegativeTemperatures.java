package tcs_mumbai;

import java.util.Scanner;

public class NegativeTemperatures {
	
	public static int productsAtNegativeTemperatures(int temperature[])
	{
		int count=0;
		for (int i = 0; i < temperature.length; i++) {
			if(temperature[i]<0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int temperature_size=scanner.nextInt();
		int temperature[]=new int[temperature_size];
		for (int i = 0; i < temperature.length; i++) {
			temperature[i]=scanner.nextInt();
		}
		int result=productsAtNegativeTemperatures(temperature);
		System.out.println(result);
		
	}
}

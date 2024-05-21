package telegram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pin {
	public static int getMaximum(int number) {
		List<Integer> max=new ArrayList<>();
		while (number >0) {
			int digit=number%10;
			number=number/10;
			max.add(digit);
		}
		Collections.sort(max);
		return max.get(max.size()-1);
	}
	
	public static int getMinimum(int number) {
		List<Integer> max=new ArrayList<>();
		while (number >0) {
			int digit=number%10;
			number=number/10;
			max.add(digit);
		}
		Collections.sort(max);
		return max.get(0);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int input1=scanner.nextInt();
		int input2=scanner.nextInt();
		int input3=scanner.nextInt();
		int input4=scanner.nextInt();
		int result=(getMaximum(input1)*getMinimum(input1))*(getMaximum(input2)*getMinimum(input2))*(getMaximum(input3)*getMinimum(input3))-input4;
		System.out.println(result);
		scanner.close();
	}
}

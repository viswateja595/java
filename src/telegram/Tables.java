package telegram;

import java.util.Scanner;

public class Tables {
	
	public static void result(int n)
	{
		for (int i = 1; i < 11; i++) {
			System.out.println(n +" * "+i+" = "+n*i);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=scanner.nextInt();
		result(n);
		scanner.close();
	}
}

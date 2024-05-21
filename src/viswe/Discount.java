package viswe;

import java.util.Scanner;

public class Discount {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the total cost:");
		double totalPrice=scanner.nextDouble();
		if(totalPrice<500)
			System.out.println(totalPrice-(totalPrice/100*5));
		else if(totalPrice>=500 && totalPrice<2500)
			System.out.println(totalPrice-(totalPrice/100*10));
		else if(totalPrice>=2500)
			System.out.println(totalPrice-(totalPrice/100*20));
	}
}

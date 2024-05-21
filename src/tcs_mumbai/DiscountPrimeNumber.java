package tcs_mumbai;

import java.util.ArrayList;
import java.util.List;

public class DiscountPrimeNumber {

	public static void main(String[] args) {
		int i=578;
		List<Integer> list=new ArrayList<>();
		while (i>0) {
			int digit=i%10;
			list.add(digit);
			i=i/10;
		}
		int discount=0;
		for (Integer integer : list) {
			if(integer%2!=0)
				discount+=integer;
		}
		System.out.println(discount);
	}
}

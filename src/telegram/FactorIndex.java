package telegram;

import java.util.ArrayList;
import java.util.List;

public class FactorIndex {
	
	public static long getFactor(int number,int index)
	{
		List<Long> list=new ArrayList<>();
		for (int i = 1; i <= number; ++i) {
			if(number % i==0)
				list.add((long) i);
		}
		if(list.size()>index)
			return list.get(index-1);
		else
			return 0;
	}
	public static void main(String[] args) {
		System.out.println(getFactor(10,3));
	}
}

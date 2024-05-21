package telegram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMinSort {
	
	public static void main(String[] args) {
		int[] arr= {-6,10,8,-5,-14,-17,23,-20,-18,-19};
		List<Integer> negitive=new ArrayList<>();
		List<Integer> positive=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0)
				negitive.add(arr[i]);
			else
				positive.add(arr[i]);
		}
		negitive.addAll(positive);
		negitive.forEach(i->System.out.print(i+" "));
	}
}

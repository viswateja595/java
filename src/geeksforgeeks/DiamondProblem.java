package geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class DiamondProblem {
	
	public static int result(List<Integer> list) {
		int result=0;
		for (int i = 0; i < list.size(); i++) {
			int count=0;
			for (int j = 1; j < list.size(); j++) {
				if(list.get(i)==list.get(j))
				{
					count++;
					list.remove(i);
					list.remove(j);
					break;
				}
			}
			result+=count;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] ar= {10,20,20,10,10,30,50,10,20};
		List<Integer> list=new ArrayList<>();
		for (int i : ar) {
			list.add(i);
		}
		System.out.println(result(list));
	}
	
}

package tcs_mumbai;

import java.util.ArrayList;
import java.util.List;

public class Misses {
	public static void main(String[] args) {
		int arr[]= {3,2,3};
		List<Integer> result=new ArrayList<>();
		result.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			result.add(result.get(i-1)+arr[i]);
		}
		System.out.println(result);
		int sum=0;
		for (Integer integer : result) {
			sum+=integer;
		}
		System.out.println(sum);
	}
}

package geeksforgeeks;

import java.util.Arrays;

public class Help_Big_Pig {

	public static int[] findMin(int n, int q, int gain[], int loss[], int query[]) {
		int result[]=new int[query.length];
		
		for (int i = 0; i < query.length; i++) {
			int count = 0;
			
			for (int j =gain.length-1; j >= 0; j--) {
				for (int j2 = gain.length-2; j2>=0; j2--) {
					int sum=0;
					sum=sum+gain[j];
					
					if(query[i]==sum)
					{
						System.out.println(sum);
						count++;
						break;
					}
				}
				result[i]=count;
				}
				}
			
		for (int i : result) {
			System.out.println(i);
		}
		return result;
		
	}
	public static void main(String[] args) {
		int n = 5;
		int q = 5;
		int[] gain= {1,2,3,4,5};
		int[] loss= {0,0,0,0,0};
		int[] query= {5,9,8,11,17};
		
		System.out.println(" "+Integer.compare(Arrays.stream(gain).sum(), Arrays.stream(query).sum()));		
		findMin(n, q, gain, loss, query);
		
		
	}
	
}

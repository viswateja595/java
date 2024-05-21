package tcs_mumbai;

public class PrimenumberRange {

	public static void main(String[] args) {
		int i=-30,j=-11;
		int rangeSum=0;
		for (int k = i; k <= j; k++) {
			if(k%2!=0) {
				System.out.println(k);
				rangeSum+=k;
			}
		}
		System.out.println(rangeSum);
		System.out.println(-21%2);
		
	}
}

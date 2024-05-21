package geeksforgeeks;

public class Triplets {
	
	public static void main(String[] args) {
		int a[]= {3,3,4,7,8};
		int d=5;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				for (int j2 = 2; j2 < a.length; j2++) {
					if(a[i]+a[j]+a[j2]/d==0)
						count++;
				}
			}
		}
		System.out.println(count);
		
	}
}

package telegram;

public class Squares {

	public static int result(int n)
	{
		int sum=0;
		for (int i = n; i > 0; i--) {
			sum+=i*i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n=4;
		System.out.println(result(n));
	}
}

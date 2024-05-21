package telegram;import java.util.function.BiConsumer;

public class AddNthElement {
	public static int sumSuccessiveElements(int[] arr,int length,int n)
	{
		int sum=0;
		for (int i = n-1; i < arr.length; i+=n) {
				sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {10,12,16,1,5,6,3,21};
		System.out.println(sumSuccessiveElements(arr, 8, 3));
	}
}

package telegram;

public class Triplet {
	
	public static void result(int[] arr, int d)
	{
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int j2 = j+1; j2 < arr.length; j2++) {
					if(((arr[i]+arr[j]+arr[j2])%5) == 0)
						count++;
						break;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int arr[]= {3,3,4,7,8};
		int d=5;
		result(arr, d);
	}
}

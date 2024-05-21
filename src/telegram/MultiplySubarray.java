package telegram;

public class MultiplySubarray {
	public static int result(int[] arr,int n)
	{
		if(n<3)
			return -1;
		int ascending = 0,descending=0,index=0;
		for (int i = 0; i < arr.length; i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					index=i;
					break;
				}
				else {
					System.out.println(arr[i]);
					ascending+=arr[i];
					break;
			}
			}
		}
		for (int i = index; i < arr.length; i++) {
			descending+=arr[i];
		}
		System.out.println(ascending+" "+descending);
		return ascending*descending;
	}
	
	public static void main(String[] args) {
		int[] arr= {3,8,14,12,10,7,4};
		System.out.println(result(arr, 7));
	}
}

package telegram;

public class TrueFalse {
	
	
	public static int result(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if((arr[i]^arr[j])>(arr[i]&arr[j]))
					count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int[] arr= {4,3,5,2};
		System.out.println(result(arr));
	}
	
}

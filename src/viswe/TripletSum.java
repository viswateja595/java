package viswe;

public class TripletSum {
	
	public static void main(String[] args) {
		int arr[]= {2,3,1,6};
		int d=3;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length;j++) {
				for (int j2 = 2; j2 < arr.length;j2++) {
					int sum=arr[i]+arr[j]+arr[j2];
					System.out.println(sum+" "+count);
					if(sum%d==0)
					{
						count++;
						continue;
					}
					else {
						break;
					}
				}
				break;
			}
		}
		System.out.println(count);
	}
}

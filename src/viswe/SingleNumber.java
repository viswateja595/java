package viswe;

public class SingleNumber {
	public static int result(int[] array)
	{
		int result=0;
		for (int index = 0; index < array.length; index++) {
			result=result^array[index];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] array= {1,2,4,2,1};
		System.out.println(result(array));
	}
}

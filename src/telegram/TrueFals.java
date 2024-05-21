package telegram;

public class TrueFals {

	public static boolean result(int num, int num2) {
		if(num==8 || num2==8 ||( num+num2==8 )|| (num-num2==8) || (num2-num==8))
			return true;
		return false;
		
	}
	public static void main(String[] args) {
		int num=9,num2=9;
		System.out.println(result(num,num2));
	}

	
}

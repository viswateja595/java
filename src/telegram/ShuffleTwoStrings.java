package telegram;

public class ShuffleTwoStrings {
	public static void result(String first,String second) {
		String str3="";
		for (int i = 0; i < first.length(); i++) {
			for (int j = 0; j < second.length();) {
				str3=str3+ second.charAt(i)+first.charAt(i);
				break;
			}
		}
		System.out.println(str3);
	}
	public static void main(String[] args) {
		String first="abc";
		String second="def";
		result(first,second);
	}
}

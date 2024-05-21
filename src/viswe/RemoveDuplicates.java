package viswe;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		String string="aabbccddeeff";
		char[] ch=string.toCharArray();
		LinkedHashSet<Character> hashSet=new LinkedHashSet<>();
		for (Character character : ch) {
			hashSet.add(character);
		}
		string=hashSet.toString();
		System.out.println(hashSet);
		System.out.println(string);
	}
}

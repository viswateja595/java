package telegram;

import java.util.ArrayList;
import java.util.List;

public class CharacterCount {
	
	public static void result(String str)
	{
		List<Character> list=new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}

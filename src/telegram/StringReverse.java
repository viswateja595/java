package telegram;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {
		
	public static void main(String[] args) {
		String str="Java is best programming language";
		List<String> list=new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
				list.add(str.substring(i));
		}
		System.out.println(list);
	}
}

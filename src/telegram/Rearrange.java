package telegram;

import java.util.ArrayList;
import java.util.List;

public class Rearrange {
	
	public static boolean result(String str1,String str2)
	{
		boolean result=false;
		List<Character> list1=new ArrayList<>();
		List<Character> list2=new ArrayList<>();
		for (int i = 0; i < str1.length(); i++) {
			list1.add((char) str1.charAt(i));
		}
		for (int i = 0; i < str2.length(); i++) {
			list1.add((char) str2.charAt(i));
		}
		if(str1.length()!=str2.length())
			return false;
		else {
			for (int i = 0; i < list1.size(); i++) {
				for (int j = 0; j < list2.size(); j++) {
					if(list1.get(i)==list2.get(j))
					{
						result=true;
						list2.remove(j);
					}
					}
				}
		}
		return result;
	}
	
	public static void main(String[] args) {
//		String string="raotegtslli";
//		String string2="testgorilla";
		String string="klma";
		String string2="abcd";
		System.out.println(result(string, string2));
	}
}

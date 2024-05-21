package telegram;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	
	public static void result(String str)
	{
		List<String> list=new ArrayList<>();
		String result="";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				result=result+str.charAt(i);
			}
			list.add(result);
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		String str="cat";
		result(str);
		
	}
}

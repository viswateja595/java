package geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class CharacterSum {
	
	public static void result(Map<Character, Integer> map, String str)
	{
		
		str=str.toLowerCase();
		System.out.println(str);
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
				continue;
			sum+=map.get(str.charAt(i));
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Map<Character, Integer> map=new HashMap<>();
		map.put('a', 1);map.put('b', 2);
		map.put('c', 3);map.put('d', 4);
		map.put('e', 5);map.put('f', 6);
		map.put('g', 7);map.put('h', 8);
		map.put('i', 9);map.put('j', 10);
		map.put('k', 11);map.put('l', 12);
		map.put('m', 13);map.put('n', 14);
		map.put('o', 15);map.put('p', 16);
		map.put('q', 17);map.put('r', 18);
		map.put('s', 19);map.put('t',20);
		map.put('u', 21);map.put('v', 22);
		map.put('w', 23);map.put('x', 24);
		map.put('y', 25);map.put('z', 26);
		
//		String str1="pneumonoultramicroscopicsilicovolcanoconiosis";
		String str="";
		result(map, str);
		
	}
}

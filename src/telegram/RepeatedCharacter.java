package telegram;

import java.util.Scanner;

public class RepeatedCharacter {
	public static void result(String str,char ch)
	{
		StringBuilder sb=new StringBuilder(str);
		char c=' ';
		int max=0;
		
		for (int i = 0; i < sb.length(); i++) {
			int count=0;
			c=sb.charAt(i);
			for (int j = 0; j < sb.length(); j++) {
				if(sb.charAt(i)==sb.charAt(j))
					count++;
				if(count>max)
					max=count;
			}
			
		}
//		for (int i = 0; i < arr.length; i++) {
//			int count=0;
//			c=arr[i];
//			for (int j = 0; j < arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//				if(count>max)
//					max=count;
//			}
//		}
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i)==c) {
				sb.setCharAt(i, ch);
			}
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		char ch=scanner.next().charAt(0);
		result(str, ch);
	}
}

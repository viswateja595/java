package telegram;

import java.util.Scanner;

public class Tele1 {
	public static void result(String str)
	{
		StringBuilder sBuilder=new StringBuilder(str);
		char[] stringAr=str.toCharArray();
		if(Character.isDigit(stringAr[stringAr.length-1])) {
			sBuilder.append((stringAr.length)-1);
			System.out.println(sBuilder.charAt(sBuilder.length()-1));
		}
		else {
			System.out.println("Else invoked");
			sBuilder.append(sBuilder.length());
			System.out.println(sBuilder.charAt(sBuilder.length()-1));
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		result(string);
	}
}

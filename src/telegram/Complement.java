package telegram;

import java.util.Scanner;

public class Complement {
	
	public static String dnaComplement(String str)
	{
		StringBuilder result=new StringBuilder(str.length());
		for (int i = str.length()-1; i >= 0; i--) {
			result.append(str.charAt(i));
			
		}
		for (int i = 0; i < result.length(); i++) {
			if(result.charAt(i)=='A')
			{
				result.setCharAt(i, 'T');
			}
			else if (result.charAt(i)=='C') {
				result.setCharAt(i, 'G');
			}
			else if (result.charAt(i)=='G') {
				result.setCharAt(i, 'C');
			}
			else if (result.charAt(i)=='T') {
				result.setCharAt(i, 'A');
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		System.out.println(dnaComplement(str));
	}
}

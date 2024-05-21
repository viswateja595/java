package viswe;

import java.util.Scanner;

public class RemoveVowels {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int length=scanner.nextInt();scanner.nextLine();
		String str=scanner.nextLine();
		StringBuilder stringBuilder=new StringBuilder(str);
		for (int i = stringBuilder.length()-1; i >= 0; i--) {
			char c=stringBuilder.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				stringBuilder.deleteCharAt(i);
			else
				break;
			
		}
		System.out.println(stringBuilder.toString());
	}
}

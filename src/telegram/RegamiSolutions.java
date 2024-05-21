package telegram;

import java.util.Scanner;

public class RegamiSolutions {
	public static boolean luckynumber(int a, int b, boolean result) {
		if(a==8 || b==8)
			result=true;
		else if(a+b==8)
			result=true;
		else if(a-b==8 || b-a==8)
			result=true;
		
		return result;	
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		boolean result=false;
		System.out.println(luckynumber(a,b,result));
	}
}

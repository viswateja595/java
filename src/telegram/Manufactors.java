package telegram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Viswa{
	void show();
}
	
class Bunny implements Viswa{
	public void show()
	{
		System.out.println("implements..");
	}
}

public class Manufactors {
	
	public static void stringPalindrome(String str)
	{
		char[] ch=str.toCharArray();
		String res="";
		for (int i = ch.length-1; i >= 0; i--) {
			res=res+ch[i];
		}
		System.out.println(res+"="+str);
		System.out.println(str.equals(res));
	}
	public static void officeRange(int arr[],int range1,int range2)
	{
		List<Integer> list=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=range1 && arr[i]<=range2)
				list.add(arr[i]);
		}
		System.out.println(list);
		
		
	}
	public static void securityKey(int number)
	{
		
	}
	public static int billDiscount(int number)
	{
		int odd=0,even=0;
		System.out.println("Bill Discount");
		String temp=Integer.toString(number);
		int[] arr=new int[temp.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=temp.charAt(i)-'0';
		}
		for (int i : arr) {
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		return even*odd;
	}
	public static int perfectSquareDiscount(int[] array)
	{
		int count=0;
		for (int i = 0; i < array.length; i++) {
			double temp=Math.sqrt(array[i]);
			if(temp==(int)temp)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int size=scanner.nextInt();
//		char[] ch=new char[size];
//		for (int i = 0; i < ch.length; i++) {
//			ch[i]=scanner.next().charAt(0);
//		}
//		int count=0;
//		for (int i = 0; i < ch.length; i++) {
//			if(!(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')) {
//				count++;
//			}
//		}
//		System.out.println(count);
		String str="racecar";
		
		stringPalindrome(str);
//		int[] arr= {29,38,12,48,39,55};
//		officeRange(arr, 30, 50);
		System.out.println(billDiscount(2514795));
		int[] squares= {25,77,54,81,48,34};
		System.out.println(perfectSquareDiscount(squares));
		
		Viswa objBunny=new Bunny();
		objBunny.show();
		
	}
}

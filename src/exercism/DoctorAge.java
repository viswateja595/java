package exercism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorAge {
	
	public static void result(List<Integer> list)
	{
		int income=0;
		for (Integer integer : list) {
			if(integer<15)
				income=income+150;
			else if (integer>17 && integer<40) {
				income=income+400;
			}
			else if(integer>40)
				income=income+300;
		}
		System.out.println("Total Income "+income+" INR");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		String val=scan.next();
		scan.close();
		Scanner n=new Scanner(val);
		n.useDelimiter(" ");
//		String arr[]=val.split("\r\n+");
		while(n.hasNext())
		{
			int c=Integer.parseInt(n.next());
			list.add(c);
		}
		scan.close();
		System.out.println(list);
		result(list);
	}
}

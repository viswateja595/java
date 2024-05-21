package telegram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arun {
	  public static int[] digitize(long n) {
	    
	    List<Integer> list=new ArrayList<>();
	    int digit,count = 0;
	    while(n > 0)  
	    {    
	      digit=(int) (n%10);  
	        
	     list.add(digit);  
	      n=n/10;  
	      //decrements the digit by 1  
	      count--;  
	    }
//	    Collections.reverse(list);
	    int result[]=new int[list.size()];
	    for(int i=0;i<list.size();i++)
	      {
	      result[i]=list.get(i);
	    }
	    for (int i : result) {
			System.out.print(i+" ");
		}
	    return result;
	    
	  }
	  public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		long input=scanner.nextLong();
		digitize(input);
	}
	}


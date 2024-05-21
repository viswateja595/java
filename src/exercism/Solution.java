package exercism;

import java.io.*;
import java.util.*;

public class Solution {

    public static void result(String str)
    {
        int hash=0;
        int star=0;
        int invalid=0;
        
        for(int i=0;i<str.length();i++)
        {
        	
            
            if(str.charAt(i)=='#')
            {
                hash++;
            }
            else if(str.charAt(i)=='*')
            {
                star++;
            }
            else if(str.charAt(i)!='#' || str.charAt(i)!='*')
            {
                invalid++;
                
            }
        }
        if(invalid>=1)
            System.out.println("INVALID INPUT");
        else if(hash>0 && star>0 && hash==star)
            System.out.println("EQUAL");
        else {
			System.out.println("NOT EQUAL");
			
		}
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        result(str);
        
    }
}
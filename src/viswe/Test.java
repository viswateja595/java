package viswe;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int [] arr= {-1,-3,-2,0,1};
		System.out.println(isSorted(arr));
	}
	public static boolean isSorted(int[] array) {

        // TODO: Write code here
        if(array.length<1)
            return true;
        boolean check=false;
        int result[]=new int[array.length];
        for (int i=0; i<array.length; i++){
            result[i]=array[i];
        } 
        Arrays.sort(result);
        for(int i=0;i<result.length;i++){
        	System.out.println(array[i]+" "+result[i]);
            if(result[i]==array[i])
                check=true;
            else {
                check=false;break;
               }
            
        }
        return check;
    }
}

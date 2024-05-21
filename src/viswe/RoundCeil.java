package viswe;

public class RoundCeil {
	public static void main(String[] args) {
		
		int arr[]= {1,8,3,9,6};
		int arr2[]= {7,9,6,14,7};
		
		if((arr.length+arr2.length)%2==0) {
			double total=(double)(arr.length+arr2.length)/4;
			System.out.println((int)Math.ceil(total));
		}
		else {
			System.err.print("False");
		}
		
		
		
		public class StringMagic {

		    /**
		     * This method checks if a given string has two consecutive identical characters.
		     *
		     * @param str The string to check for consecutive duplicates.
		     * @return true if the string has consecutive duplicates, false otherwise.
		     */
		    public boolean hasConsecutiveDuplicates(String str) {
		        
		        // TODO: Write your code here
		        boolean flag=false;
		        for (int i=0; i<str.length(); i++){
		            for (int j=1; j<str.length();j++){
		                if(str.charAt(i)==str.charAt(j)){
		                    flag=true;
		                }
		                break;
		            } 
		        }
		        if(flag==true)
		            return true;
		        else
		            return false;
		    }
		}
	}
}

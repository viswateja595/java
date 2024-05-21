package codewars;

public class Product {

		  public static int grow(int[] x){
		    int product=0;
		    for (int i = 0; i < x.length; i++) {
		    	System.out.println(x[i]);
				product*=x[i];
			}
		    return product;
		  
		  }
		  public static void main(String[] args) {
			int[] x= {1,2,3};
			System.out.println(grow(x));
		}
}

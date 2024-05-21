package codewars;

public class CountingSheep {
	
	public static String countingSheep(int num) {
	    String str="";
	    for(int i=1;i<=num;i++){
	      str=str+i+" sheep...";
	    }
	    return str;
	  }
	public static void main(String[] args) {
		int number=2;
		System.out.println(countingSheep(number));
	}
}

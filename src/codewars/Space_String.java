package codewars;

public class Space_String {
	public static String result(final String x)
	{
		StringBuilder sBuilder=new StringBuilder(x);
		char ch=' ';
		for (int i = 0; i < sBuilder.length(); i++) {
			if(sBuilder.charAt(i)==ch)
			{
				sBuilder.deleteCharAt(i);
			}
		}
		return sBuilder.toString();
	}
	public static void main(String[] args) {
		
		String str="V   i sw  a t     eja";
		System.out.println(result(str));
	}
}

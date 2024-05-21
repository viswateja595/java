package tcs_mumbai;

public class Dimension {
	
	private int feet;
	private int inches;
	public Dimension(int inches)
	{
		if(inches<0)
		{
			this.inches=-1;
			this.feet=-1;
		}
		else {
			this.feet=inches/12;
			this.inches=inches%12;
		}
	}
	public int getFeet()
	{
		return feet;	
	}
	public int getInches()
	{
		return inches;
	}
	public static void main(String[] args) {
		Dimension dimension=new Dimension(25);
		System.out.println(dimension.getFeet());
		System.out.println(dimension.getInches());
		
		Dimension dimension1=new Dimension(-6);
		System.out.println(dimension1.getFeet());
		System.out.println(dimension1.getInches());
	}
}

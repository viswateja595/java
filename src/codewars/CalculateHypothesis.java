package codewars;

public class CalculateHypothesis {

	public double calculate_hypothesis(int a,int b)
	{
		return Math.sqrt(a*a + b*b);
	}
	public static void main(String[] args) {
		CalculateHypothesis ch=new CalculateHypothesis();
		System.out.println(ch.calculate_hypothesis(1, 1));
	}
}

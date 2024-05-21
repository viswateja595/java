package exercism;

public class PerfectNumbers {
	int number;
    PerfectNumbers(int number)
    {
        if(number <= 0)
        {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number=number;
        System.out.println(number);
    }
    public int getFactors() {
    	int sum=0;
    	System.out.println(number);
        for(int i=1;i<number;i++)
            {
                if(number%i == 0)
                    sum+=i;
                System.out.println(sum);
            }
        System.out.println(sum);
        return sum;
    }
    public Classification getClassification() {
        int sum=getFactors();
        System.out.println(sum);
        if(sum < number)
        {
            return Classification.DEFICIENT;
        }
        else if(sum > number)
        {
            return Classification.ABUNDANT;
        }
        else
            return Classification.PERFECT;
    }
    
    public static void main(String[] args) {
		
    	PerfectNumbers pn=new PerfectNumbers(11);
    	System.out.println(pn.getClassification());
	}
}

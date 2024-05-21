package exercism;


public class BirdWatcher {
	
	private final int[] birdsPerDay;
	public BirdWatcher(int[] birdsPerDay)
	{
		this.birdsPerDay=birdsPerDay.clone();
	}
	
	public int[] getLastWeek()
	{
		return birdsPerDay;
	}
	public int getToday()
	{
		return birdsPerDay[birdsPerDay.length-1];
	}
	public void incrementTodaysCount()
	{
		birdsPerDay[birdsPerDay.length-1]++;
	}
	public boolean hasDayWithoutBirds()
	{
		for (int i = 0; i < birdsPerDay.length; i++) {
			if(birdsPerDay[i]==0)
				return true;
		}
		return false;
	}
	public int getCountForFirstDays(int number)
	{
		int sum=0;
		for (int i = 0; i < number; i++) {
			sum+=birdsPerDay[i];
		}
		return sum;
	}
	public int getBusyDays() {
		int busyDays=0;
		for (int i = 0; i < birdsPerDay.length; i++) {
			if(birdsPerDay[i]>4)
				busyDays++;
		}
		return busyDays;
	}
	
	public static void main(String[] args) {
		int[] birdsPerDay= {2,5,0,7,4,1};
		BirdWatcher birdWatcher=new BirdWatcher(birdsPerDay);
		System.out.println(birdWatcher.getLastWeek());
		System.out.println(birdWatcher.getToday());
		System.out.println(birdWatcher.hasDayWithoutBirds());
		System.out.println(birdWatcher.getCountForFirstDays(4));
		System.out.println(birdWatcher.getBusyDays());
	}
}

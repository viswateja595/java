package telegram;

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    TatkalBooking[] t=new TatkalBooking[n];
	    for(int i=0;i<t.length;i++)
	    {
	        int bookingId=sc.nextInt();sc.nextLine();
	        String trainName=sc.nextLine();
	        String fromStation=sc.nextLine();
	        String toStation=sc.nextLine();
	        int price=sc.nextInt();
	        int noOfTicketsAvailable=sc.nextInt();
	        t[i]=new TatkalBooking(bookingId, trainName, fromStation,toStation, price, noOfTicketsAvailable);
	    }
	        sc.nextLine();
	        String fromStation=sc.nextLine();
	        String toStation=sc.nextLine();
	        
	    
	    int t2=totalPriceOfTatkalBooking(t, fromStation, toStation);
	    
	        if(t2==0)
	        {
	            System.out.println("no trains are there");
	        }
	        else 
	        {
	            System.out.println(t2);
	        }
	    
	}
	    public static int totalPriceOfTatkalBooking(TatkalBooking[] t, String fromStation, String toStation)
	    {
	        int sum=0;
	        for(int i=0;i<t.length;i++)
	        {
	            if((t[i].getFromStation().equalsIgnoreCase(fromStation))&&t[i].getToStation().equalsIgnoreCase(toStation))
	            sum=sum+t[i].getPrice();
	        }
	        return sum;
	    }
	        
	   }
	        

class TatkalBooking
{
    private int bookingId;
    private String trainName;
    private String fromStation;
    private String toStation;
    private int price;
    private int noOfTicketsAvailable;
    
    public int getBookingId()
    {
        return bookingId;
    }
    public String getTrainName()
    {
        return trainName;
    }
    public String getFromStation()
    {
        return fromStation;
    }
    public int getPrice()
    {
        return price;
    }
    public String getToStation()
    {
        return toStation;
    }
    public void setBookingId(int bookingId)
    {
        this.bookingId=bookingId;
    }
    public void setTrainName(String trainName)
    {
        this.trainName=trainName;
    }
    public void setfFromStation(String fromStation)
    {
        this.fromStation=fromStation;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public void setToStation(String toStation)
    {
        this.toStation=toStation;
    }
    public void setNoOfTicketsAvailable(int noOfTicketsAvailable)
    {
        this.noOfTicketsAvailable=noOfTicketsAvailable;
    }
    public int getNoOfTicketsAvailable()
    {
    	return noOfTicketsAvailable;
    }
    public TatkalBooking(int bookingId, String trainName, String fromStation,String toStation, int price, int noOfTicketsAvailable)
    {
        this.bookingId=bookingId;
        this.trainName=trainName;
        this.fromStation=fromStation;
        this.toStation=toStation;
        this.price=price;
        this.noOfTicketsAvailable=noOfTicketsAvailable;
    }
}


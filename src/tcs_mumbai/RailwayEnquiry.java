package tcs_mumbai;

import java.util.Scanner;
class Train
{
	private int trainNumber;
	private String trainName;
	private String boardingStation;
	private String destinationStation;
	private int ticketPrice;
	public Train(int trainNumber, String trainName, String boardingStation, String destinationStation,
			int ticketPrice) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.boardingStation = boardingStation;
		this.destinationStation = destinationStation;
		this.ticketPrice = ticketPrice;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getBoardingStation() {
		return boardingStation;
	}
	public void setBoardingStation(String boardingStation) {
		this.boardingStation = boardingStation;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", trainName=" + trainName + ", boardingStation=" + boardingStation
				+ ", destinationStation=" + destinationStation + ", ticketPrice=" + ticketPrice + "]";
	}
	
	
	
}
public class RailwayEnquiry {
	public static void betweenTrains(Train[]trains,String boarding,String destination)
	{
		for (int i = 0; i < trains.length; i++) {
			if(trains[i].getBoardingStation().equalsIgnoreCase(boarding) && trains[i].getDestinationStation().equalsIgnoreCase(destination))
			{
				System.out.println(trains[i]);
			}
		}
	}
//	public static void print(Train[]trains)
//	{
//		for (int i = 0; i < trains.length; i++) {
//			System.out.println(trains[i]);
//		}
//	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=4;
		Train[] trains=new Train[4];
		for (int i = 0; i < number; i++) {
			int trainNumber=scanner.nextInt();scanner.nextLine();
			String trainName=scanner.nextLine();
			String boardingStation=scanner.nextLine();
			String destinationStation=scanner.nextLine();
			int ticketPrice=scanner.nextInt();
			trains[i]=new Train(trainNumber, trainName, boardingStation, destinationStation, ticketPrice);
		}
		scanner.nextLine();
		String boarding=scanner.nextLine();
		String destnation=scanner.nextLine();
		
		scanner.close();
		betweenTrains(trains,boarding,destnation);
//		print(trains);
		
	}
}

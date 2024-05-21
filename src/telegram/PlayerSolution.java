package telegram;

import java.util.Scanner;

class Player{
	
	private int id;
	private String name;
	private String country;
	private int goals;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	public Player(int id, String name, String country, int goals) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.goals = goals;
	}
	@Override
	public String toString() {
		return id + '\n'+ name+'\n'+country+'\n'+goals;
	}
	
	
}

public class PlayerSolution {
	public static void main(String args[]) throws Exception{
		Scanner scanner=new Scanner(System.in);
		int loop=scanner.nextInt();
		Player player[]=new Player[loop];
		for (int i = 0; i < player.length; i++) {
			int id=scanner.nextInt();scanner.nextLine();
			String name=scanner.nextLine();
			String country=scanner.nextLine();
			int goals=scanner.nextInt();
			player[i]=new Player(id, name, country, goals);
		}
		System.out.println(findPlayerWithMostGoals(player));
	}
	public static Player findPlayerWithMostGoals(Player[] player)
	{
		int maxindex=0;
		int max=0;
		for(int i=0;i<player.length;i++)
		{
			if(player[i].getGoals()>max) {
				maxindex=i;
				max=player[i].getGoals();
			}
			
		}
		return player[maxindex];
	}
}


package telegram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Engine{
	private int engineId;
	private String engineName;
	private String engineType;
	private double enginePrice;
	public int getEngineId() {
		return engineId;
	}
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}
	public String getEngineName() {
		return engineName;
	}
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public double getEnginePrice() {
		return enginePrice;
	}
	public void setEnginePrice(double enginePrice) {
		this.enginePrice = enginePrice;
	}
	public Engine(int engineId, String engineName, String engineType, double enginePrice) {
		super();
		this.engineId = engineId;
		this.engineName = engineName;
		this.engineType = engineType;
		this.enginePrice = enginePrice;
	}
	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineName=" + engineName + ", engineType=" + engineType
				+ ", enginePrice=" + enginePrice + "]";
	}
	
	
}

public class EngineClass {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Engine[] engines=new Engine[4];
		for (int i = 0; i < engines.length; i++) {
			int engineId=scanner.nextInt();scanner.nextLine();
			String engineName=scanner.nextLine();
			String engineType=scanner.nextLine();
			double enginePrice=scanner.nextDouble();
			
			engines[i]=new Engine(engineId, engineName, engineType, enginePrice);
		}
		scanner.nextLine();
		String engineType=scanner.nextLine();
		String engineName=scanner.nextLine();
		
		double average=findAvgEnginePriceByType(engines, engineType);
		if(average==0)
			System.out.println("There  are no engine with given type");
		else
			System.out.println(average);
		
		Engine[] searchEngines=searchEngineByName(engines, engineName);
		if(searchEngines==null)
			System.out.println("There are no engine with given name");
		else {
			for (int i = 0; i < searchEngines.length; i++) {
				System.out.println(searchEngines[i].getEngineId());
			}
		}
		
		
	}
	public static double findAvgEnginePriceByType(Engine[] engines, String engineType)
	{
		double sum=0;int count=0;
		for (int i = 0; i < engines.length; i++) {
			if(engines[i].getEngineType().equalsIgnoreCase(engineType))
			{
				sum=sum+engines[i].getEnginePrice();
				count=count+1;
			}
		}
		return sum/count;
	}
	public static Engine[] searchEngineByName(Engine[] engines, String engineName) {
		List<Engine> list=new ArrayList<>();
		for (int i = 0; i < engines.length; i++) {
			if(engines[i].getEngineName().equalsIgnoreCase(engineName))
			{
				list.add(engines[i]);
			}
		}
		return (Engine[]) list.toArray(new Engine[0]);
	}
}

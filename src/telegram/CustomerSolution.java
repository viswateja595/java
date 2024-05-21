package telegram;

import java.util.Scanner;

class Customer{
	private int id;
	private String name;
	private int salary;
	private int age;
	public Customer(int id, String name, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "id-"+id +'\n'+"name-"+name +'\n'+"salary-"+salary +'\n'+"age-"+age;
	}
	
}

public class CustomerSolution {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		Customer[] c=new Customer[size];
		for (int i = 0; i < c.length; i++) {
			int id=scanner.nextInt();scanner.nextLine();
			String name=scanner.nextLine();
			int salary=scanner.nextInt();
			int age=scanner.nextInt();
			c[i]=new Customer(id, name, salary, age);
		}
		int salary=scanner.nextInt();
		System.out.println("Average of salary "+findAverageSalaryOfCustomer(c));
		Customer objCustomer=searchCustomerBySalary(c, salary);
		if(objCustomer==null)
			System.out.println("No Customer found with mentioned attribute");
		else
			System.out.println(objCustomer);
	}
	
	public static double findAverageSalaryOfCustomer(Customer[] c) {
		int sum=0;
		for (int i = 0; i < c.length; i++) {
			sum=sum+c[i].getSalary();
		}
		return sum/c.length;
	}
	
	public static Customer searchCustomerBySalary(Customer[] c,int salary)
	{
		for (int i = 0; i < c.length; i++) {
			if(c[i].getSalary()==salary)
				return c[i];
		}
		return null;
	}
}

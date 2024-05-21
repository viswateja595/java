package telegram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Arrays
public class Test1 implements Comparable<Test1> {
	private int id;
	private String nameString;
	private int age;
	private int salary;
	
	public int getId() {
		return id;
	}

	public String getNameString() {
		return nameString;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}
	public Test1(int id, String nameString, int age, int salary) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(Test1 o) {
		return this.age- o.getAge();
	}
	
	@Override
	public String toString() {
		return "Test1 [id=" + id + ", nameString=" + nameString + ", age=" + age + ", salary=" + salary + "]";
	}
	public static int getMaximumAge(Test1[] t) {
		Arrays.sort(t);
		return t[t.length-1].getAge();
	}
	public static int getMaximumAgeInbuilt(Test1[] t)
	{
		List<Test1> list=Arrays.asList(t);
		list.sort((o1, o2) ->  o1.getAge() - o2.getAge());
		return list.get(list.size()-1).getAge();
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		int size=scanner.nextInt();
		Test1[] array= new Test1[size];
		for (int i = 0; i < array.length; i++) {
			int id=scanner.nextInt();scanner.nextLine();
			String name=scanner.nextLine();
			int age=scanner.nextInt();
			int salary=scanner.nextInt();
			array[i]=new Test1(id, name, age, salary);
		}
		
		int age=getMaximumAge(array);
		if(age==0)
			System.out.println("No Maximum Age Found");
		else
			System.out.println(age);
		//List
		int listAge=getMaximumAgeInbuilt(array);
		if(age==0)
			System.out.println("No Maximum Age Found");
		else
			System.out.println(listAge);
		
    }
	

}

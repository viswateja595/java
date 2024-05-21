package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Doctor{
	private int id;
	private String name;
	private double salary;
	private int age;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Doctor(int id, String name, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "id-"+id +'\n'+"name-"+name+'\n'+"salary-"+salary+'\n'+"age-"+age;
	}
}
class DoctorComp implements Comparator<Doctor>
{
	@Override
	public int compare(Doctor o1, Doctor o2) {
		return o2.getAge()-o1.getAge();
	}	
}

public class Solution {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		Doctor[] doctors=new Doctor[size];
		for (int i = 0; i < doctors.length; i++) {
			int id=scanner.nextInt();scanner.nextLine();
			String name=scanner.nextLine();
			double salary=scanner.nextDouble();
			int age=scanner.nextInt();
			doctors[i]=new Doctor(id, name, salary, age);
		}
		scanner.nextLine();
		String name=scanner.nextLine();
		System.out.println(findMaximumAgeDoctor(doctors));
		System.out.println(searchDoctorByName(doctors, name));
		scanner.close();
		
	}
	public static Doctor findMaximumAgeDoctor(Doctor[] doctors) {
		List<Doctor> n=new ArrayList<>(Arrays.asList(doctors));
		n.sort(new DoctorComp());
		return n.get(0);
//		int[] ages=new int[doctors.length];
//		for (int i = 0; i < doctors.length; i++) {
//			ages[i]=doctors[i].getAge();
//		}
//		Arrays.sort(ages);
//		for (int i = 0; i < doctors.length; i++) {
//			if(doctors[i].getAge()==ages[ages.length-1])
//				return doctors[i];
//		}
	}
	public static Doctor searchDoctorByName(Doctor[] doctors, String name) {
		
		for (int i = 0; i < doctors.length; i++) {
			if(doctors[i].getName().equalsIgnoreCase(name))
			{
				return doctors[i];
			}
		}
			return null;
	}
}
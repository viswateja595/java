package telegram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee{
	private int eId;
	private String eName;
	private int eSalary;
	private String eDept;
	public int geteId() {
		return eId;
	}
	public String geteName() {
		return eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public String geteDept() {
		return eDept;
	}
	public Employee(int eId, String eName, int eSalary, String eDept) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eDept = eDept;
	}
}
class EmployeeSortName implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.geteName().compareTo(o2.geteName());
	}
}

public class EmployeeSolution {
	
	public static List<Employee> sortEmployeeBasedOnName(List<Employee> employees)
	{
		Collections.sort(employees, new EmployeeSortName());
		return employees;
	}
	public static List<Employee> findEmployeeWithSpecificedDept(List<Employee> employees,String dept)
	{
		List<Employee> result=new ArrayList<>();
		for (int i = 0; i < employees.size(); i++) {
			if(employees.get(i).geteDept().equalsIgnoreCase(dept))
			{
				result.add(employees.get(i));
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		List<Employee> list=new ArrayList<>();
		for (int i = 0; i < size; i++) {
			int eId=scanner.nextInt();scanner.nextLine();
			String eString=scanner.nextLine();
			int eSalary=scanner.nextInt();scanner.nextLine();
			String eDept=scanner.nextLine();
			list.add(new Employee(eId, eString, eSalary, eDept));
		}
		String search=scanner.nextLine();
		List<Employee> method1=sortEmployeeBasedOnName(list);
		method1.forEach(i->System.out.println(i.geteId()));
		List<Employee> method2=findEmployeeWithSpecificedDept(method1, search);
		method2.forEach(x->System.out.println(x.geteName()));
		
	}
	
}

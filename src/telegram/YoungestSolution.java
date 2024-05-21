package telegram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Person{
	private int personId;
	private String personName;
	private int personAge;
	public int getPersonId() {
		return personId;
	}
	public String getPersonName() {
		return personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public Person(int personId, String personName, int personAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}
	@Override
	public String toString() {
		return personName+'\n'+personAge+'\n'+personId;
	}
	
}

public class YoungestSolution {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		Person[] persons=new Person[size];
		for (int i = 0; i < persons.length; i++) {
			int id=scanner.nextInt();scanner.nextLine();
			String personName=scanner.nextLine();
			int personAge=scanner.nextInt();
			persons[i]=new Person(id, personName, personAge);
		}
		scanner.nextLine();
		String searchName=scanner.nextLine();
		Person findYoungPerson=findYoungestPerson(persons);
		System.out.println(findYoungPerson);
		Person searchPersonWithName=searchPersonWithName(persons, searchName);
		if(searchPersonWithName==null)
			System.out.println("No person found with the mentioned name");
		else
			System.out.println(searchPersonWithName);
	}
	public static Person findYoungestPerson(Person[] persons){
		List<Person> list=Arrays.asList(persons);
		Comparator<Person> comparator=(Person o1, Person o2)-> {
				return o1.getPersonAge()-o2.getPersonAge();
			};
		Collections.sort(list,comparator);
		return list.get(0);
	}
	public static Person searchPersonWithName(Person[] persons,String name) {
		for (int i = 0; i < persons.length; i++) {
			if(persons[i].getPersonName().equalsIgnoreCase(name)) {
				return persons[i];
			}
		}
		return null;
	}
}

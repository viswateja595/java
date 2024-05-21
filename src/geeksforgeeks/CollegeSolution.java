package geeksforgeeks;

import java.util.Scanner;

class College{
	private int id;
	private String name;
	private int contactNo;
	private String address;
	private int pincode;
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
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public College(int id, String name, int contactNo, String address, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.pincode = pincode;
	}
	
}

public class CollegeSolution {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		College[] colleges=new College[4];
		for (int i = 0; i < colleges.length; i++) {
			int id=scanner.nextInt();scanner.nextLine();
			String name=scanner.nextLine();
			int contactNo=scanner.nextInt();scanner.nextLine();
			String address=scanner.nextLine();
			int pincode=scanner.nextInt();
			colleges[i]=new College(id, name, contactNo, address, pincode);
		}
		scanner.close();
	}
	public static void findCollegeWithMaximumPincode(College[] colleges) {
		
	}
	public static College searchCollegeByAddress(College[] colleges, String address) {
		for (int i = 0; i < colleges.length; i++) {
			if(colleges[i].getAddress().equalsIgnoreCase(address)) {
				return colleges[i];
			}
		}
		return null;
	}
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int id;
	private String name;
	private int point;
	@Autowired
	private Laptop laptop;
	
	
	public Alien() {
		System.out.println("Object Created");
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
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public void show()
	{
		System.out.println("In Alien");
		laptop.lshow();
	}
	
}

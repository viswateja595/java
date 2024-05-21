package com.rest;

import java.util.ArrayList;
import java.util.List;

public class BarcodeRepo {
	
	List<Details> repoDetails;
	
	public BarcodeRepo()
	{
		repoDetails=new ArrayList<>();
		Details d1=new Details();
		d1.setBarcode(123456);
		d1.setItem("Test Item");
		d1.setCategory("Test Category");
		d1.setPrice(1234);
		d1.setDiscount(12);
		d1.setAvailable(5);
		repoDetails.add(d1);
	}
	
	public List<Details> getDetails()
	{
		return repoDetails;
	}
	
	public void createItem(Details d1)
	{
		repoDetails.add(d1);
	}
	
}

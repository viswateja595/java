package com.rest;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("details")
public class BarcodeResource {
	BarcodeRepo barcodeRepo=new BarcodeRepo();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Details> getDetails()
	{
		System.out.println("Invoked");
		return barcodeRepo.getDetails();
		
	}
	
	@POST
	@Path("barcode")
	public Details create(Details d1)
	{
		barcodeRepo.createItem(d1);
		return d1;
	}
	
}

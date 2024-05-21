package com.rest;

public class Details {
	private int barcode;
	private String item;
	private String category;
	private int price;
	private int discount;
	private int available;
	
	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Details [barcode=" + barcode + ", item=" + item + ", category=" + category + ", price=" + price
				+ ", discount=" + discount + ", available=" + available + "]";
	}
	
}

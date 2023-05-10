package org.java.prod;

import java.util.Random;

public class Product {

	private final int code;
	
	private String name;
	private String brand;
	private int price;
	private int vat;
	
	public Product(String name, String brand, int price, int vat) {
		
		Random rnd = new Random();
		code = rnd.nextInt(1000, 9999);
		
		setName(name);
		setBrand(brand);
		setPrice(price);
		setVat(vat);
	}
	
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		this.vat = vat;
	}
	public String getVatPrice() {
		
		return String.format("%.2f", (getPrice() * (1 + getVat() / 100f))); 
	}
	
	protected String getProductStr() {
		
		return " [" + getCode() + "] " + getName() + " - " + getBrand()
			+ "\nprice: " + getPrice() + "E + " + getVat() + "% = " + getVatPrice() + "E";
	}
	
	@Override
	public String toString() {
		
		return "(P)" + getProductStr();
	}
}

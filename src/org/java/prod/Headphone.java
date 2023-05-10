package org.java.prod;

public class Headphone extends Product {

	private String color;
	private boolean wireless;
	
	public Headphone(String name, String brand, int price, int vat,
				    String color, boolean wireless) {
		super(name, brand, price, vat);

		setColor(color);
		setWireless(wireless);
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		
		return "(H)" + getProductStr() 
			+ "\ncolor: " + getColor() 
			+ "\nis wireless: " + isWireless();
	}
}

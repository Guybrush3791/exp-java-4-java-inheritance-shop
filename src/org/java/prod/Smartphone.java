package org.java.prod;

public class Smartphone extends Product {

	private String imei;
	private int memory;
	
	public Smartphone(String name, String brand, int price, int vat,
					  String imei, int memory) {
		
		super(name, brand, price, vat);
		
		setImei(imei);
		setMemory(memory);
	}
	
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		
		return "(S)" + getProductStr() 
			+ "\nimei: " + getImei()
			+ "\nmemory: " + getMemory() + "GB";
	}
}

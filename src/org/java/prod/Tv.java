package org.java.prod;

public class Tv extends Product {

	private int dimension;
	private boolean smart;
	
	public Tv(String name, String brand, int price, int vat,
			  int dimension, boolean smart) {
		
		super(name, brand, price, vat);

		setDimension(dimension);
		setSmart(smart);
	}

	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		
		return "(T)" + getProductStr()
		 	+ "\ndimension: " + getDimension() + "''"
		 	+ "\nsmart: " + isSmart();
	}
}

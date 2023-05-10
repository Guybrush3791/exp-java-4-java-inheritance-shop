package org.java;

import org.java.prod.Headphone;
import org.java.prod.Product;
import org.java.prod.Smartphone;
import org.java.prod.Tv;

public class Shop {

	public static void main(String[] args) {
		
		Product p1 = new Product("prod 1", "brand 1", 100, 22);
		System.out.println(p1);
		
		System.out.println("\n---------------------------\n");
		
		Smartphone s1 = new Smartphone("smartph1", "brand smart 1", 300, 22, "slkdkjflksdjkflas", 128);
		System.out.println(s1);
		
		System.out.println("\n---------------------------\n");
		
		Tv tv1 = new Tv("tv1", "brand tv1", 500, 22, 35, false);
		System.out.println(tv1);

		System.out.println("\n---------------------------\n");
		
		Headphone hp1 = new Headphone("hp1", "hp1 brand", 215, 22, "black", true);
		System.out.println(hp1);
	}
}

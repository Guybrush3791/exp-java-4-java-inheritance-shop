package org.java;

import java.util.Scanner;

import org.java.prod.Headphone;
import org.java.prod.Product;
import org.java.prod.Smartphone;
import org.java.prod.Tv;

public class Catalogo {

	public static void main(String[] args) {
		
		int userVal = -1;
		int prodInd = 0;
		Scanner sc = new Scanner(System.in);
		Product[] products = new Product[100];
		while(true) {
			
			System.out.println("-------------------");
			System.out.println("1 - Inserire nuovo prodotto");
			System.out.println("2 - Stampare catalogo e uscire");
			userVal = sc.nextInt();
			System.out.println("-------------------");
			
			if (userVal < 1 || userVal > 2) {
				
				System.out.println("Scelta non compresa, ritentare");
				continue;
			}
			if (userVal == 2) break;
			
			System.out.println("Selezionare tipo di prodotto:");
			System.out.println("1 - Smartphone");
			System.out.println("2 - Tv");
			System.out.println("3 - Headphone");
			userVal = sc.nextInt();
			System.out.println("-------------------");
			
			if (userVal < 1 || userVal > 3) {
				
				System.out.println("Scelta non compresa, ritentare");
				continue;
			}
			
			sc.nextLine();
			
			System.out.print("nome: ");
			String name = sc.nextLine();
			
			System.out.print("brand: ");
			String brand = sc.nextLine();
			
			System.out.print("price: ");
			int price = sc.nextInt();
			
			System.out.print("vat: ");
			int vat = sc.nextInt();
			
			switch(userVal) {
			
				case 1: {
					
					sc.nextLine();
					
					System.out.print("imei: ");
					String imei = sc.nextLine();
					
					System.out.print("memory: ");
					int memory = sc.nextInt();
					
					Smartphone sp = new Smartphone(name, brand, price, vat, imei, memory);
					products[prodInd++] = sp;
				}
				break;
				
				case 2: {
					
					System.out.print("dimension: ");
					int dimension = sc.nextInt();
					
					System.out.print("smart: ");
					boolean smart = sc.nextBoolean();
					
					Tv tv = new Tv(name, brand, price, vat, dimension, smart);
					products[prodInd++] = tv;
				}
				break;
				
				case 3: {
					
					sc.nextLine();
					
					System.out.print("color: ");
					String color = sc.next();
					
					System.out.print("wireless: ");
					boolean wireless = sc.nextBoolean();
					
					Headphone hp = new Headphone(name, brand, price, vat, color, wireless);
					products[prodInd++] = hp;
				}
				break;
			}
			System.out.println("-------------------");
		}
		
		for (int x=0;x<prodInd;x++) {
			
			Product p = products[x];
			System.out.println(p);
			System.out.println("--------------------");
		}
	}
}

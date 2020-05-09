package com.jpinformatica.MavenStandard.FruitShop;

import java.io.*;
import java.io.IOException;

import java.io.BufferedReader; 
import java.io.InputStreamReader; 

public class ProductList {
		
	public String product[] = {"Pear", "Apple", "Orange", "Coconut"}; 
	public long price[] = {4 , 3, 7, 20};
	public long quantity[] = {10, 20, 30, 6};
	public String Offer[] = {
			"1 pear for free",
			"Buy 3 apples and pay 2", 
			"Get a free Orange for every 2 Pears you buy", 
			"Coconut free with 5 Oranges"}; 
		
	public static int x;
	
	public void ListProducts() {
		// List of Products
		System.out.println("               ");
		System.out.println("Product - Price");
	
		for (x=0; x<product.length; x++) {	
			// To convert the elements as List 
			System.out.println(product[x] + " - " + price[x] + " Euro"); 
		}
		
	}
	
	public void ListPurchase() {
		// List of Purchases
		System.out.println("               ");
		System.out.println("Product - Quantity");
	
		for (x=0; x<product.length; x++) {	
			// To convert the elements as List 
			System.out.println(product[x]+ " - " + quantity[x] ); 
		}
		
	}
	
	public void Receipt() {
		// List of Products
		System.out.println("               ");
		System.out.println("Product - Price");
	
		for (x=0; x<product.length; x++) {	
			// list products
			System.out.println(product[x] + " - " + price[x] + " Euro"); 
		}		
		// Total Price
		long totalPrice = 0;
		for (x=0; x<product.length; x++) {	
			totalPrice = totalPrice + price[x];
		}
		System.out.println(" Total Price " + totalPrice); 
		for (x=0; x<product.length; x++) {	
			System.out.println("Offer: " + Offer[x]); 
		}
	}
	
	public void Offers() {
		// List of Purchases
		System.out.println("               ");
		System.out.println("Offers");
	
		for (x=0; x<Offer.length; x++) {	
			// To convert the elements as List 
			System.out.println(Offer[x]); 
		}
	 
	//Enter data using BufferReader 
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	
	System.out.println(" ");
	System.out.println(" Enter new offer ");
	// Reading data using readLine 
	//String newOffer;
	/*
	try {
		newOffer = reader.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	*/  
	// Printing the read line 
	System.out.println(" ");
	//System.out.println("Nueva Oferta: " + newOffer);  
	// Add new Offer
	}
	
/*	
	public void save () throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream (numero + ".cnt");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject (titular);
		oos.writeFloat (saldo);
		oos.writeFloat (interesAnual);
		oos.close ();
		}
*/		
}
     


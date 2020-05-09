package com.jpinformatica.MavenStandard.FruitShop;

import java.util.Scanner;

public class App {
     
    public static void main(String[] args) {
            
            Scanner sn = new Scanner(System.in);
            boolean exit = false;
            int opcion; //Guardaremos la opcion del usuario
             
            while(!exit){
                 
                System.out.println("1. Product List");
                System.out.println("2.Purchase List");
                System.out.println("3. Receipt");
                System.out.println("4. Add Offers");
                System.out.println("5. Exit");
                 
                System.out.println("Pick an option:");
                opcion = sn.nextInt();
                
                switch(opcion){
                case 1:
                    System.out.println("You have selected 1. Product List");
                    ProductList li = new ProductList(); 
                    li.ListProducts();
                    break;
                case 2:
                    System.out.println("You have selected 2. Purchase List");
                    ProductList li2 = new ProductList(); 
                    li2.ListPurchase();
                    break;
                case 3:
                    System.out.println("You have selected 3. Receipt");
                    ProductList li3 = new ProductList(); 
                    li3.Receipt();
                    break;
                case 4:
                    System.out.println("You have selected 4. Add Offer");
                    break;
                 case 5:
                    exit=true;
                    break;
                 default:
                    System.out.println("Only numbers between 1 and 5");
            }
                 
            }
             
         }
         
    }
     


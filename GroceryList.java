import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryList {

	public static void main(String[] args) throws IOException {
		
        printWelcomeMessage();
        int budget=0;
        int b=0;
        Scanner sc = new Scanner(System.in);
        enterBudget();
        budget = sc.nextInt();
        
        HashMap<String, Integer> productPrice = new HashMap<String, Integer>();
        HashMap<String, Integer> productQuantity = new HashMap<String, Integer>();
        
       // System.out.println("budget is:");
       while(b!=2){
            chooseOption();
            b = sc.nextInt();

            String productName;
            int quantity=0;
            int price=0;
            //int amount = budget;
            if(b==1){

                System.out.println();
                System.out.print("Enter product : ");
                productName = sc.next();
                System.out.println();
                System.out.print("Enter quantity : ");
                quantity = sc.nextInt();
                productQuantity.put(productName, quantity);
                System.out.println();
                System.out.print("Enter Price : ");
                price = sc.nextInt();
                productPrice.put(productName, price);
                System.out.println();
                int prevAmount = budget;
                if(price<prevAmount) {
                    budget=budget-price;
                }
                if(price<prevAmount){
                    System.out.println("Amount left : "+budget);
                }else System.out.println("Can't Buy the product ###(because budget left is "+prevAmount+")");

            }else if(b==2 && budget>0) {
                System.out.println();
                System.out.println("Amount left can buy you wheat");
            }
            for(String i:productQuantity.keySet()) {
                System.out.println("Product name: " + i + ";" + " Quantity : " + productQuantity.get(i) + ";" + " Price : " + productPrice.get(i));
            }
        }
    }

    private static void printWelcomeMessage() {
        System.out.println();
        System.out.println("User GO with following question ");
        System.out.println(); 
    }

    private static void enterBudget() {
        System.out.print("Enter Your budget : ");
    }

    private static void chooseOption() {
        System.out.println();
        System.out.println("1.Add an item");
        System.out.println("2.Exit");
        System.out.println("");
        System.out.print("Enter your choice : ");
    } 

}
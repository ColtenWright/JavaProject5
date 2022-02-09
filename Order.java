/**
   Order Class
*/

import java.util.Scanner;

public class Order
{
   private char entree;
   private char drink;
   private char dessert;
   private String selectedEntree, selectedDrink, selectedDessert, input, input2, input3;
   private char  finalEntree, finalDrink, finalDessert;
   private double priceEntree, priceDrink, priceDessert, customerTotal;
   
   /**
   Default Constructor
   Sets all values to zero
   */
   
   public Order()
   {

   }
   
   /**
   Constructor
   @param selectedEntree is the Entree choice the user made
   @param selectedDrink is the drink choice the user made
   @param selectedDessert is the dessert choice the user made
   */
   
   public Order(char entree, char drink, char dessert)
   {
      finalEntree = entree;
      finalDrink = drink;
      finalDessert = dessert;
   }
   
   //Get user data
   Scanner keyboard = new Scanner(System.in);
   
   //Create method setEntree
   
   /**
   Allows for the user to input thier Entree choice
   */
   
   public void setEntree()
   {
      //Ask for burger ordered
      System.out.println("Which entree would you like to order?");
      System.out.println("\tIf Hamburger enter: H");
      System.out.println("\tIf Cheeseburger enter: C");
      System.out.println("\tIf Veggieburger enter: V");
      input = keyboard.nextLine();
      entree = input.charAt(0);
      
      switch (entree)
      {
         case 'H':
            System.out.println(" ");
            System.out.println("You chose Hamburger");
            System.out.println(" ");
            priceEntree = 4;
            selectedEntree = ("Hamburger");
            break;
         case 'C':
            System.out.println(" ");  
            System.out.println("You chose Cheeseburger");
            System.out.println(" ");
            priceEntree = 5;
            selectedEntree = ("Cheeseburger");
            break;   
         case 'V':
            System.out.println(" ");
            System.out.println("You chose Veggieburger");
            System.out.println(" ");
            priceEntree = 6;
            selectedEntree = ("Veggieburger");
            break;
         default:
            System.out.println(" ");
            System.out.println("A valid burger choice was not entered.");
            System.out.println("Please end the program and try again.");
            System.out.println(" ");
            priceEntree = 0;
            selectedEntree = ("Unknown");
      }
   }
   
   //Create method setDrink
   
   /**
   Allows for the user to input their drink choice
   */
   
   public void setDrink()
   {
      //Ask for drink ordered
      System.out.println("Which drink would you like to order?");
      System.out.println("\tIf a Small enter: S");
      System.out.println("\tIf a Medium enter: M");
      System.out.println("\tIf a Large enter: L");
      System.out.println("\tIf a Water enter: W");
      input2 = keyboard.nextLine();
      drink = input2.charAt(0);
      
      switch (drink)
      {
         case 'S':
            System.out.println(" ");
            System.out.println("You chose a small drink");
            System.out.println(" ");
            priceDrink = 1.5;
            selectedDrink = ("Small Drink");
            break;
         case 'M':  
            System.out.println(" ");
            System.out.println("You chose a medium drink");
            System.out.println(" ");
            priceDrink = 2;
            selectedDrink = ("Medium Drink");
            break;   
         case 'L':
            System.out.println(" ");
            System.out.println("You chose a large drink");
            System.out.println(" ");
            priceDrink = 2.5;
            selectedDrink = ("Large Drink");
            break;
         case 'W':
            System.out.println(" ");
            System.out.println("You chose a water");
            System.out.println(" ");
            priceDrink = 0;
            selectedDrink = ("Water");
            break;
         default:
            System.out.println(" ");
            System.out.println("A valid drink choice was not entered.");
            System.out.println("Please end the program and try again.");
            System.out.println(" ");
            priceDrink = 0;
            selectedDrink = ("Unknown");
      }

   }
   
   //Create method setDessert
   
   /**
   Allows for the user to input their Dessert choice
   */
   
   public void setDessert()
   {
      //Ask for dessert ordered
      System.out.println("Which dessert would you like to order?");
      System.out.println("If Vanilla enter: V");
      System.out.println("If Chocolate enter: C");
      System.out.println("If Yogurt enter: Y");
      System.out.println("If Nothing enter: N");
      input3 = keyboard.nextLine();
      dessert = input3.charAt(0);
      
      //Determine Dessert       
      switch (dessert)
      {
         case 'V':
            System.out.println(" ");
            System.out.println("You chose Vanilla");
            System.out.println(" ");
            priceDessert = 1.5;
            selectedDessert = ("Vanilla");
            break;
         case 'C':  
            System.out.println(" ");
            System.out.println("You chose Chocolate");
            System.out.println(" ");
            priceDessert = 1.50;
            selectedDessert = ("Chocolate");
            break;   
         case 'Y':
            System.out.println(" ");
            System.out.println("You chose Yogurt");
            System.out.println(" ");
            priceDessert = 1.75;
            selectedDessert = ("Yogurt");
            break;
         case 'N':
            System.out.println(" ");
            System.out.println("You chose Nothing");
            System.out.println(" ");
            priceDessert = 0;
            selectedDessert = ("Nothing");
            break;
         default:
            System.out.println(" ");
            System.out.println("A valid dessert choice was not entered.");
            System.out.println("Please end the program and try again.");
            System.out.println(" ");
            priceDessert = 00;
            selectedDessert = ("Unknown");
      }
   }
   
   //Create method getEntree
   
   /**
   returns the character the entree variable holds
   @return finalEntree is the entree choice of the user
   */
   
   public char getEntree()
   {
      return entree;
   }
   
   //Create method getDrink
   
   /**
   returns the character the finalDrink variable holds
   @return finalDrink is the final drink choice of the user
   */
   
   public char getDrink()
   {
    return drink;
   }
   
   //Create method getDessert
   
   /**
   returns the character the dessert variable holds
   @return finalDessert is the dessert choice of the user
   */
   
   public char getDessert()
   {
   return dessert;
   }
   
   //Create method getPriceEntree
   
   /**
   returns the value the priceEntree variable holds
   @return priceEntree is the price of the entree ordered
   */
   
   public double getPriceEntree()
   {
      return priceEntree;
   }
   
   //Create method getPriceDrink
   
   /**
   returns the value the drink variable holds
   @return priceDrink is the price of the drink ordered
   */
   
   public double getPriceDrink()
   {
      return priceDrink;
   }
   
   //Create method getPriceDessert
   
   /**
   returns the value the priceDessert variable holds
   @return priceDessert is the price of the dessert ordered
   */
   
   public double getPriceDessert()
   {
      return priceDessert;
   }
   
   //Create method getPrice
   
   /**
   returns the value the customerTotal variable holds
   @return customerTotal is the calculated total of all three items ordered
   */
   
   public double getPrice()
   {
      customerTotal = (priceEntree + priceDrink + priceDessert);
      return customerTotal;
   }
}   
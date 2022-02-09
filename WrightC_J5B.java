// Colten Wright
// Order Class Demo - WrightC_J5B

import java.util.Scanner;

public class WrightC_J5B
{
   public static void main(String[] args)
   {
      //Declare new Order Classes
      Order person1 = new Order();
      Order person2 = new Order();
      Order person3 = new Order();
      //Receive information for first person
      person1.setEntree();
      person1.setDrink();
      person1.setDessert();
      //Receive information for second person
      person2.setEntree();
      person2.setDrink();
      person2.setDessert();
      //Receive information for third person
      person3.setEntree();
      person3.setDrink();
      person3.setDessert();
      //Display Order Results
      System.out.printf("\nPerson #1's (" + person1.getEntree() + "," + person1.getDrink() + "," + person1.getDessert() + ") total is:");
      System.out.printf("\n\t\tEntree:   " + "$%,10.2f\t",person1.getPriceEntree());
      System.out.printf("\n\t\tDrink:    " + "$%,10.2f\t",person1.getPriceDrink());
      System.out.printf("\n\t\tDessert:  " + "$%,10.2f\n",person1.getPriceDessert());
      System.out.printf("\t\t---------------------");
      System.out.printf("\n\t\tTotal:    " + "$%,10.2f\n",person1.getPrice());
      
      System.out.printf("\nPerson #2's (" + person2.getEntree() + "," + person2.getDrink() + "," + person2.getDessert() + ") total is:");
      System.out.printf("\n\t\tEntree:   " + "$%,10.2f\t",person2.getPriceEntree());
      System.out.printf("\n\t\tDrink:    " + "$%,10.2f\t",person2.getPriceDrink());
      System.out.printf("\n\t\tDessert:  " + "$%,10.2f\n",person2.getPriceDessert());
      System.out.printf("\t\t---------------------");
      System.out.printf("\n\t\tTotal:    " + "$%,10.2f\n",person2.getPrice());
      
      System.out.printf("\nPerson #3's (" + person3.getEntree() + "," + person3.getDrink() + "," + person3.getDessert() + ") total is:");
      System.out.printf("\n\t\tEntree:   " + "$%,10.2f\t",person3.getPriceEntree());
      System.out.printf("\n\t\tDrink:    " + "$%,10.2f\t",person3.getPriceDrink());
      System.out.printf("\n\t\tDessert:  " + "$%,10.2f\n",person3.getPriceDessert());
      System.out.printf("\t\t---------------------");
      System.out.printf("\n\t\tTotal:    " + "$%,10.2f\n",person3.getPrice());
      
      System.out.printf("\nOrder Total: " + "$%,10.2f\t",(person1.getPrice() + person2.getPrice() + person3.getPrice()));
   }
}
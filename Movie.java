/**
   Movie class
*/

import java.util.Scanner;

public class Movie
{
   private String title;
   private String studioName;
   private int yearProduced;
   private double rating;
   
   //Get user data
   Scanner keyboard = new Scanner(System.in);
   
   //Create method setTitle
   
   /**
   setTitle allows for the user to input their movies name and stores it in the title variable
   */

   public void setTitle()
   {
      //Receive the name of the movie from the user
      System.out.println("What is the title of the movie?");
      title = keyboard.nextLine();
   }
   
   //Create method setStudioName
   
   /**
   setStudioName allows for the user to input the studio's name that made their movie and stores it in the studioName variable
   */
   
   public void setStudioName()
   {  
      //Receive the name of the studio from the user
      System.out.println("What is the name of the studio that produced the movie?");
      studioName = keyboard.nextLine();
   }
   
   //Create method setYearProduced
   
   /**
   setYearProduced allows for the user to input the year their movie was made and stores it in the yearProduced variable
   */
   
   
   public void setYearProduced()
   {
      //Receive the year the movie was produced from the user
      System.out.println("What year was the movie produced in?");
      yearProduced = keyboard.nextInt();
   }
   
   //Create method setRating
   
   /**
   setRating allows for the user to input the rating their movie received and stores it in the rating variable
   */
   
   public void setRating()
   {
      //Receive the rating of the movie from the user
      System.out.println("What was the rating the movie received?");
      rating = keyboard.nextDouble();
      System.out.println(" ");
   }
   
   //Create method getTitle
   
   /**
   returns the value the title variable holds
   @return title is the title input by the user
   */
   
   public String getTitle()
   {
      return title;
   }
   
   //Create method getStudioName
   
   /**
   returns the value the studioName variable holds
   @return studioName is the studio's name input by the user
   */
   
   public String getStudioName()
   {
      return studioName;
   }
   
   //Create method getYearProduced
   
   /**
   returns the value the yearProduced variable holds
   @return yearProduced is the year the movie was produced input by the user
   */
   
   public int getYearProduced()
   {
      return yearProduced;
   }
   
   //Create method getRating
   
   /**
   returns the value the rating variable holds
   @return rating is the movies rating input by the user
   */
   
   public double getRating()
   {
      return rating;
   }
}
      
      
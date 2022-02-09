// Colten Wright
// Movie Class Demo - WrightC_J5A

import java.util.Scanner;

public class WrightC_J5A
{
   public static void main(String[] args)
   {
      //Declare new Movie Classes
      Movie movie1 = new Movie();
      Movie movie2 = new Movie();
      Movie movie3 = new Movie();
      //Receive informtion for first movie
      movie1.setTitle();
      movie1.setStudioName();
      movie1.setYearProduced();
      movie1.setRating();
      //Receive information for second movie
      movie2.setTitle();
      movie2.setStudioName();
      movie2.setYearProduced();
      movie2.setRating();
      //Receive information for third movie
      movie3.setTitle();
      movie3.setStudioName();
      movie3.setYearProduced();
      movie3.setRating();
      //Display first movie Info
      System.out.println("The Movie title is " + movie1.getTitle());
      System.out.println("The Studio that made the movie is " + movie1.getStudioName());
      System.out.println("The year the movie was produced in was " + movie1.getYearProduced());
      System.out.println("The rating the movie was given is " + movie1.getRating());
      System.out.println(" ");
      //Display second movie Info
      System.out.println("The Movie title is " + movie2.getTitle());
      System.out.println("The Studio that made the movie is " + movie2.getStudioName());
      System.out.println("The year the movie was produced in was " + movie2.getYearProduced());
      System.out.println("The rating the movie was given is " + movie2.getRating());
      System.out.println(" ");
      //Display third movie Info
      System.out.println("The Movie title is " + movie3.getTitle());
      System.out.println("The Studio that made the movie is " + movie3.getStudioName());
      System.out.println("The year the movie was produced in was " + movie3.getYearProduced());
      System.out.println("The rating the movie was given is " + movie3.getRating());
   }
}
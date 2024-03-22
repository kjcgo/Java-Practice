import java.util.Scanner;

public class Quadrant{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      //get user input 
      System.out.print("Enter X and Y separated by a space: ");
      String coordinate = scan.nextLine();
      
      //change into array
      String[] xAndY = coordinate.split(" ", 0);
      
      //parse into integer
      int x = (Integer.parseInt(xAndY[0]));
      int y = (Integer.parseInt(xAndY[1]));
      
      //sort into quadrants
      if(x > 0 && y > 0){
         System.out.print("Q1");
      }
      else if(x < 0 && y > 0){
         System.out.print("Q2");
      }
      else if(x < 0 && y < 0){
         System.out.print("Q3");
      }
      else
         System.out.print("Q4");
   }
}
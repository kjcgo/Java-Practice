import java.util.Scanner;
import java.lang.Math;

public class ElectricCharges{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      //user input 
      System.out.println("Enter kilowatt hours used: ");
      
      //store kilowatt hours
      int kwh = scan.nextInt();
      
      //if number is less than 1001
      double total = 0;
      if(kwh < 1001){
         total += kwh * 7.633;
      }
      else{
      
         //if there are more than 1000 hours
         total += 7633 + ((kwh - 1000) * 9.259);
      }
      //rounding and divide by 100 returns dollar amount.
      total = (Math.round(total)/100.0);
      System.out.print("Amount owed is $");
      System.out.print(total);
   }
      
}
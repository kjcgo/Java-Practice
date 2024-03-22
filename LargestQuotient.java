import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class LargestQuotient{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      //get user input
      System.out.println("Enter integers separated by a space. End with 0: ");
      String theseInts = scan.nextLine();
      
      //separate into an array
      String[] myInts = theseInts.split(" ", 0);
      
      //find least and greatest
      int least = Integer.parseInt(myInts[0]);
      int greatest = Integer.parseInt(myInts[0]);
      
      //use parsing to get int
      for(int i = 1; i < myInts.length - 1; i++){
         int current = Integer.parseInt(myInts[i]);
         if(current < least){
            least = current;
         }
         if(current > greatest){
            greatest = current;
         }  
      }
      
      //divide to get quotient
      System.out.println(greatest/least);
   }
}


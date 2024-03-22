import java.util.Scanner;
import java.util.ArrayList;

public class Commas{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      //create empty ArrayList to store items
      ArrayList<String> series = new ArrayList<String>();
      while(true){
         
         //get user input
         System.out.println("Enter next item or quit:");
         String s = scan.nextLine();
         
         //exit if done
         if(s.equals("quit")){
            break;
         }
         
         //store in series
         series.add(s);
      }
      
      //simply print if one
      if(series.size() == 1){
         System.out.print(series.get(0));
      }
      
      //separate with and if two
      else if(series.size() == 2){
         System.out.print(series.get(0) + " and " + series.get(1));
      }
      else{
      
      //all except last two separated with ","
         String output = "";
         for(int i = 0; i < series.size() - 2; i++){
            output += series.get(i);
            output += ", ";
         }
         
         //last two items joined with and
         output += (series.get(series.size() - 2) + " and " + series.get(series.size() - 1));
         System.out.print(output);
      }
   }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Difference{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the first set of data separated by a space: ");
      String first = scan.nextLine();
      String[] first1 = first.split(" ", 0);
   
      System.out.println("Enter the second set of data separated by a space: ");
      String second = scan.nextLine();
      String[] second1 = second.split(" ", 0);
      
      ArrayList<Integer> differences = new ArrayList<Integer>();
      
      ArrayList<Integer> firstList = new ArrayList<Integer>();
      ArrayList<Integer> secondList = new ArrayList<Integer>();
      for(int i = 0; i < first1.length; i++){
         firstList.add(Integer.parseInt(first1[i]));
      }
      for(int i = 0; i < second1.length; i++){
         secondList.add(Integer.parseInt(second1[i]));
      }
      

      for(int i = 0; i < secondList.size(); i++){
         if(!firstList.contains(secondList.get(i))){
            differences.add(secondList.get(i));
         }
      }
      for(int i = 0; i < firstList.size(); i++){
         if(!secondList.contains(firstList.get(i))){
            differences.add(firstList.get(i));
         }
      }
      
      Collections.sort(differences);
      if(differences.size() != 0){
         for(int i = 0; i < differences.size(); i++){
            System.out.print(differences.get(i));
            System.out.print(" ");
         }
      }
      else
         System.out.print("No differences");
}
}
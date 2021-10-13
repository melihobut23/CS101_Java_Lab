import java.util.*;
/*
 * @Author Melih Obut
 * @Date  09.10.2019
 */

public class Main{
   public static void main(String[] args)
   {

      IntBag intBag = new IntBag();
      Scanner scanner = new Scanner(System.in);
      
      int input;
      
      do{
         System.out.println("Enter ");
         System.out.println("1- Create a new empty collection(any previous values are lost!)");
         System.out.println("2- Read a set of positive values into the collection (use zero to indicate all the values have been entered.)");
         System.out.println("3- Print the collection of values.");
         System.out.println("4- Add a value to the collection of values at a specified location");
         System.out.println("5- Remove the value at a specified location from the collection of values");
         System.out.println("6- Remove all instances of a value within the collection");
         System.out.println("7- Quit");
         
         input = scanner.nextInt();
         
         if(input == 1) // create new bag without previous values
         {
            intBag = new IntBag(); 
         }
         else if(input == 2)
         {
            System.out.println("Enter a list with one space and last one must be zero.");
            String values = scanner.nextLine();
            values = scanner.nextLine(); // it is because of compulsory
            
            for(int a = 0; a < values.length(); a += 2)
            {
               int number = Character.getNumericValue(values.charAt(a));
               if(number != 0){ // to not take 0 into array
                  intBag.add(number);
               }
            }
            
         }
         else if(input == 3)
         {
            System.out.println(intBag);
         }
         else if(input == 4)
         {
            System.out.println("Enter value then with space enter index to add the list.");
            String numAndLoc = scanner.nextLine();
            numAndLoc = scanner.nextLine();
            intBag.add(Character.getNumericValue(numAndLoc.charAt(0)),
                       Character.getNumericValue(numAndLoc.charAt(2)));
         }
         else if(input == 5)
         {
            System.out.println("Enter a index number to remove from list.");
            int indexRem = scanner.nextInt();
            intBag.remove(indexRem);
         }
         else if(input == 6)
            {
            System.out.println("Enter just one number to take that values out of list");
            int numRem = scanner.nextInt();
            intBag.removeAll(numRem);
         }
      }while(input != 7);
      
      System.out.println("DONE!");
   }
}

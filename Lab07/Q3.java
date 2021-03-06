import java.util.*;
import java.io.*;
/**
 * 
 * Reads all of the words from an input text file into an array
 * sorts those words,writes sorted words in a new text file
 * 
 * @author Melih Obut
 * @date 18.12.19
*/

public class Q3
{
   //method to merge two sublists of Strings
   public static void merge(String arr[], int low, int mid, int high)
   {
      int n1 = mid - low + 1;
      int n2 = high - mid;
      
      //create temporary arrays
      String c1[] = new String[n1];
      String c2[] = new String[n2];
      
      //copy the Strings
      for(int i=0; i< n1; i++){
         
         c1[i] = arr[low + i];
      }
      
      for(int i=0; i<n2; i++){
         
         c2[i] = arr[mid + i + 1];
      }
      
      int i=0, j=0, k=low;
      
      while((i<n1)&&(j<n2)){
         
         if(c1[i].compareToIgnoreCase(c2[j])<0){
            
            arr[k] = c1[i];
            i = i + 1;
         }
         else{
            
            arr[k] = c2[j];
            j = j + 1;
         }
         k = k + 1;
      }
      
      while(i<n1){
         
         arr[k] = c1[i];
         i = i + 1;
         k = k + 1;
      }
      
      while(j<n2){
         
         arr[k] = c2[j];
         j = j + 1;
         k = k + 1;
      }
   }
   
   //method to sort the list using mergesort
   public static void sort(String arr[], int low, int high){
      
      if(low<high){
         int mid = (low+high)/2;
         sort(arr, low, mid);
         sort(arr, mid+1, high);
         merge(arr, low, mid, high);
      }
   }
   
   //main method
   public static void main (String[] args) throws IOException{
      
      //create an instance of Scanner class and open the input file
      Scanner input = new Scanner(new File("houseman.txt"));
      
      ArrayList<String> list = new ArrayList<>();
      
      String s;
      
      //read the words from file
      while(input.hasNext())
      {
         s = input.next();
         list.add(s);
      }
      
      //declare array of String
      String arr[] = new String[list.size()];
      
      for(int i=0; i<list.size(); i++)
      {
         arr[i] = list.get(i);
      }
      
      // sort the list
      sort(arr, 0, arr.length-1);
      
      //create an instance of PrintWriter class and open the output file
      PrintWriter output = new PrintWriter(new File("output.txt"));
      
      //write to the file
      s = arr[0];
      output.write(s + " ");
      for(int i=1; i < arr.length; i++)
      {
         if(!s.equals(arr[i]))
         {
            output.write(" \n " + arr[i] + " \n ");
         }
         s = arr[i];
      }
      
      //close the file
      input.close();
      output.close();
   }
}
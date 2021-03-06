import java.util.*;
import java.io.*;
/**
 * 
 * Merges two sorted String arrays, producing a new sorted Stringarray
 * 
 * @author Melih Obut
 * @date 18.12.19
*/
public class Q1
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
      
      for(int i=0; i< n2; i++){
         c2[i] = arr[mid + i + 1];
      }
      
      int i=0, j=0, k=low;
      
      while(( i < n1) && ( j < n2 )){
         
         if(c1[i].compareTo(c2[j]) < 0){
            arr[k] = c1[i];
            i = i + 1;
         }
         else{
            arr[k] = c2[j];
            j = j + 1;
         }
         k = k + 1;
      }
      
      while(i < n1){
         arr[k] = c1[i];
         i = i + 1;
         k = k + 1;
      }
      
      while(j < n2)
      {
         arr[k] = c2[j];
         j = j + 1;
         k = k + 1;
      }
   }
   
   //method to sort the list using mergesort
   public static void sort(String arr[], int low, int high)
   {
      if(low < high)
      {
         int mid = (low + high) / 2;
         sort(arr, low, mid);
         sort(arr, mid+1, high);
         merge(arr, low, mid, high);
      }
   }
   //main method
   public static void main (String[] args) 
   {
      String[] x = { "cats", "hogs", "zebras" };
      String[] y = { "frogs","dogs", "monkeys" };
      int xLen = x.length;
      int yLen = y.length;
      String[] arr = new String[ x.length + y.length ];
      System.arraycopy(x, 0, arr, 0, xLen);
      System.arraycopy(y, 0, arr, xLen, yLen);
      sort(arr, 0, arr.length-1);    
      
      System.out.println(Arrays.toString(arr));
      
   }
}
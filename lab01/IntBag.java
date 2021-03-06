import java.util.*;
/*
 * Creating Array for size 4 and doing some stuff about it
 * 
 * @Author Melih Obut
 * @Date 9.10.2019
 */
public class IntBag{
   
   //Variables
   private int[] intBag;
   
   //Constructor 
   public IntBag()
   {
      intBag = new int[4];
   }
   
   /*
    * add method
    * @parameter int a
    */
   public void add(int a)
   {
      if( intBag[ intBag.length - 1 ] == -1 )
      { 
      // If there is no room for new int
         intBag[intBag.length - 1] = a;
         int[] newBag = new int[intBag.length * 2]; //double sized array
         
         for(int i = 0; i < intBag.length; i++)
         {
            newBag[i] = intBag[i];
         }
         
         newBag[intBag.length] = -1; //making the last instance -1
         intBag = newBag;
      }
      else
      {
         int first = 0; // to understand is it first time for loop
         for(int i = 0; i < intBag.length - 1; i++)
         {
            if(intBag[i] == -1)
            {
               intBag[i] = a;
               intBag[i + 1] = -1;
               first++;
               i = intBag.length; // to exit from loop
            }
         }
         
         if(first == 0)
         {
            intBag[0] = a;
            intBag[1] = -1;
         }
      }
   }
   
   /*
    * More than size of Array and add sentinel value at the end.
    * 
    * @paramater number
    * @parameter index
    */
   public void add(int a, int index){
      if( intBag[intBag.length - 1] == -1 )
      { // there has to make the array size double
         int[] newBag = new int[intBag.length * 2]; // create new array
         
         for(int i = 0; i < intBag.length + 1; i++)
         {
            if(index > i)
            {
               newBag[i] = intBag[i];
            }else if(index == i)
            {
               newBag[i] = a;
            }else
            {
               newBag[i] = intBag[i - 1];
            }
         }
         
         newBag[intBag.length] = -1;
         intBag = new int[intBag.length * 2];
         intBag = newBag;
      }else
      {
         int[] oldBag = new int[intBag.length];
         int count = 0;
         boolean loop = true;
         int firstIndex = 0; // to understand given index is zero
         
         while(loop)
         {
            if(index > count)
            { //assuming index is lesser than sentinel value
               oldBag[count] = intBag[count];
            }
            else if(index == count)
            {
               oldBag[count] = a;
            }
            else
            {
               oldBag[count] = intBag[count - 1];
               
               if(intBag[count ] == -1)
               { // if the value is 0 do not need to check other values
                  loop = false;
               }
               
            }
            count++;
         }
         
         count--;
         oldBag[count + 1] = intBag[count];
         intBag = oldBag;
      }
   }
   
   /*
    * remove element from that index changing with
    * last element 
    * @parameter index
    */
   public void remove(int index)
   {
      int count = 0; // to check which index -1 is
      boolean loop = true; // to exit loop when -1 is found
      
      while(count < intBag.length && loop){
         if(intBag[count] == -1){
            loop = false;
         }
         count++;
      }
      
      count--;
      intBag[index] = intBag[count - 1];
      intBag[count - 1] = -1;
      intBag[count] = 0;
   }
   
   /*
    * to find if given value is in the list or not
    * @parameter int value
    * @return true if given value in the list otherwise false
    */
   public boolean contain(int value)
   {
      for(int element : intBag)
      {
         if(element == value)
         {
            return true;
         }
      }
      return false;
   }
   
   /*
    * method for getting value in specified index
    * @parameter int index
    * @return int 
    */
   public int getValue(int index)
   {
      return intBag[index];
   }
   
   /*
    * methods give size without zero
    * @return int
    */
   public int getSize()
   {
      int size = 0;
      for(int a = 0; a < intBag.length; a++)
      {
         if(intBag[a] == -1){
            a = intBag.length; // to exit loop
         }
         size++;
      }
      size--;
      return size;
   }
   
   /*
    * remove the specified elements from the list
    * @paramater int value
    */
   public void removeAll(int value)
   {
      int index = 0;
      while(contain(value))
      {
         if(intBag[index] == value)
         {
            remove(index);
            index--; // because of remove method 
         }
         index++;
      }
      
   }
   
   /*
    * String represantation of the array
    * @return string 
    */
   public String toString()
   {
      int count = 0; // to find where -1 is
      boolean loop = true; // for efficiency
      int[] newBag;
      
      while(count < intBag.length && loop)
      {
         if(intBag[count] == -1){
            loop = false;
         }
         count++;
      }
      
      count--; // because we cant take -1 string representation looks ridiculous
      if(loop)
      {
         newBag = new int[count + 1]; // there is no method applied
      }
      else
      {
         newBag = new int[count];
      }
      
      for(int i = 0; i < count; i++){
         newBag[i] = intBag[i];
      }
      
      return Arrays.toString(newBag);
   }
}

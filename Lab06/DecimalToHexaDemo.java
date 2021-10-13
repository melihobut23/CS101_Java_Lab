import java.util.Scanner;

public class DecimalToHexaDemo
{
   char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
   int temp;
   String hexA = "";
   String hexadecimal(int num)
   { 
      if(num != 0)
      {
         temp = num % 16;
         hexA = hexa[temp] + hexA;
         num = num / 16;
         hexadecimal(num);
      }
      return hexA;
   } 

   public static void main(String[] args)
   {
      DecimalToHexaDemo dth = new DecimalToHexaDemo();
      int decimalNumber;
      
      Scanner sc = new Scanner(System.in); 
      System.out.println("Please enter decimal number: ");
      decimalNumber =1249;
      String str = dth.hexadecimal(decimalNumber); 
      System.out.print(str);
   }
}
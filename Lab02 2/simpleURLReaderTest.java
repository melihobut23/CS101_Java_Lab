import cs1.SimpleURLReader; 

public class simpleURLReaderTest 
{
   public static void main(String args[])
   {
      
      SimpleURLReader s1; 
      s1 = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~david/housman.htm");
      
      System.out.println(s1.getPageContents());
      System.out.println("------------------------------------");
      System.out.println(s1.getLineCount());
   }
}
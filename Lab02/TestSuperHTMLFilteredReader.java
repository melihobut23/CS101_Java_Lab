public class TestSuperHTMLFilteredReader 
{
   
   public static void main(String[] args) 
   {
      // TODO Auto-generated method stub
      
      SuperHTMLFilteredReader supRead = new SuperHTMLFilteredReader("http://www.cs.bilkent.edu.tr/~david/index.html");
      
      for(int i = 0 ; i< supRead.getLinks().size();i++){
         System.out.println(supRead.getLinks().get(i));
      }
      
   }
   
}
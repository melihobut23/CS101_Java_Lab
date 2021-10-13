public class TesMytSimpleURLReader {
   public static void main(String[] args){
      
      MySimpleURLReader r1;
      
      r1= new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~david/housman.txt");
      
      System.out.println(r1.getPageContents());
      
      System.out.println(r1.getURL());
      System.out.println(r1.getName());
      
   }
   
}
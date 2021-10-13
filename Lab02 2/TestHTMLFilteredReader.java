public class TestHTMLFilteredReader {
   
   public static void main(String[] args) {
      
      HTMLFilteredReader html = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~david/housman.htm");
      
      System.out.println(html.getPageContents());    
   }
}
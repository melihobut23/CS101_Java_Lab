import java.util.ArrayList;

import cs1.SimpleURLReader;

public class HTMLFilteredReader extends MySimpleURLReader {
   
   public HTMLFilteredReader(String arg0) {
      super(arg0);
      // TODO Auto-generated constructor stub
   }
   
   public String getUnfilteredPageContents() {
      // called to return the original page complete with html codes.
      return super.getPageContents();
      
   }
   
   @Override
   public String getPageContents() {
      
      int length;
      int a, b;
      boolean done;
      String finalString;
      
      a = 0; // first index to omit
      b = 0; // last index to omit
      done = false;
      finalString = "";
      length = super.getPageContents().length();
      
      for (int i = 0; i < getUnfilteredPageContents().length(); i++) {
         
         if (getUnfilteredPageContents().charAt(i) == '<') {
            a = i;
         }
         if (getUnfilteredPageContents().charAt(i) == '>') {
            b = i;
            
         }
         
         if (a != 0 && b != 0) {
            finalString += getUnfilteredPageContents().substring(b + 1, a);
            
            a = 0;
            b = 0;
         }
      }
      return finalString;
   }
}
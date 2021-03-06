import java.util.ArrayList;

import cs1.SimpleURLReader;

public class SuperHTMLFilteredReader extends HTMLFilteredReader {
   
   public SuperHTMLFilteredReader(String arg0) {
      super(arg0);
      // TODO Auto-generated constructor stub
   }
   
   public ArrayList<String> getLinks() {
      ArrayList<String> list;
      ArrayList<Integer> listInt;
      ArrayList<Integer> listLast;
      String addList;
      boolean check;
      
      addList = "";
      list = new ArrayList<String>();
      listInt = new ArrayList<Integer>();
      listLast = new ArrayList<Integer>();
      check = true;
      
      for (int i = 0; i < getUnfilteredPageContents().length() - 3; i++) {
         if (getUnfilteredPageContents().charAt(i) == 'h' && getUnfilteredPageContents().charAt(i + 1) == 'r'
                && getUnfilteredPageContents().charAt(i + 3) == 'f') {
            listInt.add(i + 3); // the index of f at "href"
         }
      }
      
      for (int i = 0; i < listInt.size(); i++) {
         check = true;
         for (int j = listInt.get(i) + 2; j < getUnfilteredPageContents().length() && check; j++) {
            
            if (getUnfilteredPageContents().charAt(j) == '>') {
               listLast.add(j);
               check = false;
            }
            
         }
      }
      
      for (int i = 0; i < listInt.size(); i++) {
         list.add(getUnfilteredPageContents().substring(listInt.get(i) + 3, listLast.get(i) - 1));
         
      }
      
      return list;
      
   }
   
   public double overHead() {
      
      return getPageContents().length() * 100 / getUnfilteredPageContents().length();
   }
   
}
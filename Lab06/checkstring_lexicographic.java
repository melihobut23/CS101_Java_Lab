import java.util.*;

public class checkstring_lexicographic {
   
   /**
    * 
    * @param args
    * 
    */
   
   static List<String>alist=new ArrayList<String>();
   
   public static void main(String[] args) {
      
// TODO Auto-generated method stub
      
//alist.add("tiger");
      
//alist.add("lion");
      
      alist.add("anakonda");
      
      alist.add("monkey");
      
      alist.add("peakock");
      
      boolean b=rec_getorder(0,1);
      
      System.out.println(b);
      
   }
   
   private static boolean rec_getorder(int i, int j) {
      
// TODO Auto-generated method stub
      
      int one=i;
      
      int two=j;
      
      int compare = alist.get(i).compareTo(alist.get(j));  
      
      if (compare < 0) {  
         
         one++;
         
         two++;
         
         if(two<alist.size()){
            
            rec_getorder(one,two);
            
         }
         
         return true;
         
      }
      
      else {
         
//a is larger
         
         return false;
         
      }
      
   }
   
}
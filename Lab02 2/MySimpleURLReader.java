import cs1.SimpleURLReader;

public class MySimpleURLReader extends SimpleURLReader {
   
   String url;
   
   
   public MySimpleURLReader(String arg0) {
      super(arg0);
      url=arg0;
      
      // generated subclass constructor 
   }
   
   public String getURL() {
      
      return url;
      /* returns the url String used to create the SimpleURLReader object
       */
   }
   
   public String getName() {
      boolean check;
      int i;
      
      i=0;
      check=false;
      
      for(i=url.length()-1; (!check) && i>0;i--){
         if(url.charAt(i)== '/'){
            check=true;
         }
      }
      
      return url.substring(i+1,url.length());
      
      /* that returns the filename part of the url ,i.e, the part of the url
       * following the last '/' character
       */
      
   }
   
   @Override
   public String getPageContents() {
      
      /*
       * fixes the bug in SimpleURLReader's getPageContents() method whereby the
       * String "null" is added to the beginning of the String it returns. Do
       * this by overriding the corresponding method in your new sub-class.
       */
      return super.getPageContents().replace("null", "");
      
   }
}
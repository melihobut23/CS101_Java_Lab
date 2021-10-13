public class RemoveCharFromString{
   
   public static void main(String[] args) {
      String words = "bern senri sevirem";
      char removal = 'r';
      
      String newWords = remove(words, removal);// recieveing String from replace()
      System.out.println("Old String is =>  "+ words );
      System.out.println("New  String is =>  "+ newWords );
   }
   
   public static String remove(String word, char removal){
      if (word.length() < 1)
      {
         return word;
      }
      else{
         for(int i=0; i < word.length(); i++){
            if (word.charAt(i) == removal) 
            {
               word = word.substring(0, i) + word.substring(++i);
               
               return remove(word, removal);//calling replace()
            }
         }
      }
      return word;
   }
}

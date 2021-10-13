
public class Hangman
   
{
   private int numberOfIncorrectTries;
   private int maxAllowedIncorrectTries;
   private String secretWord;
   private StringBuffer allLetters;
   private StringBuffer usedLetters;
   private StringBuffer knownSoFar;
   public String a;
   public Hangman()
   {
      maxAllowedIncorrectTries = 6;
      numberOfIncorrectTries = 0;
      usedLetters = new StringBuffer();
      allLetters = new StringBuffer("abcdefghijklmnopqrstuwxyz");
      knownSoFar = new StringBuffer(a.length());
      
      for (int i = 0; i < a.length(); i++)
      {
         knownSoFar.append("*");
      }
   }
   
   
   /**
    * To get all the available letters
    * @return all the available letters
    */
   public String getAllLetters() { 
      return allLetters.toString();
   }
   
   /**
    * To get the used letters
    * @return the used letters
    */
   
   public String getUsedLetters() {
      return usedLetters.toString();
   }
   /**
    * To get the number of incorrect tries so far
    * @return the number of incorrect tries so far
    */
   public int getNumOfIncorrectTries() {
      return numberOfIncorrectTries;
   }
   
   /**
    * To get the number of maximum allowed incorrect tries
    * @return the number of maximum allowed incorrect tries
    */
   public int getMaxAllowedIncorrectTries()
   {
      return maxAllowedIncorrectTries;
   }
   
   
   /**
    * To get the currently known word 
    * @return the currently known word 
    */
   
   public String knownSoFar() {
      return knownSoFar.toString();
   }
   
   /**
    * @param letter 
    * @return
    */
   public int tryThis (char letter)
   {
      //properties
      int numberOfIncorrectTries = 0;
      int maxAllowedIncorrectTries = 6;
      
      
      
      boolean match = false;
      int count = 0;
      boolean added = false;
      
      if ( numberOfIncorrectTries >= maxAllowedIncorrectTries )
      {
         return -3;
      }
      
      if(Character.isLetter(letter))
      {
         if(usedLetters.toString().indexOf(letter) == -1)
         { 
            usedLetters.append(letter);
         }
         else
         { 
            return -2;
         }
         
         for( int i = 0; i < a.length() ; i++)
         {
            if( a.charAt(i) == letter)
            {
               match = true;
               count++;
               
               if (knownSoFar.charAt(i) != letter)
               {
                  knownSoFar.setCharAt( i, letter);
                  
               } 
            }
         }
         if ( !match )
         {
            numberOfIncorrectTries++;
         }
         return count;
      }
      else
      {
         return -1;
      }
   }
   /**
    * Checks whether the game has ended
    * @return true - if the game has already ended, false - otherwise
    */
   public boolean isGameOver() {
      if ( numberOfIncorrectTries == maxAllowedIncorrectTries || knownSoFar.indexOf( "?" ) == -1 ) {
         return true;
      }
      else { 
         return false;
      }
   }
   /**
    * Checks whether the game is lost
    * @return true - if the game is lost, false - otherwise
    */
   public boolean hasLost() {
      if ( numberOfIncorrectTries == maxAllowedIncorrectTries ) {
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    */
   
   private static String chooseSecretWord (){
      
      //a list of random words
      String list [] = new String [] {
         
         "elephant", "goat", "papa", "abdul", "cs" , "bilkent", "banana",
            "october", "computer", "building", "mug", "battery", "discrete", "mathematics",
            "tough", "mobile", "hahaahahah", "wallet", "card", "song", "country",
            "chemical" , "biology", "babysitter", "coffee", "carpenter", "keyboard", "tea", "milk",
            "headphones","design","advice","elephant","television","language","mosquito","vacation",
            "artificial","highlight","intersection", "passion", "reliability", "planner", "telephone",
            "picture", "photographer", "waiter", "treasure", "sweater", "laptop" ,"orange", "conservative",
            "airplane", "plumber", "dictionary", "station", "market", "gravity", "electric" ,"mouse",
            "classroom","mobile", "book", "car", "festival", "instructor", "bottle", "comb", "strugle",
            "music", "kangaroo", "course", "mother", "cheese", "smile", "glasses", "sun", "son", "amazing",
            "homework", "english", "tea", "database", "state", "government", "electrcity", "charger",
            "butter", "clothes", "date", "love", "flirt", "night", "mars", "chocolate","age","century"
      };
      
      int random = (int)(Math.random() * list.length);
      return  list[random];
   }
}


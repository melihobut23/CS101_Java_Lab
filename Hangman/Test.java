import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      // variables
      Hangman hangman = new Hangman();
      String letter;
      int result;
      
      // displaying the secret word
      do {
         System.out.println();
         System.out.println("--------------------HANGMAN-----------------");
         System.out.println();
         System.out.println("Secret Word is :" + hangman.getKnownSoFar());
         System.out.println("Unused letters are :" + hangman.getAllLetters());
         System.out.println("Used letters so far:" + hangman.getUsedLetters());
         System.out.println((6 - hangman.getNumOfIncorrectTries()) + " TRIES LEFT,PLEASE BE CAREFUL!");
         
         // to take the input from the user
         
         System.out.print("Enter a single letter :");
         letter = scan.next();
         if (letter.length() != 1) 
         {
            System.out.println("You have to enter a single letter!");
         } 
         else 
         {
            result = hangman.tryThis(letter.charAt(0));
            
            // to check the correction of inputs
            if (result == -1)
               System.out.println("\n"+"Invalid input: " + letter.toUpperCase());
            
            else if (result == -2) 
            {
               System.out.println("\n"+"Letter " + letter.toUpperCase() + " is already used!");
               System.out.println("Please try another letter!");
               displayHangman( hangman.getNumOfIncorrectTries());//Used to display hangman according to number of incorrect tries
            }
            
            else if (result == -3)
               System.out.println("Game Over...");
            
            // if the letter is not in the secret word
            else if (result == 0)
            {
               System.out.println("\n"+"Letter " + letter.toUpperCase() + " is not in the secretWord.");
                displayHangman( hangman.getNumOfIncorrectTries());//Used to display hangman according to number of incorrect tries
               
            }
            
            
            else if (result > 0) {
               hangman.getKnownSoFar();
               System.out.println("\n"+"Congratulations! " + letter.toUpperCase() + " is succesful!"); //for being succesful
               displayHangman( hangman.getNumOfIncorrectTries());
            }
            
         }
      } while (!hangman.isGameOver()); 
      //out of do loop
      
      if (hangman.knownSoFar.toString().toLowerCase().equals(hangman.secretWord.toString().toLowerCase()))
         System.out.println(" You Win! ");
      else
         System.out.println(" You Lost! :((");
      System.out.println("The Secret Word was " + hangman.secretWord.toString().toUpperCase());
   }
   public static void displayHangman( int incorrectTries ){ // For the killing table
      if( incorrectTries == 0){
         System.out.println( "\n\n\n\n\n" );
      }
      if( incorrectTries == 1 ){
         System.out.println( "\n\n\n|\n|\n|" );
      }
      if( incorrectTries == 2 ){
         System.out.println( "\n|\n|\n|\n|\n|" );
      }
      if( incorrectTries == 3 ){
         System.out.println( "_____\n|\n|\n|\n|\n|" );
      }
      if( incorrectTries == 4 ){
         System.out.println( "_____\n|   |\n|\n|\n|\n|" );
      }
      if( incorrectTries == 5 ){
         System.out.println( "_____\n|   |\n|   0\n|\n|\n|" );
      }
      if( incorrectTries == 6 ){
         System.out.println( "_____\n|   |\n|   0\n|  /|\\ \n|   |\n|" );
      }
      if( incorrectTries == 7 ){
         System.out.println( "_____\n|   |\n|   0\n|  /|\\ \n|   |\n|  / \\" );
      }
   }
}
import java.util.Scanner;
public class HangmanGame{
  public static void main(String[] arg){
    Scanner in = new Scanner(System.in);
    Hangman hangman = new hangman();
    while( hangman.getNumOfIncorrrectTries() < 7 && hangman.getKnownSoFar().contain( "*" )){
      System.out.println("You have " + hangman.getNumOfIncorrectTries() + "Incorrect guesses so far.");
      System.out.println(hangman.getKnownSoFar());
      System.out.println("Guess a letter");
      String guess = in.nextLine();
      hangman.tryThis(guess);
      if( relevance == -1 ){
        System.out.println("Letter is not valid.\n");            
      }else if(relevance == -2){
        System.out.println("Letter is already used.");
      }else if(relevance == -3){
        System.out.println("Game is over. The word is " + hangman.secretWord);
      }
    }
    if(hangman.getNumOfIncorrectTries() == 7){
      System.out.println("Game is over. There is no chance to try a letter");
    }else{
      System.out.println("You have " + hangman.getNumOfIncorrectTries() + "Incorrect guesses so far.");
      System.out.println(hangman.getKnownSoFar());
      System.out.println("Congratulations! You have done well.");
    }
    }
  }
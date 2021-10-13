/* It is main part of Hangman game homework
* @authors:
* Kimya Ghasemlou
* Lara Merdol
* Onur Korkmaz
*/
import java.util.Scanner;
public class HangmanApp{
  public static void main(String[] arg){
    Scanner in = new Scanner(System.in);

    Hangman hangman = new Hangman();
    while( hangman.getNumOfIncorrectTries() < 7 ){
      System.out.println("You have " + hangman.getNumOfIncorrectTries() + "Incorrect guesses so far.");
      System.out.println(hangman.getKnownSoFar());
      System.out.println("Guess a letter");
      char guess = in.nextLine().charAt(0);
      
      if( hangman.tryThis(guess) == -1 ){
        System.out.println("Letter is not valid.\n");            
      }else if(hangman.tryThis(guess) == -2){
        System.out.println("Letter is already used.");
      }else if(hangman.tryThis(guess) == -3){
        System.out.println("Game is over. The word is.. "  );
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
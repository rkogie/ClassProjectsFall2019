package assignment03;
import java.util.Scanner;
public class CoinTossMain {
    
  
    //Main method to flip coin and allow user to guess outcome
    public static void main(String[] args) {
      
        //Prompt user input on menu interface
        Scanner userIn = new Scanner(System.in);
        System.out.println("Welcome to the coin toss game. Choose from the menu:"
        + "\n1 - Toss Coin \nAny number - Quit");
        
        //Declare variables
        int choice; int totalHeads=0; int totalTails=0;
        choice = userIn.nextInt();

        //Loop executes code to call coin flip method and keeps track of which coin face toss has landed
        while (choice == 1)
        {
            int flip = Assign03Methods.flipCoin(); int guess;
            System.out.println("\nGuess which way the coin lands: \n Enter 1 for Heads \n Enter 0 for Tails");
            guess = userIn.nextInt();
            if (guess == flip ) {
                System.out.println("Correct");
            }else {
                System.out.println("Incorrect");
            }
            if (flip == 1){         
                totalHeads++;
            }else        
                totalTails++;
        //Results printed and prompts user to play again or exit
            System.out.println("Coin Result: " + flip);
            System.out.println("Heads total: "+ totalHeads + "\tTails total: " + totalTails);
            System.out.println("\nFlip again?"
                    + "\n1 - Yes \nAny number - Quit");
            choice = userIn.nextInt();
            }
        
        //Output message upon exiting program
        System.out.println("Thanks for playing!");
        }
    }




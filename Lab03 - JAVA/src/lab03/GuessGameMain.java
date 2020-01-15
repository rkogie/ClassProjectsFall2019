package lab03;

import java.util.Random;
import java.util.Scanner;

public class GuessGameMain {

    //Script to generate random number and ask user to guess inputs
    public static void main(String[] args) {
        //Declare variables 
        int guess = 0, guesscount = 0, x = generateNumber(0);
        
        //Main method executes console interface and prompts user to make selection
        System.out.println("Welcome to the guessing game."
                + "\nI'm thinking of a number between 1 and 1000.");

        //While loop with nested condition checks and increment to count user guesses
        while (guess != x) {
            System.out.print("\nWhats the number?: ");
            Scanner userIn = new Scanner(System.in);
            guess = userIn.nextInt();

            if (guess < x) {

                System.out.println("\nToo low!");
                guesscount++;
            } else if (guess > x) {

                System.out.println("\nToo high!");
                guesscount++;

            } else if (guess == x) {

                guesscount++;
                System.out.println("You are correct!"
                        + "\nThe number is: " + x
                        + "\nIt took you " + guesscount + " guesses.");
            }
        }
    }

    //Method to generate random number, cast into main method and stored as new variable
    public static int generateNumber(int randomNum) {
        //New object created from random class
        Random r = new Random();
        randomNum = r.nextInt(1000) + 1;
        return randomNum;
        //End of method
    }

}

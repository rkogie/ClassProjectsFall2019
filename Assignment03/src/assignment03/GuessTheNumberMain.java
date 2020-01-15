package assignment03;

import java.util.Scanner;

public class GuessTheNumberMain {

   //Main method to ask user to play guessing game
    public static void main(String[] args) {

        //Declare variables and prompt user input
        int choice;

        System.out.println("Welcome to the guessing game"
                + "\nYou need to guess my number, which is between 1 and 1000"
                + "\nPress Any num to Play, Press -1 to Quit");

        //Loop that runs input method while condition is true
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        while (choice != -1) {
            
           Assign03Methods.validInput();
           choice = input.nextInt();
        }
        //Ouput upon exit
            System.out.println("Thanks for playing!");
    }
}



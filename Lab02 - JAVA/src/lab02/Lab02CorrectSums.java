package lab02;

import java.util.Scanner;

public class Lab02CorrectSums {

    /*Script to generate 10 addition questions from 2 random integers 
    and keep track of how many the user answers correctly*/
    public static void main(String[] args) {

        //Declare variables
        int num1, num2, userSum, correct = 0;

        //Loop construct to generate two random numbers
        for (int i = 0; i < 3; i++) {
            Scanner userIn = new Scanner(System.in);

            //Generates random number between 1 & 100
            num1 = (int) (Math.random() * 101);
            num2 = (int) (Math.random() * 101);

            //Output of question prompts user to enter answer
            System.out.print(num1 + " + " + num2 + " = ");
            userSum = userIn.nextInt();

            //Condtition check to validate correct answers and keeps count of correct answers
            if (userSum == num1 + num2) {
                System.out.println("\t\tCorrect!");
                correct++;
            } else {
                System.out.println("\t\tIncorrect!");
                System.out.println("\t\tAnswer is: " + (num1 + num2));
            }

        }
        //Output with number of questions answered correctly
        System.out.println("You got " + correct + " correct answers.");
    }

}

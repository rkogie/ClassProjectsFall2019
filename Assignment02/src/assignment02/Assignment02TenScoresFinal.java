package assignment02;

import java.util.Scanner;

public class Assignment02TenScoresFinal {

    //Script to take 10 values of students and sort how many passed/failed
    public static void main(String[] args) {

        //Declared variables
        int score, pass = 0, fail = 0;

        // Loop construct to 
        for (int i = 0; i < 10; i++) {
            Scanner userIn = new Scanner(System.in);
            System.out.print("Enter the student score: ");
            score = userIn.nextInt();

            if (score >= 50 && score <= 100) {
                System.out.println("\t\tThis student passed");
                pass++;
            } else if (score >= 0 && score <= 50) {
                System.out.println("\t\tThis student failed");
                fail++;
            } else if (score < 0 && score > 100) {
                System.out.println("\nInvalid input. \nPlease enter a valid score between 0 and 100.");
            }
        }
        System.out.println("Students passed: " + pass
                + "\nStudents failed: " + fail);
    }
}

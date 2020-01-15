package assignment02;

import java.util.Scanner;

public class Assignment02TenScores {

    //Script to take 10 values of students and sort how many passed/failed
    public static void main(String[] args) {

        //Declared variables and prompt user to enter amount of numbers
        int score, pass = 0, fail = 0;

        for (int i = 0; i < 10; i++) {
            Scanner userIn = new Scanner(System.in);
            System.out.print("Enter the student score: ");
            score = userIn.nextInt();

            if (score >= 50) {
                pass++;
            } else {
                fail++;
            }
        }
        System.out.println("\nStudents passed: " + pass
                + "\nStudents failed: " + fail);

    }
}

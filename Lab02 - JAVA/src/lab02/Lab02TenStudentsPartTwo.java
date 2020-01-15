package lab02;

import java.util.Scanner;

public class Lab02TenStudentsPartTwo {

    //Script modified to keep entering student info until user enters -1 
    public static void main(String[] args) {

        //Declare variables
        String name, hiStuName = null;
        double score, hiScore = 0;
        int counter = 0;
  
        Scanner userIn = new Scanner(System.in);
        System.out.print("When prompted, enter student name and score. Enter -1 on score to terminate. ");
        //Do-while infinte loop prompts for user input until user enters -1
        do {
            counter++;
            System.out.print("\nStudent name: ");
            name = userIn.next();
            System.out.print("Student Score: ");
            score = userIn.nextInt();

            //Nested if statement to remove student name from count if user entered -1 to stop script
            if (score == -1) {
                --counter;
            }
            //Nested condition check to find largest number and corresponding student   
            if (score > hiScore) {
                hiScore = score;
                hiStuName = name;
            }
        } while (score != -1);
        System.out.println("\n" + counter + " student names and scores entered");
        System.out.println("\nHighest scoring student: " + hiStuName + "\nScore: " + hiScore);

    }
}

package lab02;

import java.util.Scanner;

public class Lab02TenStudents {

    //Script to find highest scoring student amongst sample
    public static void main(String[] args) {

        //Declare variables and initialise to zero/null 
        String hiStuName = null;
        double hiScore = 0;

        Scanner userIn = new Scanner(System.in);

        //Loop to prompt user to enter name and scores 10 times
        for (int i = 0; i < 3; i++) {
            System.out.print("\nStudent name: ");
            String name = userIn.next();
            System.out.print("Student Score:  ");
            double score = userIn.nextInt();

            //Condition check to find highest score 
            if (hiScore < score) {
                hiScore = score;
                hiStuName = name;
            }
        }
        System.out.println("\nStudent name: " + hiStuName + "\nScore: " + hiScore);
    }
}

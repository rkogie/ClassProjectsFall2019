package assignment02;

import java.util.Scanner;

public class Assignment02Largestof10Int {

    //Script to print largest of ten numbers entered by user
    public static void main(String[] args) {

        //Declared variables and prompt user to enter amount of numbers
        int num, largest;
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter the amount of numbers you want compared:");
        num = userIn.nextInt();

        /* Array variable allows user to input individual numbers corresponding to the amount of 
        numbers they requested for comparison in previous code*/
        int numCount[] = new int[num];
        System.out.println("\nEnter your numbers: ");

        for (int i = 0; i < num; i++) {
            numCount[i] = userIn.nextInt();
        }
        largest = numCount[0];
        for (int i = 0; i < num; i++) {
            if (largest < numCount[i]) {
                largest = numCount[i];
            }

        }
        System.out.println("Largest number is: " + largest);    
    }
}

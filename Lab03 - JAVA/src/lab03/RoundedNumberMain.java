package lab03;

import java.util.Scanner;

public class RoundedNumberMain {

    //Script to accept input from user and return decimal value to 2 d.p.
    public static void main(String[] args) {

        //User prompt to enter number and calls method
        System.out.print("Enter your decimal number: ");
        numToRound(0);
    }
    
    //Method to calcuate decimal to 2 d.p. from user input
    static double numToRound(double num) {
        //Scanner object created to accept user input
        Scanner userIn = new Scanner(System.in);
        num = userIn.nextDouble();
        System.out.printf("%.2f\n", num);
        return num;
        //End of method
    }

}

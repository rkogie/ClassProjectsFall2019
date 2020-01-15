package lab04;

import java.util.Scanner;

public class SmallestIndexArray {

    public static void main(String[] args) {
        //Accept input from user for the num of elements in their array
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter the amount of elements in your array: ");
        int num = userIn.nextInt();
        //Create new array that holds index amount of user input
        int[] arrayRun = new int[num];
        
        //Value returned from method stored into new array variable and outputs
        int index = Lab04Methods.getMinIndex(arrayRun);
        System.out.println("\nIndex position: "+ index);
    }
}

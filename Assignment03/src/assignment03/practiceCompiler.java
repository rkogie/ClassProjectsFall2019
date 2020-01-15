package assignment03;

import java.util.Scanner;

class practiceComplier {

    public static void main(String[] args) {

        System.out.println("Welcome to the overtime calculator");
        Scanner userIn = new Scanner(System.in);
        int hours;
        double payRate, pay;
        System.out.printf("Enter the hours worked: ");
        hours = userIn.nextInt();
        
        while (hours > 0) {

            System.out.printf("Enter the hourly rate: ");
            payRate = userIn.nextDouble();

            pay = Assign03Methods.caclulatePay(hours, payRate);
            System.out.printf("Total pay: $%.2f", pay);
            
            System.out.printf("\nEnter the hours worked: ");
            hours = userIn.nextInt();
        }
        System.out.println("Program stopped. Good day.");
    }
}

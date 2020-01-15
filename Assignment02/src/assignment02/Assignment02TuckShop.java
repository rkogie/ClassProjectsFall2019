package assignment02;

import java.util.Scanner;

public class Assignment02TuckShop {

//Script to compute change for items from shop  
    public static void main(String[] args) {
        //Declared variables and initialise to zero for condition checks 
        double cash, change = 0, candy = 0.85, mints = 0.65, gum = 0.75, drink = 1.00;
        int customerselect, remChange, toonies = 0, loonies = 0, quarters = 0, dimes = 0, nickels = 0, pennies = 0;

        //User Interface and prompts input 
        System.out.println("Welcome to the shop, please review the list and select ONE option");
        System.out.println("\n 1  Candy Bar\t$0.85"
                + "\n 2  Mints\t$0.65" + "\n 3  Gum\t        $0.75"
                + "\n 4  Drink\t$1.00"
                + "\n 5  Exit");

        System.out.print("\nSelect your option: Press 1 for Candy bar, Press 2 for Mints, "
                + "\nPress 3 for Gum , Press 4 for Drink: ");
        Scanner userIn = new Scanner(System.in);
        customerselect = userIn.nextInt();
        if (customerselect == 5) {
            System.exit(0);
        } else {
            System.out.print("Please enter your payment amount e.g. $5. $10, $20:  ");
        
        cash = userIn.nextDouble();

        //Condition checks to calculate values based on user selection   
        if (customerselect == 1) {
            change = cash - candy;
            remChange = (int) (change * 100);

            toonies = remChange / 200;
            remChange = remChange % 200;

            loonies = remChange / 100;
            remChange = remChange % 100;

            quarters = remChange / 25;
            remChange = remChange % 25;

            dimes = remChange / 10;
            remChange = remChange % 10;

            nickels = remChange / 5;
            remChange = remChange % 5;

            pennies = remChange;
        }
        if (customerselect == 2) {
            change = cash - mints;
            remChange = (int) (change * 100);

            toonies = remChange / 200;
            remChange = remChange % 200;

            loonies = remChange / 100;
            remChange = remChange % 100;

            quarters = remChange / 25;
            remChange = remChange % 25;

            dimes = remChange / 10;
            remChange = remChange % 10;

            nickels = remChange / 5;
            remChange = remChange % 5;

            pennies = remChange;
        }
        if (customerselect == 3) {
            change = cash - gum;
            remChange = (int) (change * 100);

            toonies = remChange / 200;
            remChange = remChange % 200;

            loonies = remChange / 100;
            remChange = remChange % 100;

            quarters = remChange / 25;
            remChange = remChange % 25;

            dimes = remChange / 10;
            remChange = remChange % 10;

            nickels = remChange / 5;
            remChange = remChange % 5;

            pennies = remChange;
        }
        if (customerselect == 4) {
            change = cash - drink;
            remChange = (int) (change * 100);

            toonies = remChange / 200;
            remChange = remChange % 200;

            loonies = remChange / 100;
            remChange = remChange % 100;

            quarters = remChange / 25;
            remChange = remChange % 25;

            dimes = remChange / 10;
            remChange = remChange % 10;

            nickels = remChange / 5;
            remChange = remChange % 5;

            pennies = remChange;
        }
        
        //Outputs total change from transaction and breakdown
        System.out.println("Your change total: " + change
                + "\nYour change breakdown:"
                + "\n" + toonies + " toonies"
                + "\n" + loonies + " loonies"
                + "\n" + quarters + " quarters"
                + "\n" + dimes + " dimes"
                + "\n" + nickels + " nickels"
                + "\n" + pennies + " pennies");
        }
   }
}//end main


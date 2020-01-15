package assignment03;

import java.util.Scanner;

public class TestJavalandTax {

    //Main method to calculate Taxable Income and Income Tax and Tax Return.
    public static void main(String[] args) {
        
    //Declared variables and prompt user input
        double incomeTax = Assign03Methods.calculateIncomeTax(0);
        Scanner userIn = new Scanner(System.in);
        System.out.println("\nHow much did you pay for last year's installment?");
        double prevTax = userIn.nextDouble();
        double owedTax = incomeTax - prevTax;
    //Condition check to calculate tax owed/tax return values
        if (owedTax < 0) {
            System.out.printf("You have a return of: $%.2f\n", Math.abs((double) Math.round((owedTax) * 100d) / 100d));
        } else {
            System.out.printf("You still owe: $%.2f\n",(double) Math.round((owedTax) * 100d) / 100d);
        }
        
    }
}

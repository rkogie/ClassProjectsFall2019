package lab03;

import java.util.Scanner;

public class PizzaMethods {

    //Methods to calculate area of circular pizza, rectangular pizza and compare cost per square inch
    private static double areaOfCircle() {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter the circular pizza diameter in inches: ");
        double diam = userIn.nextDouble();
        return Math.PI * (diam / 2) * (diam / 2);
    }

    private static double areaRect() {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter the rectangular pizza length in inches: ");
        double length = userIn.nextDouble();
        System.out.print("Enter the rectangular pizza width in inches: ");
        double width = userIn.nextDouble();
        return length * width;
    }

    static void comparePizzas() {
        double x = areaOfCircle();
        double y = areaRect();
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter your cost for the circular pizza: ");
        double priceCircle = userIn.nextDouble();
        System.out.println("Enter your cost for the rectangular pizza: ");
        double priceRect = userIn.nextDouble();
        double circlePerInch = priceCircle / x;
        double rectPerInch = priceRect / y;

        System.out.printf("\nCircular pizza: cents per inch: %.2f", circlePerInch);
        System.out.printf("\nRectangular pizza: cents per inch: %.2f", rectPerInch);

        if (circlePerInch < rectPerInch) {
            System.out.println("\nBuying a circular pizza is better value");
        } else if (circlePerInch > rectPerInch) {
            System.out.println("\nBuying a rectangular pizza is better value");
        } else {
            System.out.println("\nBoth pizzas have the same value for money");
        }
        //End of methods
    }
}

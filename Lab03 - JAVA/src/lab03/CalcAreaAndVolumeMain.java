package lab03;

import java.util.Scanner;

public class CalcAreaAndVolumeMain {

    //Script to find areas & volumes of circular shapes
    public static void main(String[] args) {

        //Main method executes console interface and prompts user to make selection
        System.out.println("Welcome, Select what you are calcuating from the options below:"
                + "\n1\tRadius from Circle\n2\tVolume of Cylinder\n3\tVolume of Cone\n4\tAll Calculations");
        System.out.print("\nPress 1, 2, 3, 4 or any number to quit: ");

        //Declared variables and created new Scanner object
        int selection;
        Scanner userIn = new Scanner(System.in);
        selection = userIn.nextInt();

        //Switch case method to run option that was selected
        switch (selection) {
            case 1:
                System.out.printf("\nThe circle's radius is: %.2f %s",
                        findRadiusOfCircle(0), "cm\n");
                break;
            case 2:
                System.out.printf("\nThe cylinder's volume is: %.2f %s",
                        findVolumeOfCylinder(0), "sqcm\n");
                break;
            case 3:
                System.out.printf("\nThe cone's volume is: %.2f %s",
                        findVolumeOfCone(0), "sqcm\n");
                break;
            case 4:
                findAllMeasurements();

                break;
            default:
                System.out.println("\nNo selection made.");
        }

    }

    //Methods for calculating shapes and prompting input from the user
    public static double findRadiusOfCircle(double radius) {

        System.out.print("\n1. Enter the circumference of your circle in cm: ");
        Scanner userIn = new Scanner(System.in);
        double circumference = userIn.nextDouble();
        radius = circumference / (2 * Math.PI);
        return radius;
    }

    public static double findVolumeOfCylinder(double volCylinder) {

        Scanner userIn = new Scanner(System.in);
        System.out.print("\n2. Enter the cylinder's radius in cm: ");
        double radius = userIn.nextDouble();
        System.out.print("Enter the cylinder's height in cm: ");
        double height = userIn.nextDouble();
        volCylinder = (radius * radius) * height * Math.PI;
        return volCylinder;
        
    }

    public static double findVolumeOfCone(double volCone) {

        Scanner userIn = new Scanner(System.in);
        System.out.print("\n3. Enter the cone's radius in cm: ");
        double radius = userIn.nextDouble();
        System.out.print("Enter the cone's height in cm: ");
        double height = userIn.nextDouble();
        volCone = (radius * radius) * Math.PI * (height / 3);
        return volCone;
    }

    static void findAllMeasurements() {

        System.out.printf("\nThe circle's radius is: %.2f %s",
                findRadiusOfCircle(0), "cm\n");
        System.out.printf("\nThe cylinder's volume is: %.2f %s",
                findVolumeOfCylinder(0), "sqcm\n");
        System.out.printf("\nThe cone's volume is: %.2f %s",
                findVolumeOfCone(0), "sqcm\n");
        //End of methods
    }
}

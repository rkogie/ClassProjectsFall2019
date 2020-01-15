package lab03;

import java.util.Scanner;

//Script to find volume of hopper-bottom grain bin
public class HopperBinMain {

    //Main method to call method and output conversion factors
    public static void main(String[] args) {
        //Declare varibales
        double cFeet = findCubicFeet(0);
        //Output statements
        System.out.printf("\nThe cubic ft of your bin is: %.2f %s", cFeet, " cubic feet");
        System.out.printf("\nBin volume in Bushels: %.2f %s", (cFeet * 0.803564), " US bushels\n");
    }

    //Method to find cubic feet of hopper bin
    public static double findCubicFeet(double cFeet) {

        Scanner userIn = new Scanner(System.in);
        System.out.print("Welcome.\nPlease enter the bin circumference in ft: ");
        double binCircum = userIn.nextDouble();
        System.out.print("\nPlease enter the bin height in ft: ");
        double binHeight = userIn.nextDouble();
        System.out.print("\nPlease enter the cone height in ft: ");
        double coneHeight = userIn.nextDouble();
        double radius = (binCircum * 12) / (2 * Math.PI);
        double volCylinder = (radius * radius) * (binHeight * 12) * Math.PI;
        double volCone = (radius * radius) * Math.PI * ((coneHeight * 12) / 3);
        return cFeet = (((volCone * 2) + volCylinder) / 1728);
        //End of method
    }

}

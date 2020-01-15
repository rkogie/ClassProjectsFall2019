package assignment02;

import java.util.Scanner;

public class Assignment02FuelTrackerPartTwo {

    //Script to calculate mileage per trip and total mileage for combined trips
    public static void main(String[] args) {

        //Declared variables and initialise scanner to prompt user input
        double distance, litres, totMileagePerTank, totDistance = 0, totLitres = 0, totMileage;
        int numTanks;

        Scanner userIn = new Scanner(System.in);
        System.out.print("Welcome to the fuel tracker.\nEnter the number of fuel tanks: ");
        numTanks = userIn.nextInt();
        System.out.println("\nThis will track mileage for your " + numTanks + " tanks of fuel");

        //Loop construct to prompt inputs
        for (int i = 0; i < numTanks; i++) {
            System.out.print("\nPlease enter your distance travelled (in km): ");
            distance = userIn.nextDouble();

            System.out.print("Enter the fuel amount per tank consumed (in litres): ");
            litres = userIn.nextDouble();

            totDistance += distance;
            totLitres += litres;

            //Calculation to output mileage per tank
            totMileagePerTank = (litres / distance) * 100;
            System.out.println("\t\tMileage: "
                    + (double) Math.round((totMileagePerTank) * 100d) / 100d + " ltrs/100km");
        }

        //Calculation to output total mileage for all tanks
        totMileage = (totLitres / totDistance) * 100;
        System.out.println("\nYour mileage for the " + numTanks + " tanks is: "
                + (double) Math.round((totMileage) * 100d) / 100d + " ltrs/100km\nYour total mileage is: " 
                + totDistance);
    }
}

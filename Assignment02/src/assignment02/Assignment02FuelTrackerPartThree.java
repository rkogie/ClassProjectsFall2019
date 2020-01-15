package assignment02;

import java.util.Scanner;

public class Assignment02FuelTrackerPartThree {

    //Script to calculate mileage per trip and total mileage for combined trips
    public static void main(String[] args) {

        //Declared variables and initialise scanner to prompt user input
        double distance, litres, totMileagePerTank, totDistance=0, totLitres =0, totMileage=0;
        Scanner userIn = new Scanner(System.in);
        System.out.print("Welcome to the fuel tracker."
                + "\nThis will track mileage for your tanks of fuel");

        System.out.print("\n\nPlease enter your distance travelled (in km) or 0 to quit: ");
        distance = userIn.nextDouble();

        //Sentinel Loop construct to prompt inputs and terminate if value searched for entered
        while (distance != 0) {
            System.out.print("Enter the fuel amount per tank consumed (in litres): ");
            litres = userIn.nextDouble();
            totDistance += distance;
            totLitres += litres;

            //Calculation to output mileage per tank and combined for all tanks
            totMileagePerTank = (litres / distance) * 100;
            System.out.println("\t\tMileage: "
                    + (double) Math.round((totMileagePerTank) * 100d) / 100d + " ltrs/100km");

            totMileage = (totLitres / totDistance) * 100;
            System.out.println("\nYour mileage for the entered trips is: "
                    + (double) Math.round((totMileage) * 100d) / 100d + " ltrs/100km\nYour total mileage is: " 
                + totDistance);

            System.out.print("\nPlease enter your distance travelled (in km) or 0 to quit: ");
            distance = userIn.nextDouble();
        }
        //Output statement to indicate program end
        System.out.println("\nProgram terminated");
    }
}

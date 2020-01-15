package lab02;

public class Lab02KiloToPounds {

    //Script to print kg to lbs conversion 200 times with odd values for kg each increment
    public static void main(String[] args) {

        //declare variables
        int kilo;
        double pounds;

        //Print statement for output format
        System.out.println("Kilograms \tPounds");

        // Loop to intialise variable "i", check condition if true and increment number + 2
        for (kilo = 1, pounds = 2.2; kilo < 200; kilo += 2) {
            //Print statement with output values in matching format
            System.out.println(kilo + "\t\t" + (double) Math.round((kilo * pounds) * 100d) / 100d);

        }

    }

}

package assignmentarrays;

public class StockPriceTest {

    public static void main(String[] args) {
        //Declared variable array and initialized
        double[] closePrice = new double[]{25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};

        //Print array elements
        System.out.println("Stock Closing Prices: ");
        for (int list = 0; list < closePrice.length; list++) {
            System.out.print(closePrice[list] + "  ");
        }
        //Finding highest value
        double highest = closePrice[0];
        for (int i = 0; i < closePrice.length; i++) {
            if (highest < closePrice[i]) {
                highest = closePrice[i];
            }
        }
        System.out.printf("\n\nHighest closing price is: $%.2f", highest);

        //Finding lowest value
        double lowest = closePrice[0];
        for (int i = 0; i < closePrice.length; i++) {
            if (lowest > closePrice[i]) {
                lowest = closePrice[i];
            }
        }
        System.out.printf("\n\nLowest closing price is: $%.2f", lowest);
        double sum = 0;
        for (int i = 0; i < closePrice.length; i++) {
            sum += closePrice[i];
        }
        //Finding Average
        double avg = (double) sum / closePrice.length;
        System.out.printf("\n\nAverage: $%.2f", (double) Math.round((avg) * 100d) / 100d);
        
        //Counter to count number of times array values fall below condition value
        int count = 0;
        for (int i = 0; i < closePrice.length; i++) {
            if (closePrice[i] < avg) {
                count++;
            }
        }
        System.out.println("\nNumber of days with prices below average: " + count);

        //Display total
        System.out.printf("\nCost at closing price for two week period: $%.2f",sum);
        
        //Create new array and populate with calculated values and output
        double[] priceSummary = new double[]{highest,lowest,(double) Math.round((avg) * 100d) / 100d};
        System.out.println("\nHighest | Lowest | Average");
        for (int i =0; i < priceSummary.length; i++){
            System.out.print(priceSummary[i] + "      ");
        }
        //Method call to reverse array
        Assignment04Methods.reverseSort(closePrice);
    }
}

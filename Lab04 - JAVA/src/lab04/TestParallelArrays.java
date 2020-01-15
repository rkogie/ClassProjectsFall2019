package lab04;

public class TestParallelArrays {

    public static void main(String[] args) {

        String[] product = new String[]{"CD", "DVD", "tape", "LP33", "USB", "floppy"};
        double[] price = new double[]{0.25, 1.89, 8.5, 138.75, 57.33, 1.22};
        int[] quantity = new int[6];
        double total[] = new double[6];
        System.out.printf("%s%8s%12s%6s\n", "Product", "Prices", "Quantity", "Total");

        for (int i = 0; i < product.length; i++) {
            quantity[i] = Lab04Methods.num1To100();
            total[i] += price[i] * quantity[i];

            System.out.format("%-9s$%-9.2f%-9d$%.2f\n", product[i], price[i], quantity[i], total[i]);
        }
        System.out.println("Press any key to continue...");

    }

}

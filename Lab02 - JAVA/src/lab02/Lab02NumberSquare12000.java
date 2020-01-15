package lab02;

public class Lab02NumberSquare12000 {

    //Script to find smallest number whose square is greater than 12000
    public static void main(String[] args) {

        //Declared variables
        int square = 0, sqValue = 0;

        //Do function to find smallest number that its squared value is greater thn 12000 
        //Loop stops when it hits the value
        do {
            square++;
            sqValue = square * square;
            System.out.println(square + " x " + square + " = " + sqValue);
        } while (sqValue <= 12000);

        //Output smallest number to user
        System.out.println("\nSmallest number is: " + square);

    }
}

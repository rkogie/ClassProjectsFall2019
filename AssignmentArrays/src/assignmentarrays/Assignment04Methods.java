package assignmentarrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment04Methods {

    //Method that converts Fahrenheit to Celsius and vice versa
    public static double findCelsius() {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit: ");
        double fahrenheit = userIn.nextDouble();
        return ((fahrenheit - 32) * 5) / 9;
    }

    public static double findFahrenheit() {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter the Celsius: ");
        double celsius = userIn.nextDouble();
        return (celsius * 9) / 5 + 32;
        //End of method
    }

    //Method that reverses number input by user
    public static void reverseNum() {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int numToReverse = userIn.nextInt();
        String reversed = String.valueOf(numToReverse);

        StringBuilder input1 = new StringBuilder();
        input1.append(reversed);
        input1 = input1.reverse();

        System.out.println("Your number: " + reversed);
        System.out.println("Your number reversed: " + input1);
    }

    //Method that simulates coin flip from 1 and 0
    public static int flipCoin() {
        return (int) (Math.random() * 2);
        //End of method

    }

    //Methods that generates number between 1-1000 accepts userInput and calls method above
    public static int num1To1000() {
        Random randomNum = new Random();
        return randomNum.nextInt(1000) + 1;
        //End of method
    }

    public static int validInput() {
        int guess = 0, x = (num1To1000());
        while (guess != x) {
            System.out.print("\nWhats the number?: ");
            Scanner userIn = new Scanner(System.in);
            guess = userIn.nextInt();

            if (guess < x) {
                System.out.println("\nToo low, Guess again. ");
            } else if (guess > x) {
                System.out.println("\nToo high, Guess again. ");
            } else {
                System.out.println("Congratulations, you guessed the number"
                        + "\nThe number is: " + x);
                System.out.println("\nHit Any num to play again"
                        + "\nPress -1 to Quit");
            }
        }
        guess = 0;
        return guess;
        //End of method
    }

    //Method to calculate Taxable Income and Income Tax from taxable(COMPOUNDED)
    public static double calculateTaxableIncome(double generalIncome, double investIncome,
            double otherIncome, double regDeductions, double otherDeductions) {

        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter your General Income: ");
        generalIncome = userIn.nextDouble();
        System.out.println("Enter your Investment Income: ");
        investIncome = userIn.nextDouble();
        System.out.println("Enter your Other Income: ");
        otherIncome = userIn.nextDouble();
        System.out.println("Enter your Regular Deductions: ");
        regDeductions = userIn.nextDouble();
        System.out.println("Enter your Other Deductions: ");
        otherDeductions = userIn.nextDouble();

        return (generalIncome + investIncome + otherIncome) - (regDeductions + (otherDeductions / 2));
    }

    public static double calculateIncomeTax(double taxable) {

        double taxableInc = calculateTaxableIncome(0, 0, 0, 0, 0);
        System.out.printf("\nYour Taxable Income is: $%.2f", (double) Math.round((taxableInc) * 100d) / 100d);
        double totTax = 0, taxBrack;

        if (taxableInc > 60000) {
            taxBrack = taxableInc - 60000;
            totTax = (taxBrack * 0.2) + 7400;
            System.out.printf("\nYour Income Tax is: $%.2f", (double) Math.round((totTax) * 100d) / 100d);

        } else if (taxableInc > 40000 && taxableInc <= 60000) {
            taxBrack = taxableInc - 40000;
            totTax = (taxBrack * 0.15) + 4400;
            System.out.printf("\nYour Income Tax is: $%.2f", (double) Math.round((totTax) * 100d) / 100d);

        } else if (taxableInc > 20000 && taxableInc <= 40000) {
            taxBrack = taxableInc - 20000;
            totTax += (taxBrack * 0.12) + 2000;
            System.out.printf("\nYour Income Tax is: $%.2f", (double) Math.round((totTax) * 100d) / 100d);

        } else if (taxable < 20000) {
            totTax = (taxableInc * 0.1);
            System.out.printf("\nYour Income Tax is: $%.2f", (double) Math.round((totTax) * 100d) / 100d);
        }
        return (double) Math.round((totTax) * 100d) / 100d;
    }

    //Method to find volume of container
    public static double findCubicMeters(double length, double width, double depth) {

        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter package length in m: ");
        length = userIn.nextDouble();
        System.out.print("Enter package width in m: ");
        width = userIn.nextDouble();
        System.out.print("Enter package depth in m: ");
        depth = userIn.nextDouble();

        return (length * width * depth) / 100000;
    }

    //Method to calculate COMPOUNDED shipping costs for inputted values 
    public static double findShipping(double volume, double weight, double distance) {

        //Paste line 141 into Main method to test
        //System.out.println("Shipping cost is: $" + Assign03Methods.findShipping(0,0,0));
        double costShipping = 0;

        Scanner userIn = new Scanner(System.in);
        System.out.print("Welcome to the Shipping Calculator:\n");
        volume = findCubicMeters(0, 0, 0);
        System.out.print("Enter the weight in kg: ");
        weight = userIn.nextDouble();
        System.out.print("Enter distance travelled in km: ");
        distance = userIn.nextDouble();

        if (distance > 1500) {
            double bracketDist = distance - 1500;
            costShipping = (weight * 2.5) + (volume * 25.5) + (1000 * 0.05) + (bracketDist * 0.03);
        } else if (distance > 500 && distance <= 1500) {
            costShipping = (weight * 2.5) + (volume * 25.5) + (distance * 0.05);
        } else if (distance <= 500) {
            costShipping = (weight * 2.5) + (volume * 25.5);
        }

        return (double) Math.round((costShipping) * 100d) / 100d;

    }

    //Method to convert number value into string and print using String.format (needs altering)
    public static void percentAsString() {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter your two numbers: ");
        int num1 = userIn.nextInt(), num2 = userIn.nextInt();
        //Type cast to convert int to double datatype
        double result = (double) num1 / num2 * 100;
        System.out.printf("%.1f%s", (Math.round((result) * 10) / 10.0), "%\n");
        //return String.format("%.1f %s ",(Math.round((num1/num2)*100* 10) / 10.0) , "%" );
    }

    //Method to find the sum between min and max values(adds values up as they increment by 1)
    public static int sumBetweenNums() {

        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = userIn.nextInt();

        int min = 1, max = num, sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    //Method to find the sum between min and max EVEN values(adds values up as they increment by 1)
    public static int sumEvenNums() {

        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = userIn.nextInt();

        int min = 1, max = num, sum = 0;
        for (int i = min; i <= max; i++) {

            if (i % 2 == 0) {
                sum += i;
            } else if (i % 2 != 0) {
                sum += i - i;
            }
        }
        return sum;
    }

    //Method that prints a rectangular pattern using nested for loop
    public static void recPattern() {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter your numbers: ");
        int num1 = userIn.nextInt(), num2 = userIn.nextInt();
        //Columns 
        for (int i = 1; i <= num1; i++) {
            //Rows
            for (int j = 2; j <= num2; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }

    //Method that allows valid positive values. Negative values display error message
    public static void positiveInput() {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double number = userIn.nextDouble();

        while (number < 0) {
            System.out.println("Negative value entered. Please enter valid input: ");
            number = userIn.nextInt();
        }
        System.out.print("Your number is: " + number + "\n");

    }

    //Modified rectangular pattern method that accepts valid input (positive numbers only)
    public static void recPatternModified() {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter your numbers: ");
        int num1 = userIn.nextInt(), num2 = userIn.nextInt();
        while (num1 < 0 || num2 < 0) {
            System.out.println("Negative value entered. Please enter valid input: ");
            num1 = userIn.nextInt();
            num2 = userIn.nextInt();
        }
        //Columns
        for (int i = 1; i <= num1; i++) {
            //Rows
            for (int j = 2; j <= num2; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    //Method to sum test scores of number of scores to enter and print total percentage
    public static void numOfTests() {

        double score, marks, sumOfScores = 0, sumOfMarks = 0, scorePercent;

        Scanner userIn = new Scanner(System.in);
        System.out.print("How many tests: ");
        int testNum = userIn.nextInt();

        while (testNum < 0) {
            System.out.print("Please enter a non-negative number.\nEnter a number: ");
            testNum = userIn.nextInt();
        }
        for (int count = 1; count <= testNum; count++) {
            System.out.print("Score: ");
            score = userIn.nextDouble();
            while (score < 0) {
                System.out.print("Negative value entered. Please enter valid input: ");
                score = userIn.nextInt();
            }
            sumOfScores += score;
            System.out.print("Out of: ");
            marks = userIn.nextDouble();
            while (marks < 0) {
                System.out.println("Negative value entered. Please enter valid input: ");
                marks = userIn.nextInt();
            }
            sumOfMarks += marks;
        }

        scorePercent = (sumOfScores / sumOfMarks) * 100;
        System.out.printf("Percentile: %.1f%s", (Math.round((scorePercent) * 10) / 10.0), "%\n");
    }

    //Method for calculating pay based on hourly rate and accrued overtime
    public static double caclulatePay(int hours, double payRate) {

        double pay;
        if (hours > 40) {
            double overtime = hours - 40;
            pay = (40 * payRate) + (overtime * (payRate * 1.5));
        } else {
            pay = hours * payRate;
        }
        return (double) Math.round((pay) * 100d) / 100d;
    }

    //Method to generate numbers from 0-100
    public static int num1To100() {
        Random randomNum = new Random();
        return randomNum.nextInt(100) + 1;
        //End of method
    }

    //Method to find average in an array
    public static void computeAverageArray(int numbers[]) {

        int sum = 0;
        double average = 0;
        int[] numArray = new int[20];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Assignment04Methods.num1To100();
            sum += numArray[i];
            average = (double) sum / 20;
        }
        System.out.println("Sum: " + sum + "\nAverage: " + average);
        System.out.println("Numbers greater than average: ");
        for (int j = 0; j < numArray.length; j++) {
            if (numArray[j] > average) {
                System.out.print(numArray[j] + " ");
            }
        }
    }

    //Method to find counts below average(change line 337 to > for largest)
    public static int elementsBelowAverage(double[] array) {
        array = new double[0];
        double avg = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
                count++;
            }
        }
        return count;
    }

    //Method to reverse Array
    public static void reverseArray() {
        int[] array = new int[10];
        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Assignment04Methods.num1To100();
            System.out.print(array[i] + " ");
        }
        int temp, start = 0, end = array.length - 1;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println("\nReversed: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }

    //Method overloading(Average method between line 314-331)
    public static void computeAverageArray(double numbers[]) {

        double sum = 0, average = 0;
        double[] numArray = new double[20];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Assignment04Methods.num1To100();
            sum += numArray[i];
            average = (double) sum / 20;
        }
        System.out.println("Sum: " + sum + "\nAverage: " + average);
        System.out.println("Numbers greater than average: ");
        for (int j = 0; j < numArray.length; j++) {
            if (numArray[j] > average) {
                System.out.print(numArray[j] + " ");
            }
        }
    }

    //Method to find smallest value in array(change line 391 to < for largest)
    public static int getMinValue(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = Assignment04Methods.num1To100();
            System.out.print(array[i] + " ");
        }
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    //Method to find position of smallest element (change line 408 to < for max element)
    public static int getMinIndex(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = Assignment04Methods.num1To100();
            System.out.print(array[i] + " ");
        }
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    //Method to sort array in ascending order then reverse
    public static void reverseSort(double[] array) {

        Arrays.sort(array);
        System.out.println("\n\nAscending: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

        int start = 0, end = array.length - 1;
        while (start < end) {
            double temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println("\n\nDescending: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "  ");
        }

    }

    //Method to get grades and calculate
    public static double[] getFinalGrades(int[] mid, int[] fin, int[] assign) {

        double[] totalGrade = new double[fin.length];
        for (int i = 0; i < totalGrade.length; i++) {
            totalGrade[i] = (mid[i] * 0.4) + (fin[i] * 0.45) + (assign[i] * 0.15);
        }
        return totalGrade;
    }
    //Method to find frequency above a certain value
    public static int findFrequency(double[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                count++;
            }
        }
        return count;
    }
}

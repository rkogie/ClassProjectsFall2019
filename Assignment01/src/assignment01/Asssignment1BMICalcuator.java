package assignment01;
import java.util.Scanner;
public class Asssignment1BMICalcuator {

    //Script to calculate BMI of user from a set of inputs
    public static void main(String[] args) {
        
        //Declared variables and prompt user to input values in appropriate units (pounds and inches)
        double weight, height, BMI;
        Scanner userIn = new Scanner(System.in);
        System.out.println("Welcome to the BMI Calculator. \nPlease enter your weight in pounds(lbs):");
        weight = userIn.nextDouble();
        System.out.println("\nPlease enter your height in inches(inch):");
        height = userIn.nextDouble();
        
        //calculation to perform from user inputs
        BMI = (weight * 703)/(height * height);
        
        //Condition statements to specify which category the calculated value falls under
        System.out.println("Your BMI is: " + BMI );
        if (BMI <= 18.5)
        {
            System.out.println("Your BMI is: Underweight");
        }
        else if (BMI > 18.5 && BMI <= 24.9)
        {
            System.out.println("Your BMI is: Normal");
        }
        else if (BMI > 25 && BMI <= 29.9)
        {
            System.out.println("Your BMI is: Overweight");
        }
        else if (BMI > 30 )
        {
            System.out.println("Your BMI is: Obese");
        }
        
        //Output chart for user to compare result for evaluation
        System.out.println("\nBMI VALUES "
                + "\nUnderweight: \tless than 18.5"
                + "\nNormal: \tbetween 18.5 and 24.9"
                + "\nOverweight: \tbetween 25 and 29.9"
                + "\nObese: \t\t30 or greater");
    }
    
}

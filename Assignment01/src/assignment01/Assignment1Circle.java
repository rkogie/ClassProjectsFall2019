package assignment01;
import java.util.Scanner;
public class Assignment1Circle {

    //Script that asks user to input a radius length of a circle
    public static void main(String[] args) {
      
        //Declared variables
        int rad;
        double diameter, circum, area;
        
        //Prompts user to enter radius
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter the radius of your circle: ");
        rad = userIn.nextInt();
        
        //Calculations to find values required
        diameter = 2 * rad;
        circum = Math.PI * diameter;
        area = Math.PI * rad * rad;
        
        //Output to user with calculations displayed
        System.out.println("Your circle's radius is: " + rad + 
                "\nYour diameter is: " + diameter + 
                "\nYour circumference is: " + circum + 
                "\nYour area is: " + area);
     
    }
    
}

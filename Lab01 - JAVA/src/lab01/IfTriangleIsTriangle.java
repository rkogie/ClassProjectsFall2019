package lab01;
import java.util.Scanner;
public class IfTriangleIsTriangle {

    //Script to calcuate if inputs follow triangle inequality principle
    public static void main(String[] args) {
        
        //Declared variables and prompts user input 
        double a,b,c,perimeter;
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter your three sides:");
        a = userIn.nextDouble();
        b = userIn.nextDouble();
        c = userIn.nextDouble();
        
        //Calculation performed if all requirements are met
        perimeter = a + b + c;
        
        //Conditions to check if sum of two sides is greater than value of third side
        if ((a + b > c) && (a + c > b) && (b + c > a) ){ 
             System.out.println("This triangle is valid. \nPerimeter: " + perimeter);
         }
         
        else 
        {
             System.out.println ("This triangle is not valid. Try again.");          
        }
                         
       
    }
    
}

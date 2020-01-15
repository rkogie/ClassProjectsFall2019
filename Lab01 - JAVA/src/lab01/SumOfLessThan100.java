package lab01;

import java.util.Scanner;
public class SumOfLessThan100 {

    //Script to generate two random numbers and find the sum
    public static void main(String[] args) {
    
        //code to generate the numbers using Math.random method
        int num1 = (int)(Math.random()*100);
        int num2 = (int)(Math.random()*100);
        
        //Displays results to user
        System.out.println("Here are your numbers:" + num1 + " " + num2);
        
        //Displays message to user and instructs to follow prompts
        System.out.println("Find the sum of the generated numbers");
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = userIn.nextInt();
        System.out.println("Enter your second number: ");
        int b = userIn.nextInt();
        
        // calculation perform for the sum of both numbers
        int sum = a + b;
        //Message displayed with result
        System.out.println("Your total is: "+ sum + "\nThank you. ");

    }
}
        
        

        
       
   
    
   



  
       
    
    


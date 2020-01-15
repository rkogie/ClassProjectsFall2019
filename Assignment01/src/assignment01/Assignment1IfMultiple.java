package assignment01;
import java.util.Scanner;
public class Assignment1IfMultiple {

    public static void main(String[] args) {
       
        //declare variables and accept input from user
        int x,y,result;
        
        System.out.println("Please enter your numbers: ");
        Scanner userIn = new Scanner(System.in);
        x = userIn.nextInt();
        y = userIn.nextInt();
        
        //calculations performed to find remainder
        result = y/x;
      
        //statements to check if conditions fulfilled and print result 
        if (y % x == 0)
        {
            System.out.println(x + " is a multiple of " + y + "\nThe result is: " + result);
        }   
        else if ( x == 0 || y == 0) 
        {
            System.out.println("You can't multiply by 0. Try again");
        }
        else
        {
            System.out.println(x + " is not a multiple of " + y);
        }
    }
}
    


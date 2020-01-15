package lab01;
import java.util.Scanner;
public class IfEvenLab01 {

   //Script to run to find if code is even or odd
    public static void main(String[] args) {
      
        //Declared variables and prompt user to enter number
        int x;
        System.out.println("Please enter your number to check if even || odd.");
        Scanner userIn = new Scanner(System.in);
        x = userIn.nextInt();
        
        //Condition check to see if the number is divisible by 2 and returns 0
        if( x % 2 == 0 )
        {
            System.out.println("This number is even.");
        }
        else
        {   
            System.out.println("This number is odd.");
        }
        
    }
    
}


package assignment01;
import java.util.Scanner;
public class Assignment1IfEven {

    //Script that checks if number input by user is odd or even
    public static void main(String[] args) {
        
        //declare variables and accept input from user
        int x;
        System.out.println("Please enter your number to check if even or odd.");
        Scanner userIn = new Scanner(System.in);
        x = userIn.nextInt();
        
        //statement to check if conditions fulfilled 
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
    

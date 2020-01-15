package assignment01;
import java.util.Scanner;
public class Assignment1FiveDigits {

  //Script to accept user input of 5 digit sum and prints individual digits separated by three spaces
    public static void main(String[] args) {
       
        //Declared variables and prompts user for input
        int num;
        
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter your 5 digit number: ");
        num = userIn.nextInt();
        
        
        //Create variable for each digit and assign to a character within an array
        for( char singDig : String.valueOf(num).toCharArray()) 
        {
            
        System.out.print(singDig + "   ");
        
        }
   
    }
}
    


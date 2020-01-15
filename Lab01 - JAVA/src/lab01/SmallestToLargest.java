package lab01;
import java.util.Scanner;
public class SmallestToLargest {
    
    //Script to find smallest to largest from three integers entered by user
    public static void main(String[] args) {
     
    //Declare variables and prompt user to enter from keyboard 
    int num1, num2, num3;
    Scanner userIn = new Scanner(System.in);
   
    System.out.print("Please enter three integers: ");
    num1 = userIn.nextInt();
    num2 = userIn.nextInt();
    num3 = userIn.nextInt();

    //smallest number condition statement storing input number in variable temp
    if (num1 > num2) {
 
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
    //middle number condition statement storing input number in variable temp
    if (num2 > num3) {
      int temp = num2;
      num2 = num3;
      num3 = temp;
    }
    //largest number condition statement storing input number in variable temp
    if (num1 > num2) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
    //Output message to user & sorted in ascending order
    System.out.println("Numbers from smallest to largest: " + num1 + " " + num2 + " " + num3);
      
       
        }
    }

      
    
  
    
    



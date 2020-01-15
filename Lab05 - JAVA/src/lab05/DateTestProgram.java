package lab05;

import java.util.Scanner;
public class DateTestProgram {
    
    public static void main(String[] args) {
        
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter your month, day and year. Hit enter for each value entered: ");
        Date myDate = new Date(userIn.nextInt(), userIn.nextInt(), userIn.nextInt()); 
        myDate.displayDate();
 
    }
}

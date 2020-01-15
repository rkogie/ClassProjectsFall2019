package assignment03;
import java.util.Scanner;
public class TempConverterMain {
    
    //Main method to convert temperatures
    public static void main(String[] args) {

        //User interface to prompt input
        System.out.println("Welcome to the temperature converter:" +
                "\nWhat are you converting?" +
                "\n1 Fahrenheit to Celsius " +
                "\n2 Celsius to Fahrenheit " +
                "\nAny Number to Exit ");
        Scanner userIn = new Scanner(System.in);
        int choice = userIn.nextInt();

        //Switch method to run which choice user gives, code executed calls method from TempConverter Class
           switch (choice) {
               case 1 :
                   System.out.printf("Celsius: %.2f ",Assign03Methods.findCelsius());
                   break;
               case 2 :
                   System.out.printf("Fahrenheit: %.2f ",Assign03Methods.findFahrenheit());
                   break;
               default:
                   System.out.println("Program closed");
           }
    }
}



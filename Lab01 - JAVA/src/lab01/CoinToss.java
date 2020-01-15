
package lab01;
import java.util.Scanner;
public class CoinToss {

    //script that prompts user to guess heads or tails then displays result reporting if correct or incorrect
    public static void main(String[] args) {
       
        
        //declared variable to store user input
        int guess;
        
        //Message prompts user to enter their guess
        Scanner userIn = new Scanner(System.in);
        System.out.println("Guess which way the coin lands: \n Enter 1 for Heads \n Enter 0 for Tails");
        guess = userIn.nextInt();
        
        //code that generates the toin coss
        int tossResult = (int)(Math.random()*2);
       
        //statement that checks if conditions are met and message that displays the coin toss result
        System.out.println("Coin says: " + tossResult );
        System.out.println((guess == tossResult)? "Correct " : "Oops, you are incorrect");
        
        
        
    }
    
}

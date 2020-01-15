package lab01;
public class RandomLetterGenerator {

    //script to generate an integer that corresponds and casts to the appropriate char
    public static void main(String[] args) {
       
        //declared variable that generates number between 65 (A) and 90 (Z)
        int rand = 65 + (int)(Math.random() * ((90 - 65) + 1));
        
        /*
        code that stores random number into new variable then finds corresponding char value according to 
        ASCII table and prints both the char value (A-Z) and the number
        */
        int a = rand;
        char b =(char)a;
        System.out.println(b + "\n" + rand);  
        
    }
    
}

package assignment505;

import java.util.Scanner;

public class TestChangeMachine {

    //Main method
    public static void main(String[] args) {

        //Variable declaration, scanner input, instance of ChangeMachine class created and machine condition check
        Scanner userIn = new Scanner(System.in);
        ChangeMachine test = new ChangeMachine(0, 0);
        test.checkStatus();

        int cash, extraTwo, extraLoon, accessInput;

        //User Interface with sentinel while loop to terminate when prompted
        System.out.println("Welcome to Change Machine. Press any num to continue or -1 to exit");
        accessInput = userIn.nextInt();

        while (accessInput != -1) {
            if (test.getStatus() == true) {
                System.out.println("Insert cash: $5, $10 or $20: ");
                cash = userIn.nextInt();
                test.acceptMoney(cash);

                System.out.println("Machine Balance: \n=============\n$1 Coins Remaining: "+test.getLoonies() 
                        + "\t\t$2 Coins Remaining: " + test.getToonies());

                test.checkStatus();

            } else if (test.getStatus() == false) {
                System.out.println("Out of Order! Cannot accept any more bills. Please call the technician to refill the machine.");
                //Condition check for valid pin input
                if (isCorrectPinNumber() == true) {
                    do {
                        System.out.println("PIN accepted. Update Change machine: ");
                        System.out.print("Insert $1 coins: ");
                        extraLoon = userIn.nextInt();
                        //check for positive input
                        while (extraLoon < 0) {

                            System.out.print("You cannot enter a negative number of coins!");
                            System.out.print("\nInsert $1 Coins: ");
                            extraLoon = userIn.nextInt();
                        }
                        test.setLoonies(extraLoon + test.getLoonies());
                        test.checkStatus();

                        System.out.print("\nInsert $2 coins: ");
                        extraTwo = userIn.nextInt();
                        //check for positive input
                        while (extraTwo < 0) {

                            System.out.print("You cannot enter a negative number of coins!");
                            System.out.print("\nInsert $2 Coins: ");
                            extraTwo = userIn.nextInt();
                        }
                        test.setToonies(extraTwo + test.getToonies());
                        test.checkStatus();

                        System.out.println("\nUpdated Balance:\n=============\n$1 coins: " + test.getLoonies() + " available"
                                + "\t2$ coins: " + test.getToonies() + " available");
                    } while (test.getStatus() == false);
                }
            }
            test.checkStatus();
            System.out.println("\nPress any num to continue or -1 to quit");
            accessInput = userIn.nextInt();
        }

    }

    //Pin verification method (called within main body if insufficient funds reached
    public static boolean isCorrectPinNumber() {

        int pin = 333, code = 0;

        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter PIN to access Coin Machine replenishment tray: ");
        while (code != pin) {
            System.out.print("\nPIN: ");
            code = userIn.nextInt();
            if (code != pin) {
                System.out.print("Incorrect PIN, Please Try Again!");
            }
        }
        return true;
    }
}

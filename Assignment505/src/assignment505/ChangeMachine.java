package assignment505;

public class ChangeMachine {

    //Declared private variables
    int toonies;
    int loonies;
    boolean status, confirm;

    //Constructor that accesses private variables int public via main method
    public ChangeMachine(int toon, int loon) {
        this.loonies = loon;
        this.toonies = toon;
    }

    public int getLoonies() {
        return loonies;
    }

    public int getToonies() {
        return toonies;
    }

    //Method to check valid input 
    public void setLoonies(int loon) {

        if (loonies < 0) {
            System.out.println("You cannot have a negative number of coins!");
            confirm = true;
        } else {
            this.loonies = loon;
            confirm = false;
        }

    }

    //Method to check valid input 
    public void setToonies(int toon) {
        if (toonies < 0) {
            System.out.println("You cannot have a negative number of coins!");
            confirm = true;
        } else {
            this.toonies = toon;
            confirm = false;
        }
    }

    public boolean getStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

    //Method to validate amount entered 
    public void acceptMoney(int amount) {

        if (getStatus() == false) {
            System.out.println("Out of Order, Here is your bill back");
        } else if (amount == 5 || amount == 10 || amount == 20) {
            makeChange(amount);
            checkStatus();
        } else {
            System.out.println("You must insert a $5 or $10 or $20 bill. Try again.");
        }
    }

    //Method using switch case to accept input 
    void makeChange(int amount) {

        switch (amount) {
            case 5:
                System.out.println("Your change: \n=============\n$1 Coins: 1\t\t$2 Coins: 2\n");
                setToonies(toonies - 2);
                setLoonies(loonies - 1);
                checkStatus();
                break;
            case 10:
                System.out.println("Your change: \n=============\n$1 Coins: 0\t\t$2 Coins: 5\n");
                setToonies(toonies - 5);
                checkStatus();
                break;
            case 20:
                System.out.println("Your change: \n=============\n$1 Coins: 0\t\t$2 Coins: 10\n");
                setToonies(toonies - 10);
                checkStatus();
                break;
            default:
                System.out.println("You must insert a $5 or $10 or $20 bill. Try again.");
                break;
        }

    }

    //Method to check if machine has sufficient funds
    public void checkStatus() {
        if (loonies < 2 || toonies < 10 || confirm == true) {
            setStatus(false);
        } else {
            setStatus(true);
        }
    }

}

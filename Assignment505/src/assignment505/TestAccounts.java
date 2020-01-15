
package assignment505;

public class TestAccounts {
    
    public static void main(String[] args) {
        
        System.out.println("Accounts created: "+ Account.getNumberOfAccounts());
        
        Account oneAcc = new Account(98765,10000,2.8);
        Account twoAcc = new Account(43210,15000,5.4);
        
        oneAcc.displayBalance(); twoAcc.displayBalance();
        oneAcc.transfer(100, twoAcc);
        oneAcc.displayBalance(); twoAcc.displayBalance();
        twoAcc.transfer(100, oneAcc);   
        oneAcc.displayBalance(); twoAcc.displayBalance();
          
        System.out.println("\nTotal accounts created: "+ Account.getNumberOfAccounts());
    }
}

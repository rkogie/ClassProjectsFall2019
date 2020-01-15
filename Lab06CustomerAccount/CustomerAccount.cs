using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab06CustomerAccount
{
    class CustomerAccount
    {
        //Declared variables(private)
        string firstName, lastName, accountNo, balance;


        //Setters
        public void SetFirstName(string firstName)
        {
            this.firstName = firstName;
        }
        public void SetLastName(string lastName)
        {
            this.lastName = lastName;
        }
        public void SetAccountNum(string accountNo)
        {
            this.accountNo = accountNo;
        }
        public void SetBalance(string balance)
        {
            this.balance = balance;
        }
        //Getters
        public string GetFirstName()
        {
            return firstName;
        }
        public string GetLastName()
        { 
            return lastName;
        }
        public string GetAccountNum()
        {
            
            return accountNo;
        }
        public string GetBalance()
        {
            
            return balance;
        }

        //Class Constructor
        public CustomerAccount(string fName, string LName, string accNo, string bal)
        {
            this.firstName = fName;
            this.lastName = LName;
            this.accountNo = accNo;
            this.balance = bal;
        }
    }
}

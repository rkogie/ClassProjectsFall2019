using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab07CollectionsList
{
    class CustomerAccount
    {
        //Declared variables(private)
        string firstName, lastName, accountNo, balance;


        //Constructor - Parameterized
        public CustomerAccount(string fName, string lName, string accNo, string bal)
        {
            this.firstName = fName;
            this.lastName = lName;
            this.accountNo = accNo;
            this.balance = bal;

        }

        //Getter & Setters 
        public string fName { get; set; }
        public string lName { get; set; }
        public string accNo { get; set; }
        public string bal { get; set; }

    }

}


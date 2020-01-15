using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalAssignment2019
{
    class CarOrder
    {
        //Parameterless Constructor
        public CarOrder() { }

        //Parameterized Constructor
        public CarOrder(int order, DateTime date, DateTime deliv, string name, string email,
            string add, bool inProd)
        {
            this.OrderNumID = order;
            this.OrderDate = date;
            this.DelivDate = deliv;
            this.CustomerName = name;
            this.CustomerEmail = email;
            this.CustomerAddress = add; 
            this.InProduction = inProd;
        }

        //Getters & Setters
        public int OrderNumID { get; set; }
        public DateTime OrderDate { get; set; }
        public DateTime DelivDate { get; set; }
        public string CustomerName { get; set; }
        public string CustomerEmail { get; set; }
        public string CustomerAddress { get; set; }
        public bool InProduction { get; set; }
        
        public void SetinProduction(bool inProduction)
        {
            this.InProduction = inProduction;
        }
        public string getInProduction()
        {
            if (this.InProduction == true)
            {
                return "Yes";

            } else
                return "No";
        }

        //Override method to output datatypes to listboxes
        public override string ToString() => $"{OrderNumID, -20}{CustomerName, -30}{CustomerEmail, -30}{getInProduction(),-10} ";


        /*Override method that allows  insert, add, update functionality
        public override bool Equals(object obj)
        {
            
            if (obj == null) return false; 

            int objOrderNumberID = ((CarOrder)obj).OrderNumID;
            if (this.OrderNumID == objOrderNumberID)
            {
                return true; 
            }
            else
            {
                return false;
            }
        }

        public override int GetHashCode()
        {
            return this.OrderNumID.GetHashCode(); 
        }*/
    }
}

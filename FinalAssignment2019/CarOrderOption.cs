using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalAssignment2019
{
    class CarOrderOption
    {
        //Parameterless constructor
        public CarOrderOption() { }

        //Parameterized constructor
        public CarOrderOption(int ID, int orderID, string opname, string info, decimal p)
        {
            this.OptionID = ID;
            this.OrderNumID = orderID;
            this.OptionName = opname;
            this.OptionDescription = info;
            this.Price = p;
        }

        //Getters & Setters
        public int OptionID { get; set; }
        public int OrderNumID { get; set; }
        public String OptionName { get; set; }
        public String OptionDescription { get; set; }
        public decimal Price { get; set; }

        //ToString method to print variables to listbox
        public override string ToString() => $"{OptionID, -20} {OptionName, -30} {OptionDescription, -30} {Price, -10}";
        
        /*Override method that allows  insert, add, update functionality
        public override bool Equals(object obj)
        {
            if (obj == null) return false;

            int objOrderNumberID = ((CarOrderOption)obj).OptionID;
            if (this.OptionID == objOrderNumberID)
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
            return this.OptionID.GetHashCode();
        }*/
    }
    }



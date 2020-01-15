using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Lab06CustomerAccount
{
    public partial class MainWindow : Window
    {
        //To String Methods formats for numerical variables:
        //https://docs.microsoft.com/en-us/dotnet/standard/base-types/standard-numeric-format-strings

        public MainWindow()
        {
            InitializeComponent();
        }

        CustomerAccount[] customer = new CustomerAccount[1];
        int index = 0;
        
        private void NextButton_Click(object sender, RoutedEventArgs e)
        {
            //Cycles through array and navigates through array objects
            index++;
            if (index >= customer.Length)
            {
                index = 0;
            }
         
            firstTBox.Text = customer[index].GetFirstName();
            lastTBox.Text = customer[index].GetLastName();
            accTBox.Text = customer[index].GetAccountNum();
            balTBox.Text = customer[index].GetBalance();
             
        }
        private void PreviousButton_Click(object sender, RoutedEventArgs e)
        {
            //Cycles through array and navigates through array objects
            index--;
            if (index < 0)
            {
                index = customer.Length - 1;     
            }
            
            firstTBox.Text = customer[index].GetFirstName();
            lastTBox.Text = customer[index].GetLastName();
            accTBox.Text = customer[index].GetAccountNum();
            balTBox.Text = customer[index].GetBalance();
            
        }
        private void AddButton_Click(object sender, RoutedEventArgs e)
        {
            //Automatically saves, blanks all fields and executes addAccount method
            save();
            index = customer.Length;
            addAccount();
            firstTBox.Text = "";
            lastTBox.Text = "";
            accTBox.Text = "";
            balTBox.Text = "";
        }

        private void SaveButton_Click(object sender, RoutedEventArgs e)
        {
            save();
        }

        public void save()
        {
            //saves index to the customer object array minus 1
            //Creates new instance of customer which holds 4 string values (see class constructor)
            
            if (firstTBox.Text =="")
            {
                MessageBox.Show("Invalid input, please enter required fields","Error Message");
                firstTBox.Focus();
                return;
            }
            else if (lastTBox.Text =="")
            {
                MessageBox.Show("Invalid input, please enter required fields","Error Message");
                lastTBox.Focus();
                return;
            }
            else if (accTBox.Text =="")
            {
                MessageBox.Show("Invalid input, please enter required fields","Error Message");
                accTBox.Focus();
                return;
            }
            else if (balTBox.Text == "")
            {
                MessageBox.Show("Invalid input, please enter required fields", "Error Message");
                balTBox.Focus();
                return;
            }
            else
            {
                customer[index] = new CustomerAccount(firstTBox.Text, lastTBox.Text, accTBox.Text, balTBox.Text);
            }
        }
        public void addAccount()
        { 
            //Increases the array object by 1 index, array length -1 saved into index
            //new instance of customer created that converts variables into strings
            Array.Resize(ref customer, customer.Length + 1);
            index = customer.Length - 1;
            if (firstTBox.Text =="")
            {
                MessageBox.Show("Invalid input, please enter required fields", "Error Message");
                firstTBox.Focus();
                return;
            }
            else if (lastTBox.Text =="")
            {
                MessageBox.Show("Invalid input, please enter required fields", "Error Message");
                lastTBox.Focus();
                return;
            }
            else if (accTBox.Text =="")
            {
                MessageBox.Show("Invalid input, please enter required fields", "Error Message");
                accTBox.Focus();
                return;
            }
            else if (balTBox.Text == "")
            {
                MessageBox.Show("Invalid input, please enter required fields", "Error Message");
                balTBox.Focus();
                return;
            }
            else
            {
                customer[index] = new CustomerAccount(firstTBox.Text, lastTBox.Text, accTBox.Text, balTBox.Text);
            }
        }
    }
}

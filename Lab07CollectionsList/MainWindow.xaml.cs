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

namespace Lab07CollectionsList
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        //Declare global variables and list object.
        List<CustomerAccount> customer = new List<CustomerAccount>();
        int index = 0; bool isValid = false;


        public MainWindow()
        {
            InitializeComponent();
        }

        //Method to check valid inputs from user.
        public bool CheckValidInput()
        {
           
            bool isValid = false;
            //Validation condition checks for empty text boxes.
            if (firstTBox.Text == "")
            {
                MessageBox.Show("Empty name field, please enter first name", "Error Message");
                firstTBox.Focus();
            }
            else if (lastTBox.Text == "")
            {
                MessageBox.Show("Empty name field, please enter last name", "Error Message");
            }
            else if (accTBox.Text == "")
            {
                MessageBox.Show("Empty account field, please enter account number", "Error Message");
            }
            else if (balTBox.Text == "")
            {
                MessageBox.Show("Empty balance field, please enter balance", "Error Message");
            }
            else isValid = true;

            return isValid;
        }


        //Method to save record using constructor call in Customer Account class.
        public void Save(string f, string l, string acc, string bal, int ind)
        {
            //Condition check to create new list object.
            if (index >= customer.Count)
            {
                AddNew(f, l, acc, bal);
            }

            //Sets inputs into index using constructor call from Customer method.
            customer[index].fName = f;
            customer[index].lName = l;
            customer[index].accNo = acc;
            customer[index].bal = bal;
        }
        //Method that adds new list record.
        public void AddNew(string f, string l, string acc, string bal)
        {
            //In built method from C# that adds record.
            customer.Add(new CustomerAccount(f, l, acc, bal));
        }


        //Method that cycles through records
        private void PreviousButton_Click(object sender, RoutedEventArgs e)
        {
            //Checks for valid input.
            isValid = CheckValidInput();

            if (isValid == true)
            {
                //Saves currently entered fields, decrements index by 1.
                Save(firstTBox.Text, lastTBox.Text, accTBox.Text, balTBox.Text, index);   
                index--;
                //Condition checks once index reaches 0 and cycles back to last item in textboxes.
                if (index < 0)
                {
                    index = customer.Count - 1;
                }
                //Displays details to user.
                firstTBox.Text = customer[index].fName;
                lastTBox.Text = customer[index].lName;
                accTBox.Text = customer[index].accNo;
                balTBox.Text = customer[index].bal;
            }
            
            isValid = false;
        }
        //Method that cycles through records
        private void NextButton_Click(object sender, RoutedEventArgs e)
        {
            //Checks for valid input.
            isValid = CheckValidInput();
            if (isValid == true)
            {
                //Saves currently entered fields, increments index by 1.
                Save(firstTBox.Text, lastTBox.Text, accTBox.Text, balTBox.Text, index);
                index++;
                //Condition checks once index reaches list length and cycles back to the first (0) item in textboxes.
                if (index == customer.Count)
                {
                    index = 0;
                }
                //Displays details to user.
                firstTBox.Text = customer[index].fName;
                lastTBox.Text = customer[index].lName;
                accTBox.Text = customer[index].accNo;
                balTBox.Text = customer[index].bal;
            }
            
            isValid = false;
        }

        //Add new entry button.
        private void AddButton_Click(object sender, RoutedEventArgs e)
        {
            //Checks valid input.
            isValid = CheckValidInput();
            //Condition check that saves current record, sets index to the list lenght and clears fields.
            if (isValid == true)
            {
                
                Save(firstTBox.Text, lastTBox.Text, accTBox.Text, balTBox.Text, index);
                index = customer.Count;   
                firstTBox.Clear();
                lastTBox.Clear();
                accTBox.Clear();
                balTBox.Clear();
            }
  
            isValid = false;
        }

        //Save button
        private void SaveButton_Click(object sender, RoutedEventArgs e)
        {
            //Checks valid inputs.
            isValid = CheckValidInput();
            //Condition that saves inputs to textbox 
            if (isValid == true)
            {     
                Save(firstTBox.Text, lastTBox.Text, accTBox.Text, balTBox.Text, index);
            }
            
            isValid = false;
        }

        //Delete Button
        private void DeleteButton_Click(object sender, RoutedEventArgs e)
        {
            //Condition checks to see if fields are empty.
            if (firstTBox.Text == "" || lastTBox.Text == "" || accTBox.Text == "" || balTBox.Text == "")
            {
                MessageBox.Show("Cannot Delete an empty Record", "Error Message");
                return;
            }
            else if (customer.Count < 0)
            {
                MessageBox.Show("You must have at least one record stored in the database", "Error Message");
                return;
            }

            //Use built in method, decrements index and displays previous record.
            customer.RemoveAt(index);
            index--;
            firstTBox.Text = customer[index].fName;
            lastTBox.Text = customer[index].lName;
            accTBox.Text = customer[index].accNo;
            balTBox.Text = customer[index].bal;
  
            isValid = false;
        }
    }
}

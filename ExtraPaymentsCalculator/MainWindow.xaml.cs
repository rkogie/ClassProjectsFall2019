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

namespace ExtraPaymentsCalculator
{
    
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        //Script modified from the Loan Repyaments Calculator to include extra payments
        private void Button_Click(object sender, RoutedEventArgs e)
        {

            //Declared variables and initialised where required
            int months, counter = 0, nthMonth;
            double principal, monthlyPayment, extraPayment, monthlyInterest = 0, currentBal = 0, interestRate;
            errorMessBox.Content = "";

            //Error exception condition statements to catch invalid input
            if (double.TryParse(loanPrincTBox.Text, out principal) == false || principal < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Blue;
                MultiLineOutputTbox.Text = "";
                return;
            }
            if (double.TryParse(monthlyPayTBox.Text, out monthlyPayment) == false || monthlyPayment < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Blue;
                MultiLineOutputTbox.Text = "";
                return;
            }
            if (double.TryParse(interestTBox.Text, out interestRate) == false || interestRate < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Blue;
                MultiLineOutputTbox.Text = "";
                return;
            }
            if (double.TryParse(extraPaymentAmountTextBox.Text, out extraPayment) == false || extraPayment < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Blue;
                MultiLineOutputTbox.Text = "";
                return;
            }
            if (Int32.TryParse(numMonthTBox.Text, out months) == false || months < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Blue;
                MultiLineOutputTbox.Text = "";
                return;
            }
            if (Int32.TryParse(extraPaymentFrequencyTextBox.Text, out nthMonth) == false || nthMonth < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Blue;
                MultiLineOutputTbox.Text = "";
                return;
            }

            //Intitalise user input static variable to increment variable
            currentBal = principal;

            //GUI output display
            MultiLineOutputTbox.Text += "Month\tPayment\t  Extra\t  Interest\tBalance\n";
            MultiLineOutputTbox.Text += "============================================\n";
            MultiLineOutputTbox.Text += $"\t\t\t\t\t{principal:N2}\n";

            //Loop to iterate through calcuations within the user specified period and allocate extre payment where required
            for (counter = 1; counter <= months; counter++)
            {
                monthlyInterest = currentBal * (interestRate / 100) / 12;
        
                if (counter % nthMonth == 0) 
                {
                    currentBal += monthlyInterest - (monthlyPayment + extraPayment);
                    MultiLineOutputTbox.Text += $"{counter:D}\t{monthlyPayment:N2}\t {extraPayment:N2}\t  {monthlyInterest:N2}\t\t{currentBal:N2}\n";
                }
                else
                {
                    currentBal += monthlyInterest - monthlyPayment;
                    MultiLineOutputTbox.Text += $"{counter:D}\t{monthlyPayment:N2}\t\t  {monthlyInterest:N2}\t\t{currentBal:N2}\n";
                }
            }
            //End of script
        }
    }
}

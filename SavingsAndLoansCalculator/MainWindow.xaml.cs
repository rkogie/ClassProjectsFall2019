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

namespace SavingsAndLoansCalculator
{

    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        //Script to calculate savings rate for a specified savings goal
        private void CalcButton_Click(object sender, RoutedEventArgs e)
        {
            //Declared variables and initialised values where required
            int months = 1;
            double annualRate, savGoal, savEachMonth, monthlyRate, currentBal, interestAmount= 0;
            errorMessBox.Content = "";
            

            //Exception error catching statements using if conditions for invalid inputs
            if (double.TryParse(saveTBox.Text, out savGoal) == false || savGoal < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Red;
                listBoxOutput.Items.Clear();
                return;
            }
            if (double.TryParse(savEachMthTBox.Text, out savEachMonth) == false || savEachMonth < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Red;
                listBoxOutput.Items.Clear();
                return;
            }
            if (double.TryParse(interestTbox.Text, out annualRate) == false || annualRate < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Red;
                listBoxOutput.Items.Clear();
                return;
            }

            //Calculations to compute monthly adjusted rates
            monthlyRate = (annualRate / 12) / 100;
            currentBal = savEachMonth;

            //Output to form and formatted to display required values
            
            listBoxOutput.Items.Clear();
            listBoxOutput.Items.Add(String.Format("{0,-8}{1,-8}{2,-10}{3,-8}","Month","Saved","Interest","Balance"));
            listBoxOutput.Items.Add("=============================================");
            listBoxOutput.Items.Add($"{months,-8:D} {savEachMonth,-8:N2} {interestAmount,-10:N2} {currentBal,-8:N2}");

            //Loop construct to compute compounded interest payment per month and add to current balance
            while (currentBal < savGoal) 
            { 
                months += 1;
                interestAmount = currentBal * monthlyRate; 
                currentBal += savEachMonth + interestAmount;   
                listBoxOutput.Items.Add($"{months,-8:D} {savEachMonth,-8:N2} {interestAmount,-10:N2} {currentBal,-8:N2}");
            }
           
            //End of script

        }
        

    }
    }


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

namespace PrimeNumbersv2
{
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        //Event handler method to accept user input and execute method
        private void CacluatePrimes_Click(object sender, RoutedEventArgs e)
        {
            //Declared variables
            int upperNum = 0, lowerNum = 0;

            //Exception handler to catch input errors
            if (Int32.TryParse(lowerTbox.Text, out lowerNum) == false || lowerNum < 2)
            {
                MessageBox.Show("Please enter a number greater than 2");
                lowerTbox.Focus();
                return;
            }
            if (Int32.TryParse(upperTbox.Text, out upperNum) == false || lowerNum > upperNum)
            {
                MessageBox.Show("Upper bound cannot be less than lower bound");
                upperTbox.Focus();
                return;
            }

            //Method call from below
            Prime(lowerNum, upperNum);
        }
        //Method to generate prime numbers from user input
        private void Prime(int lower, int upper)
        {
            //Loop construct to check for prime numbers and increment lowest number by 1
            while (lower < upper)
            {
                bool isPrime = false;
                for (int count = 2; count <= (lower / 2);)
                {
                    if (lower % count == 0)
                    isPrime = true;
                    break;
                }
                if (!isPrime)
                {
                    primeTbox.Text += "\n" + lower.ToString();
                }
                ++lower;
            }

        }
    }
}







         

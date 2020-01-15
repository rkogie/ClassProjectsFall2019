using System;
using System.Collections.Generic;
using System.Globalization;
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

namespace InvoiceTaxGUI
{
  
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        //Script to calculate invoice taxes including shipping, PST and GST for up tot 4 items and print the results (incl. sales commission)
        private void CalculateButt_Click(object sender, RoutedEventArgs e)
        {
            //Declared variables for all possible variable types and intialised as required
            double item1, item2, item3, item4, pstItem1, pstItem2, pstItem3, pstItem4, gstItem1, gstItem2, gstItem3, gstItem4;
            double pst, gst, shipPercent, subTot, shipping, gstTot, pstTot, totalSum, salesComm;
            pst = 0.06;
            gst = 0.05;
            shipPercent = 0.02;
            errorMessBox.Content = "";

            //Exception error catching statements using if conditions for invalid inputs
            if (Double.TryParse(Item1TBox.Text, out item1) == false || item1 < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Red;
                SubTBox.Text = ""; ShipTBox.Text = ""; pstTbox.Text = ""; gstTBox.Text = "";
                totalTBox.Text = ""; salesTBox.Text = ""; salesTBox.Background = Brushes.White;
                Item1TBox.Focus();
                return;
            }
            if (Double.TryParse(Item2TBox.Text, out item2) == false || item2 < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Red;
                SubTBox.Text = ""; ShipTBox.Text = ""; pstTbox.Text = ""; gstTBox.Text = "";
                totalTBox.Text = ""; salesTBox.Text = ""; salesTBox.Background = Brushes.White;
                Item2TBox.Focus();
                return;
            }
            if (Double.TryParse(Item3TBox.Text, out item3) == false || item3 < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Red;
                SubTBox.Text = ""; ShipTBox.Text = ""; pstTbox.Text = ""; gstTBox.Text = "";
                totalTBox.Text = ""; salesTBox.Text = ""; salesTBox.Background = Brushes.White;
                Item3TBox.Focus();
                return;
            }
            if (Double.TryParse(Item4TBox.Text, out item4) == false || item4 < 0)
            {
                errorMessBox.Content = "Enter a number value above 0";
                errorMessBox.Foreground = Brushes.Red;
                SubTBox.Text = ""; ShipTBox.Text = ""; pstTbox.Text = ""; gstTBox.Text = "";
                totalTBox.Text = ""; salesTBox.Text = ""; salesTBox.Background = Brushes.White;
                Item4TBox.Focus();
                return;
            }

            //Conditions statements to calculate taxes when check boxes are checked by user
            if (PSTItem1CkBox.IsChecked.Value)
                pstItem1 = item1 * pst;
            else
                pstItem1 = 0;

            if (PSTItem2CkBox.IsChecked.Value)
                pstItem2 = item2 * pst;
            else
                pstItem2 = 0;

            if (PSTItem3CkBox.IsChecked.Value)
                pstItem3 = item3 * pst;
            else
                pstItem3 = 0;

            if (PSTItem4CkBox.IsChecked.Value)
                pstItem4 = item4 * pst;
            else
                pstItem4 = 0;

            if (GSTItem1CkBox.IsChecked.Value)
                gstItem1 = item1 * gst;
            else
                gstItem1 = 0;

            if (GSTItem2CkBox.IsChecked.Value)
                gstItem2 = item2 * gst;
            else
                gstItem2 = 0;

            if (GSTItem3CkBox.IsChecked.Value)
                gstItem3 = item3 * gst;
            else
                gstItem3 = 0;

            if (GSTItem4CkBox.IsChecked.Value)
                gstItem4 = item4 * gst;
            else
                gstItem4 = 0;

            //Calculation to compute subtotal of items without taxes incurred
            subTot = item1 + item2 + item3 + item4;
            subTot = Math.Round((Double)subTot, 2);
            SubTBox.Text = subTot.ToString("C");

            //Condition to apply shipping taxes if radiobutton selected. Default option set to pickup adding 0 to subtotal
            if (shipRadBut.IsChecked.Value)
            {
                shipping = subTot * shipPercent;
                shipping = Math.Round((Double)shipping, 2);
                ShipTBox.Text = shipping.ToString("C");
            }
            else
                shipping = 0.00;
                ShipTBox.Text = shipping.ToString("C");

            //Calculations to compute taxes total of items
            pstTot = pstItem1 + pstItem2 + pstItem3 + pstItem4;
            pstTot = Math.Round((Double)pstTot, 2);
            pstTbox.Text = pstTot.ToString("C");

            gstTot = gstItem1 + gstItem2 + gstItem3 + gstItem4;
            gstTot = Math.Round((Double)gstTot, 2);
            gstTBox.Text = gstTot.ToString("C");

            //Calculations to compute total of items with applicable taxes and shipping
            totalSum = subTot + shipping + pstTot + gstTot;
            totalSum = Math.Round((Double)totalSum, 2);
            totalTBox.Text = totalSum.ToString("C");

            //Condition checks to calculate sales commission earned on sales over certain values
            if (totalSum > 0 && totalSum <= 100)
            {
                salesComm = totalSum * 0.035;
                salesComm= Math.Round((Double)salesComm, 2);
                salesTBox.Text = salesComm.ToString("C");
                salesTBox.Background = Brushes.Black;
                salesTBox.Foreground = Brushes.White;
            }
            if (totalSum > 100 && totalSum <= 225)
            {
                salesComm = totalSum * 0.05;
                salesComm = Math.Round((Double)salesComm, 2);
                salesTBox.Text = salesComm.ToString("C");
                salesTBox.Background = Brushes.Blue;
                salesTBox.Foreground = Brushes.White;
            }
            if (totalSum > 225 && totalSum <= 500)
            {
                salesComm = totalSum * 0.07;
                salesComm = Math.Round((Double)salesComm, 2);
                salesTBox.Text = salesComm.ToString("C");
                salesTBox.Background = Brushes.Green;
                salesTBox.Foreground = Brushes.White;
            }
            if (totalSum > 500)
            {
                salesComm = totalSum * 0.11;
                salesComm = Math.Round((Double)salesComm, 2);
                salesTBox.Text = salesComm.ToString("C");
                salesTBox.Background = Brushes.Red;
                salesTBox.Foreground = Brushes.White;

                //End of script
            }
        }
    }
    }


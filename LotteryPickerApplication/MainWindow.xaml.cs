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

namespace LotteryPickerApplication
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        static Random rand = new Random();
        public MainWindow()
        {
            InitializeComponent();
        }

        private void GenerateButton_Click(object sender, RoutedEventArgs e)
        {
            //Method call to run methods throughout each textbox
            sequenceThree(0, 0, 0);
            sequenceFour(0, 0, 0, 0);
            sequenceFive(0, 0, 0, 0, 0);
            sequenceFivePlusOne(0, 0, 0, 0, 0, 0);
        }

        //Method to generate random numbers and output on first textbox
        private void sequenceThree(int num1, int num2, int num3)
        {
            num1 = rand.Next(0, 9);
            num2 = rand.Next(0, 9);
            num3 = rand.Next(0, 9);

            ThreeTBox.Text = String.Format($"{num1,-4:D2}{num2,-4:D2}{num3,-4:D2}");
        }
        //Method to generate random numbers and output on second textbox
        private void sequenceFour(int num1, int num2, int num3, int num4)
        {
            num1 = rand.Next(0, 9);
            num2 = rand.Next(0, 9);
            num3 = rand.Next(0, 9);
            num4 = rand.Next(0, 9);

            FourTBox.Text = String.Format($"{num1,-4:D2}{num2,-4:D2}{num3,-4:D2}{num4,-4:D2}");
        }
        //Method to generate random numbers and output on third textbox
        private void sequenceFive(int num1, int num2, int num3, int num4, int num5)
        {
            num1 = rand.Next(1, 39);
            num2 = rand.Next(1, 39);
            num3 = rand.Next(1, 39);
            num4 = rand.Next(1, 39);
            num5 = rand.Next(1, 39);

            FiveTBox.Text = String.Format($"{num1,-4:D2}{num2,-4:D2}{num3,-4:D2}{num4,-4:D2}{num5,-4:D2}");
        }
        //Method to generate random numbers and output on fourth textbox
        private void sequenceFivePlusOne(int num1, int num2, int num3, int num4, int num5, int plusOne)
        {
            num1 = rand.Next(1, 49);
            num2 = rand.Next(1, 49);
            num3 = rand.Next(1, 49);
            num4 = rand.Next(1, 49);
            num5 = rand.Next(1, 49);
            plusOne = rand.Next(1, 42);

            FivePlusOneTbox.Text = String.Format($"{num1,-4:D2}{num2,-4:D2}{num3,-4:D2}{num4,-4:D2}{num5,-4:D2}");
            PlusOneTbox.Text = String.Format($"{plusOne,-4:D2}");
        }
    }
}




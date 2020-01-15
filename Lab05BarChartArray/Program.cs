using System;

namespace Lab05BarChartArray
{
    class Program
    {
        //Main method to output values from two arrays
        static void Main(string[] args)
        {
            //Declared variables of arrays
            string[] labels = new string[] { "Jan:  ", "Feb:  ", "Mar:  ", "April:", "May:  ", "Jun:  ",
                "July: ", "Aug:  ", "Sept: ", "Oct:  ", "Nov:  ", "Dec:  " };
            int[] values = new int[] { 10, 15, 25, 5, 3, 30, 11, 8, 12, 35, 20, 7 };

            //Variables cast into methods
            ShowGraph(labels, values);
        }
        public static void ShowGraph(string[] labels, int[] values)
        {
            //Loop to output my labels array elements
            for (int counter = 0; counter < labels.Length; counter++)
            {
                //Output to console
                Console.Write(labels[counter]);
                //Nested loop to assign values in elements within first array
                for (int j = 0; j < values[counter]; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }
            Console.Read();

        }

    }
     
}


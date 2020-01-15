using System;
using System.Collections.Generic;
using System.Linq;
using System.Data.SqlClient;
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


namespace FinalAssignment2019
{

    public partial class MainWindow : Window
    {
        //Open sql Connection 
        //@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=|DataDirectory|\Orders.mdf;Integrated Security=True";
        string connectionString = 
            @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\kogie5792\source\repos\FinalAssignment2019\Orders.mdf;Integrated Security=True";

        //Set up a data model, declare global variables and objects
        private List<CarOrder> CustomerRecord = new List<CarOrder>();
        private CarOrder CurrentOrder;
        private int CurrentSelectedIndex;
        bool isValidRecord;

        public MainWindow()
        {
            InitializeComponent();
            LoadOrders();
            isValidRecord = false;
        }
        //Method to check validation of user input
        private bool IsCustomerValid()
        {
            //Created Object 
            CarOrder recordVerify = new CarOrder();
            //If statements to check textbox inputs
            if (customerNameTextBox.Text == "" || customerEmailTextBox.Text == "" ||
            orderDateDatePicker.Text == "")
            {
                errorMessLabel.Content = "Invalid Input Detected. Please Enter Data in Required Fields";
                errorMessLabel.Foreground = Brushes.Red;
                return false;
            }

            if (isValidRecord)
            {
                orderDateDatePicker.Text = recordVerify.OrderDate.ToString();
                customerNameTextBox.Text = recordVerify.CustomerName.ToString();
                customerEmailTextBox.Text = recordVerify.CustomerEmail.ToString();

                isValidRecord = false;
                LoadOrders();
            }
            //Set value to true once verified
            return true;
        }
        //Method to check validation of user input
        private bool IsOptionValid()
        {
            //Create object to check textbox inputs
            CarOrderOption optionVerify = new CarOrderOption();

            if (optionNameTextBox.Text == "" || optionDescriptionTextBox.Text == "" || optionPriceTextBox.Text == "")
            {
                errorMessLabel.Content = "Invalid Input Detected. Please Enter Data in Required Fields";
                errorMessLabel.Foreground = Brushes.Red;
                return false;
            }
            //Check for numerical input
            if (Convert.ToDecimal(optionPriceTextBox.Text) < 0)
            {

                errorMessLabel.Content = "Number Values Must Be Above Zero. Please Try Again";
                errorMessLabel.Foreground = Brushes.Red;
                return false;
            }

            if (isValidRecord)
            {
                optionNameTextBox.Text = optionVerify.OptionName.ToString();
                optionDescriptionTextBox.Text = optionVerify.OptionDescription.ToString();
                optionPriceTextBox.Text = optionVerify.Price.ToString();

                isValidRecord = false;
                LoadOptionsPackages();
            }
            //Set value to true once verified
            return true;
        }
        //Method that connects to database and loads customer information into list box
        public void LoadOrders()
        {
            // create and open a connection
            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                // Create a SQL command object and calling in-built methods
                string queryString = "SELECT * FROM dbo.CarOrders;";
                SqlCommand command = new SqlCommand(queryString, connection);

                connection.Open();
                SqlDataReader reader = command.ExecuteReader();
                CustomerRecord.Clear();
                CustomerOrderListBox.Items.Clear();

                while (reader.Read())
                {
                    //Pass values from database into parameterized constructor
                    CarOrder NewCustomer = new CarOrder((int)reader["OrderNumber"],
                                                     (DateTime)reader["OrderDate"],
                                                     (DateTime)reader["DeliveryDate"],
                                                     (string)reader["CustomerName"],
                                                     (string)reader["CustomerEmail"],
                                                     (string)reader["CustomerAddress"],
                                                     (bool)reader["InProduction"]);


                    //Add to list object
                    CustomerRecord.Add(NewCustomer);

                    //Add to listbox
                    CustomerOrderListBox.Items.Add(NewCustomer);

                }

                //Call Close when done reading.
                reader.Close();
            }
        }
        //Method functionality to navigate between records in customer listbox
        private void CustomerOrderListBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            CurrentOption = null;
            DisplayOptionsPackages();
            CurrentOrder = (CarOrder)CustomerOrderListBox.SelectedItem;
            CurrentSelectedIndex = CustomerOrderListBox.SelectedIndex;

            if (CurrentOrder != null)
            {
                DisplayCustomerDetails();
                LoadOptionsPackages();
            }

        }
        //Method to display customer items in textboxes
        private void DisplayCustomerDetails()
        {
            if (CurrentOrder != null)
            {
                orderNumberTextBox.Text = CurrentOrder.OrderNumID.ToString();
                customerNameTextBox.Text = CurrentOrder.CustomerName;
                orderDateDatePicker.Text = CurrentOrder.OrderDate.ToString();
                customerEmailTextBox.Text = CurrentOrder.CustomerEmail;
                customerAddressTextBox.Text = CurrentOrder.CustomerAddress;
                inProductionCheckBox.IsChecked = CurrentOrder.InProduction == true;
                deliveryDateDatePicker.Text = CurrentOrder.DelivDate.ToString();

            }
            else
            {
                orderNumberTextBox.Text = "";
                customerNameTextBox.Text = "";
                orderDateDatePicker.Text = "";
                customerEmailTextBox.Text = "";
                customerAddressTextBox.Text = "";
                deliveryDateDatePicker.Text = "";
                SubtotalTBox.Text = "";
                PSTTBox.Text = "";
                GSTTBox.Text = "";
                TotalTBox.Text = "";
            }
        }
        //Method that saves order information into database
        private void SaveButtonOrderRecord_Click(object sender, RoutedEventArgs e)
        {
            if (IsCustomerValid())
            {
                errorMessLabel.Content = "";
                
                CurrentOrder.OrderNumID = Convert.ToInt32(orderNumberTextBox.Text);
                CurrentOrder.OrderDate = Convert.ToDateTime(orderDateDatePicker.Text);
                CurrentOrder.CustomerName = customerNameTextBox.Text;
                CurrentOrder.CustomerEmail = customerEmailTextBox.Text;
                CurrentOrder.CustomerAddress = customerAddressTextBox.Text;
                if (inProductionCheckBox.IsChecked == true)
                {
                    CurrentOrder.InProduction = true;
                }
                else CurrentOrder.InProduction = false;
                CurrentOrder.DelivDate = Convert.ToDateTime(deliveryDateDatePicker.Text);

                using (SqlConnection connection = new SqlConnection())
                {
                    //Open sql connection and update info from inputs to database
                    //@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=|DataDirectory|\Orders.mdf;Integrated Security=True";
                    connection.ConnectionString =
                    @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\kogie5792\source\repos\FinalAssignment2019\Orders.mdf;Integrated Security=True";
                    connection.Open();

                    string sql = $"UPDATE CarOrders SET " +
                                 $"OrderDate = '{CurrentOrder.OrderDate.ToShortDateString()}', " +
                                 $"CustomerName = '{CurrentOrder.CustomerName}', " +
                                 $"CustomerEmail= '{CurrentOrder.CustomerEmail}', " +
                                 $"CustomerAddress = '{CurrentOrder.CustomerAddress}', " +
                                 $"InProduction = '{CurrentOrder.InProduction}', " +
                                 $"DeliveryDate = '{CurrentOrder.DelivDate.ToShortDateString()}'" +
                                 $"WHERE OrderNumber = {CurrentOrder.OrderNumID};";
                    //In-built sql commands to check inputs
                    using (SqlCommand UpdateCommand = new SqlCommand(sql, connection))
                    {
                        UpdateCommand.ExecuteNonQuery();
                    }
                }
                LoadOrders();
            }

        }
        //Method to create new record
        private void NewButtonOrderRecord_Click(object sender, RoutedEventArgs e)
        {
            if (IsCustomerValid())
            {
                errorMessLabel.Content = "";
                string sql;
                //Creates a new list object that inherits properties from CarOrder class and assigns variable to textboxes
                CarOrder NewCustomer = new CarOrder();
                NewCustomer.OrderNumID = Convert.ToInt32(orderNumberTextBox.Text);
                NewCustomer.OrderDate = Convert.ToDateTime(orderDateDatePicker.Text);
                NewCustomer.CustomerName = customerNameTextBox.Text;
                NewCustomer.CustomerEmail = customerEmailTextBox.Text;
                NewCustomer.CustomerAddress = customerAddressTextBox.Text;
                if (inProductionCheckBox.IsChecked == true)
                {
                    NewCustomer.InProduction = true;
                }
                else NewCustomer.InProduction = false;
                NewCustomer.DelivDate = Convert.ToDateTime(deliveryDateDatePicker.Text);
                
                //Open new connection 
                using (SqlConnection connection = new SqlConnection())
                {
                    //@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=|DataDirectory|\Orders.mdf;Integrated Security=True";
                    connection.ConnectionString =
                @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\kogie5792\source\repos\FinalAssignment2019\Orders.mdf;Integrated Security=True";
                    connection.Open();

                    //find the last used primary key (the maximum OrderNumber)
                    sql = $"SELECT MAX(OrderNumber) FROM CarOrders;";

                    int NewOrderNumber;
                    using (SqlCommand SelectCommand = new SqlCommand(sql, connection))
                    {
                        NewOrderNumber = Convert.ToInt32(SelectCommand.ExecuteScalar()) + 1;
                        NewCustomer.OrderNumID = NewOrderNumber; //Record the new Primary Key
                    }
                    //NO PROTECTION FROM SQL INJECTION HERE
                    sql = $"INSERT INTO CarOrders " +
                              "(OrderNumber, OrderDate, CustomerName, CustomerEmail, CustomerAddress, InProduction, DeliveryDate) " +
                                "VALUES " +

                                     $"( {NewOrderNumber}, " +
                                     $"'{NewCustomer.OrderDate.ToShortDateString()}', " +
                                     $"'{NewCustomer.CustomerName}', " +
                                     $"'{NewCustomer.CustomerEmail}', " +
                                     $"'{NewCustomer.CustomerAddress}', " +
                                     $"'{NewCustomer.InProduction}', " +
                                     $"'{NewCustomer.DelivDate.ToShortDateString()}')";

                    using (SqlCommand InsertCommand = new SqlCommand(sql, connection))
                    {
                        InsertCommand.ExecuteNonQuery();
                    }

                    //Update display
                    LoadOrders();

                    //Find index of new item
                    int NewIndex = CustomerOrderListBox.Items.IndexOf(NewCustomer);

                    //Select the new item
                    CustomerOrderListBox.SelectedIndex = NewIndex;
                    CustomerOrderListBox.ScrollIntoView(NewCustomer);

                }

            }

        }
        //Method that deletes customer record
        private void DeleteButtonOrderRecord_Click(object sender, RoutedEventArgs e)
        {
            // Create and open a connection.
            using (SqlConnection connection = new SqlConnection())
            {
                //@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=|DataDirectory|\Orders.mdf;Integrated Security=True";
                connection.ConnectionString =
                 @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\kogie5792\source\repos\FinalAssignment2019\Orders.mdf;Integrated Security=True";
                connection.Open();

                // Create a SQL command object
                string sql = $"DELETE From CarOrders WHERE OrderNumber = {CurrentOrder.OrderNumID}";

                using (SqlCommand myCommand = new SqlCommand(sql, connection))
                {
                    try
                    {
                        myCommand.ExecuteNonQuery();
                    }
                    catch (SqlException ex)
                    {
                        Exception error = new Exception("Error no matching record to delete", ex);
                        throw error;
                    }
                }
            }
            //Update Selected data
            
            int IndexToDelete = CurrentSelectedIndex;
            //Remove the current object from the List<CarOrder>
            CustomerRecord.Remove(CurrentOrder); 
            CustomerOrderListBox.Items.Remove(CurrentOrder); 

            if (IndexToDelete == CustomerRecord.Count) 
            {
                CurrentSelectedIndex = CustomerRecord.Count - 1; 

            }
            else
            {
                CurrentSelectedIndex = IndexToDelete;   
            }
            
            CustomerOrderListBox.SelectedIndex = CurrentSelectedIndex;

        }
        
        //Set up a data model, declare global variables and objects
        private List<CarOrderOption> OrdersMade = new List<CarOrderOption>();
        private CarOrderOption CurrentOption;

        //Method that connects to database and loads option package information into list box
        public void LoadOptionsPackages()
        {
            string queryString = $"SELECT * FROM dbo.CarOrderOptions WHERE OrderNumber = {CurrentOrder.OrderNumID}";
            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                SqlCommand command = new SqlCommand(queryString, connection);

                connection.Open();

                SqlDataReader reader = command.ExecuteReader();

                OrdersMade.Clear();
                OrderOptionListBox.Items.Clear();

                // Call Read before accessing data.
                while (reader.Read())
                {
                    CarOrderOption NewOption = new CarOrderOption((int)reader["OptionID"],
                                                            (int)reader["OrderNumber"],
                                                            (string)reader["OptionName"],
                                                            (string)reader["OptionDescription"],
                                                            (decimal)reader["OptionPrice"]);

                    //Add to list
                    OrdersMade.Add(NewOption);
                    //Add to listbox
                    OrderOptionListBox.Items.Add(NewOption);
                    //Declare variables to perform calculations and keep running total of updates, additions and deletions
                    decimal subtotal = 0, pstTotal, gstTotal, orderTotal;

                    subtotal = OrdersMade.Sum(X => X.Price);

                    pstTotal = subtotal * 0.06M;
                    gstTotal = subtotal * 0.05M;

                    orderTotal = subtotal + pstTotal + gstTotal;
                    //Displayed values to textbox with currency symbol
                    SubtotalTBox.Text = subtotal.ToString("C");
                    PSTTBox.Text = pstTotal.ToString("C");
                    GSTTBox.Text = gstTotal.ToString("C");
                    TotalTBox.Text = orderTotal.ToString("C");

                }
                // Call Close when done reading.
                reader.Close();
            }

        }
        //Method functionality to navigate between records in customer listbox
        private void OrderOptionListBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

            CurrentOption = (CarOrderOption)OrderOptionListBox.SelectedItem;
            CurrentSelectedIndex = CustomerOrderListBox.SelectedIndex;
            DisplayOptionsPackages();
        }
        //Method that displays option information
        private void DisplayOptionsPackages()
        {

            if (CurrentOption != null)
            {
                optionIDTextBox.Text = CurrentOption.OptionID.ToString();
                optionNameTextBox.Text = CurrentOption.OptionName.ToString();
                optionDescriptionTextBox.Text = CurrentOption.OptionDescription.ToString();
                optionPriceTextBox.Text = CurrentOption.Price.ToString();
            }
            else
            {
                optionIDTextBox.Text = "";
                optionNameTextBox.Text = "";
                optionDescriptionTextBox.Text = "";
                optionPriceTextBox.Text = "";
            }

        }
        //Method that saves option information into database
        private void SaveButtonOptionRecord_Click(object sender, RoutedEventArgs e)
        {
            if (IsOptionValid())
            {
                errorMessLabel.Content = "";
                CurrentOption.OptionID = Convert.ToInt32(optionIDTextBox.Text);
                CurrentOption.OptionName = optionNameTextBox.Text;
                CurrentOption.OptionDescription = optionDescriptionTextBox.Text;
                CurrentOption.Price = Convert.ToDecimal(optionPriceTextBox.Text);

                using (SqlConnection connection = new SqlConnection())
                {
                    //@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=|DataDirectory|\Orders.mdf;Integrated Security=True";
                    connection.ConnectionString =
                    @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\kogie5792\source\repos\FinalAssignment2019\Orders.mdf;Integrated Security=True";
                    //Open connection
                    connection.Open();

                    string sql = $"UPDATE CarOrderOptions SET " +
                                 $"OrderNumber = '{CurrentOption.OrderNumID}', " +
                                 $"OptionName = '{CurrentOption.OptionName}', " +
                                 $"OptionDescription = '{CurrentOption.OptionDescription}', " +
                                 $"OptionPrice = '{CurrentOption.Price}' " +
                                 $"WHERE OptionID = {CurrentOption.OptionID};";

                    using (SqlCommand UpdateCommand = new SqlCommand(sql, connection))
                    {
                        UpdateCommand.ExecuteNonQuery();
                    }

                }
                LoadOptionsPackages();
            }
        }
        //Method to create new record
        private void NewButtonOptionRecord_Click(object sender, RoutedEventArgs e)
        {

            if (IsOptionValid())
            {
                errorMessLabel.Content = "";
                string sql;
                //Creates a new list object that inherits properties from CarOrderOptions class and assigns variable to textboxes
                CarOrderOption NewOption = new CarOrderOption();

                NewOption.OptionName = optionNameTextBox.Text;
                NewOption.OptionDescription = optionDescriptionTextBox.Text;
                NewOption.Price = Convert.ToDecimal(optionPriceTextBox.Text);

                using (SqlConnection connection = new SqlConnection())
                {
                    //Open connection
                    //@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=|DataDirectory|\Orders.mdf;Integrated Security=True";
                    connection.ConnectionString =
                    @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\kogie5792\source\repos\FinalAssignment2019\Orders.mdf;Integrated Security=True";
                    connection.Open();

                    sql = $"SELECT MAX(OptionID) FROM CarOrderOptions;";

                    int NewOptionID;
                    using (SqlCommand SelectCommand = new SqlCommand(sql, connection))
                    {
                        NewOptionID = Convert.ToInt32(SelectCommand.ExecuteScalar()) + 1;
                        NewOption.OptionID = NewOptionID;
                    }

                    //Insert new entries into object list
                    sql = $"INSERT INTO CarOrderOptions " +
                          "(OptionID, OrderNumber, OptionName, OptionDescription, OptionPrice) " +
                            "VALUES" +
                      $"( {NewOptionID}, " +
                      $"'{CurrentOrder.OrderNumID}', " +
                      $"'{NewOption.OptionName}', " +
                      $"'{NewOption.OptionDescription}', " +
                      $"'{NewOption.Price}');";

                    using (SqlCommand InsertCommand = new SqlCommand(sql, connection))
                    {
                        InsertCommand.ExecuteNonQuery();
                    }

                    //Update display
                    LoadOptionsPackages();


                    //Select the new item
                    CustomerOrderListBox.SelectedIndex = CurrentSelectedIndex;
                    CustomerOrderListBox.ScrollIntoView(NewOption);
                }

            }

        }
        //Method that deletes selected record
        private void DeleteButtonOptionRecord_Click(object sender, RoutedEventArgs e)
        {
            // Create and open a connection
            using (SqlConnection connection = new SqlConnection())
            {
                //@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=|DataDirectory|\Orders.mdf;Integrated Security=True";
                connection.ConnectionString =
                 @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\kogie5792\source\repos\FinalAssignment2019\Orders.mdf;Integrated Security=True";
                connection.Open();

                //Create a SQL command object
                string sql = $"DELETE From CarOrderOptions WHERE OptionID = {CurrentOption.OptionID}";

                using (SqlCommand myCommand = new SqlCommand(sql, connection))
                {
                    try
                    {
                        myCommand.ExecuteNonQuery();
                    }
                    catch (SqlException ex)
                    {
                        Exception error = new Exception("Error no matching record to delete", ex);
                        throw error;
                    }
                }
            }
            //Update Selected data and remove from index
            int IndexToDelete = CurrentSelectedIndex;
            
            OrdersMade.Remove(CurrentOption); 
            OrderOptionListBox.Items.Remove(CurrentOption); 

            if (IndexToDelete == OrdersMade.Count) 
            {
                CurrentSelectedIndex = OrdersMade.Count - 1; 

            }
            else
            {
                CurrentSelectedIndex = IndexToDelete; 
            }
            
            OrderOptionListBox.SelectedIndex = CurrentSelectedIndex;
        }
    }
}



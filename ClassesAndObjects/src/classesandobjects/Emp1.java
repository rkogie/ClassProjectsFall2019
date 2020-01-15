package classesandobjects;
public class Emp1 {

    int serialNo;
    String name;
    double salary;
    
    public Emp1( String empName, int empNo, double sal){
        
        name = empName;
        serialNo = empNo;
        salary = sal;
    }
  
    public void printEmp(){          
                System.out.println("\nThe name is: "+ name);
                System.out.println("Serial No: "+ serialNo);
                System.out.println("Salary: "+ salary);
            }    
    
  
    
}

package classesandobjects;
import java.util.Scanner;
public class ClassesAndObjects {

    public static void main(String[] args) {
   
        Emp1 employee1 = new Emp1("Sam",103,60000.00);
        //Emp1 employee2 = new Emp1();
        Scanner userIn = new Scanner(System.in);
        
        /*employee1.name = "Larry";
        employee1.serialNo = 1014373;
        employee1.salary = 36475.45;*/
        
        /*System.out.println("Enter your info: ");
        employee2.name = userIn.nextLine();
        employee2.serialNo = userIn.nextInt();
        employee2.salary = userIn.nextDouble();
        */
        
        employee1.printEmp(); //employee2.printEmp();
                
    }   
}

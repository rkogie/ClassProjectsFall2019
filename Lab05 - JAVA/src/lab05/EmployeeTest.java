package lab05;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);
        Scanner userIn2 = new Scanner(System.in);
        System.out.println("Enter enmployee first name, last name & monthy salary:");
        Employee emp1 = new Employee(userIn.nextLine(), userIn.nextLine(), userIn.nextDouble());
        System.out.println("\nEnter second enmployee first name, last name & monthy salary:");
        Employee emp2 = new Employee(userIn2.nextLine(), userIn2.nextLine(), userIn2.nextDouble());
        System.out.printf("Employee 1 yearly salary: $%.2f", emp1.calculateYearly());
        System.out.printf("\tEmployee 2 yearly salary: $%.2f", emp2.calculateYearly());

        System.out.println("\nEmployee salaries with 10% raises: ");
        System.out.printf("Employee 1 with raise: $%.2f ", emp1.raiseSalary());
        System.out.printf("\tEmployee 2 with raise: $%.2f \n", emp2.raiseSalary());
    }
}

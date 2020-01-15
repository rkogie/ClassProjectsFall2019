package lab05;

public class Employee {

    String firstName;
    String lastName;
    double monthlySal;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySal() {
        return monthlySal;
    }

    public void setMonthlySal(double monthlySal) {
        this.monthlySal = monthlySal;
    }

    public Employee(String firstName, String lastName, double monthlySal) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySal < 0) {
            this.monthlySal = 0;
        } else {
            this.monthlySal = monthlySal;
        }
    }
    public double calculateYearly() {
        return monthlySal * 12;
    }

    public double raiseSalary() {
        return (monthlySal * 12) + (monthlySal * 12 * 0.1);
    }

}

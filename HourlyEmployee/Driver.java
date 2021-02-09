package HourlyEmployee;

// My Programming Lab exercise 72029
import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    } // end constructor Employee with 3 parameters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } // end method setFirstName

    public void setLastName(String lastName) {
        this.lastName = lastName;
    } // end method setLastName

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    } // end method setSocialSecurityNumber

    public String getFirstName() {
        return firstName;
    } // end method getFirstName

    public String getLastName() {
        return lastName;
    } // end method getLastName

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber

    public String toString() {
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    } // end method toString
} // end class Employee

class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    } // end constructor HourlyEmployee with five parameters

    public void setHours(double hours) {
        this.hours = hours;
    } // end method setHours

    public void setWage(double wage) {
        this.wage = wage;
    } // end method setWage

    public double getHours() {
        return hours;
    } // end method getHours

    public double getWage() {
        return wage;
    } // end method getWage

    public double getEarnings() {
        return hours * wage;
    } // end method getEarnings

    public String toString() {
        return String.format("hourly employee: %s%n%s: %.1f %n%s: %.2f %n%s: %.2f%n",
            super.toString(),
            "hours", getHours(),
            "wage", getWage(),
            "earnings", getEarnings());
    } // end method toString()
} // end class HourlyEmployee

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter social security number: ");
        String socialSecurityNumber = input.nextLine();

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();
        System.out.print("Enter wage: ");
        double wage = input.nextDouble();

        HourlyEmployee hourlyEmployee = new HourlyEmployee(firstName, lastName, socialSecurityNumber, hours, wage);
        System.out.print(hourlyEmployee);

        input.close();
    } // end method main
} // end class Driver
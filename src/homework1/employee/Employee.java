package homework1.employee;

public class Employee {

    public String name;
    public String surname;
    public double employeeID;

    private String position;
    private String company;
    private double salary;


    public Employee(String name, String surname, double employeeID, String position, String company, double salary) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.position = position;
        this.company = company;
        this.salary = salary;
    }


    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(double employeeID) {
        this.employeeID = employeeID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
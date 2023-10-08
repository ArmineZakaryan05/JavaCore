package homework1.employee;

import java.util.Scanner;

class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("Place input 0 for EXIT");
            System.out.println("Place input 1 for add employee");
            System.out.println("Place input 2 for all employee");
            System.out.println("Place input 3 for search employee by employee id");
            System.out.println("Place input 4 for search employee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname");
                    String surname = scanner.nextLine();
                    System.out.println("Pleace input employeeID");
                    int employeeID = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input employee position ");
                    String position = scanner.nextLine();
                    System.out.println("Please input company ");
                    String company = scanner.nextLine();
                    System.out.println("Please input employee salary ");
                    double salary = Double.parseDouble(scanner.nextLine());
                     Employee employee = new Employee(name, surname, employeeID, position, company, salary);
                    employeeStorage.add(employee);
                    System.out.println("Employee created!");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Pleace input ID");
                    int ID = Integer.parseInt(scanner.nextLine());
                    employeeStorage.search(ID);
                    break;
                case "4":
                    System.out.println("Pleace input company");
                    String Company = scanner.nextLine();
                    employeeStorage.search(Company);
                    break;
               default:
                   System.out.println("Invalid command. Try again");
            }
        }
    }
}

package homework1.employee;



class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size;
    private String Company;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeID() + " " + employees[i].getPosition()
                    + " " + employees[i].getCompany() + " " + employees[i].getSalary());


        }
    }

    public void search(int ID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID() == ID) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeID() + " " + employees[i].getPosition()
                        + " " + employees[i].getCompany() + " " + employees[i].getSalary());
            }
        }
    }

    

    public void search(String Company) {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeID() + " " + employees[i].getPosition()
                    + " " + employees[i].getCompany() + " " + employees[i].getSalary());
        }
    }


    private void extend(){
        Employee[] tmp = new Employee[ employees.length + 10];
        System.arraycopy(employees,0, tmp, 0, employees.length);
        employees = tmp;
    }
}

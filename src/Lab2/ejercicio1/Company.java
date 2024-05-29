package Lab2.ejercicio1;

public class Company {

    private String name;
    private Employee[] employees;
    private int numberOfEmployees;
    private static Company instance = null;

    private Company(String name, int size) {
        this.name = name;
        this.employees = new Employee[size];
        this.numberOfEmployees = 0;
    }

    public static Company getInstance(String name, int size) {
        if (instance == null) {
            instance = new Company(name, size);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void displayEmployees() {
        for (int i = 0; i < numberOfEmployees; i++) {
            employees[i].display();
        }
    }
    public void addEmployee(Employee employee) {
        employees[numberOfEmployees++] = employee;
    }

    public int searchName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee.getId();
            }
        }
        return -1;
    }

    public void deleteEmployee(String name) {
        for (int i = 0; i < numberOfEmployees; i++) {
            if (employees[i].getName().equalsIgnoreCase(name)) {
                employees[i] = null;
            }
        }
    }

    public double getYearlyPayment(String name) {
        int index = searchName(name);
        return index != -1 ? employees[index].calculatePayment() * 12: 0;
    }

    public double calculateAveragePaymentForPartTime() {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmployee) {
                sum += employee.calculatePayment();
                count++;
            }
        }
        return sum / count;
    }
}

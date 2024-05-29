package Lab2.ejercicio1;

public class FullTimeEmployee extends Employee {

    private int salary;

    public FullTimeEmployee(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
        Company company = Company.getInstance("Tech Solutions", 10); // Asegúrate de que el nombre y tamaño sean adecuados
        company.addEmployee(this);
    }

    public FullTimeEmployee(FullTimeEmployee fullTimeEmployee) {
        super(fullTimeEmployee);
        Company company = Company.getInstance("Tech Solutions", 10); // Asegúrate de que el nombre y tamaño sean adecuados
        company.addEmployee(this);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + getSalary());
    }

    @Override
    public double calculatePayment() {
        return getSalary();
    }
}

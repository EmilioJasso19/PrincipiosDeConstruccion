package Lab2.ejercicio1;

public class PartTimeEmployee extends Employee {
    private int workHours;
    private int rate;

    public PartTimeEmployee(String name, int id, int workHours, int rate) {
        super(name, id);
        this.workHours = workHours;
        this.rate = rate;
        Company company = Company.getInstance("Tech Solutions", 10);
        company.addEmployee(this);
    }

    public PartTimeEmployee(PartTimeEmployee partTimeEmployee) {
        super(partTimeEmployee);
        Company company = Company.getInstance("Tech Solutions", 10); // Asegúrate de que el nombre y tamaño sean adecuados
        company.addEmployee(this);
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Work Hours: " + getWorkHours());
        System.out.println("Rate: " + getRate());
    }

    @Override
    public double calculatePayment() {
        return getRate() * getWorkHours();
    }
}

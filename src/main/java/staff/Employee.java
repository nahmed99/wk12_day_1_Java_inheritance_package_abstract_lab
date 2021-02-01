package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        salary += raise;
    }

    public double payBonus() {
        return salary / 100;
    }

}
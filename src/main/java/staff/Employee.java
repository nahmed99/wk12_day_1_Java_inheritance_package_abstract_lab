package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        // Requirements asked to ensure that new name is not
        // null...checking for it (not) being empty either.
        // The check for null needs to be first - otherwise
        // you will get a null pointer exception!!!

        if (newName != null && !newName.isEmpty())
            this.name = newName;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        if (raise >= 0.00)
            salary += raise;
    }

    public double payBonus() {
        // Raise (not really a) bonus by 1%...must be civil servants!
        return salary / 100;
    }

}

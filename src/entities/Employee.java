package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return tax - grossSalary;
    }

    public void increaseSalary(double percentage) {
        
    }
}

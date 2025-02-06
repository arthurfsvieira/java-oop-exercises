package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Enter the employee data:");
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee.name + ", " + employee.netSalary());

        System.out.print("Wich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);


        sc.close();
    }
}

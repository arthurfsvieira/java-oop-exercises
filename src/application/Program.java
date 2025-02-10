package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Enter student name: ");
        student.name = sc.nextLine();
        System.out.println("Enter student's grade: ");
        student.firstGrade = sc.nextDouble();
        student.secondGrade = sc.nextDouble();
        student.thirdGrade = sc.nextDouble();

        System.out.println("Final grade = " + student.finalGrade());

        if (student.finalGrade() > 60) {
            System.out.print("PASS");
        } else {
            System.out.println("FAILED");
            System.out.print("Missing points: " + student.missingPoints() + " points.");
        }

        sc.close();
    }
}

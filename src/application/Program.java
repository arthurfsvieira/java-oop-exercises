package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rec = new Rectangle();
        System.out.println("Enter the rectangle width and height:");
        rec.width = sc.nextDouble();
        rec.height = sc.nextDouble();

        System.out.println("Area = " + rec.area());
        System.out.println("Perimeter = " + rec.perimeter());
        System.out.println("Diagonal = " + rec.diagonal());


        sc.close();
    }
}

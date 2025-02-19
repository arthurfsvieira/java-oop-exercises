package application;

import entities.Account;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        String accountName = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)? ");
        String answer = sc.nextLine();
        if (answer == "y") {
            System.out.print("Enter initial deposit value: ");
            double balance = sc.nextDouble();
        } else {
           double balance = 0;
        }

        System.out.println(accountName, accountNumber, balance); //What?


        sc.close();
    }
}

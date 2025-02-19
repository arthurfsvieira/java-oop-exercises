package application;

import entities.Account;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account();
        System.out.print("Enter account number: ");
        acc.setAccountHolder();

        sc.close();
    }
}

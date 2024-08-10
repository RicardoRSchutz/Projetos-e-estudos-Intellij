package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Rent[] vect = new Rent[16];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #"+ i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int number = sc.nextInt();

            vect[number] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 16; i++) {
            System.out.println(vect[i]);
        }


        sc.close();
    }
}

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Products[] vect = new Products[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.next();
            double price = sc.nextDouble();
            vect[i] = new Products(name, price);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {

            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("Average Price: %.2f%n", avg);

        sc.close();
    }
}

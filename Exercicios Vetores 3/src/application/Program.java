package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitados? ");
        int n = sc.nextInt();

        int[] pessoas = new int[n];
        for (int i = 0; i < n; i++) {
            pessoas[i] = sc.nextInt();

        }


    }
}

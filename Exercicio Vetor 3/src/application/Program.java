package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitados? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            System.out.println();
        }
        double somaAltura = 0;
        for (int i = 0; i < n; i++) {
            somaAltura += alturas[i];
        }
        double alturaMedia = somaAltura / n;
        System.out.println();
        System.out.printf("Altura média: %.2f%n", alturaMedia);

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16){
            cont = cont + 1;
           }
        }
        double percentual = cont * 100 / n;
        System.out.printf("%.2f%%%n", percentual);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}

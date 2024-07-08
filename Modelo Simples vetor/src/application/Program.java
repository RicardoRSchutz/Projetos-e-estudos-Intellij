package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] vetor = new double[N];

        for (int i = 0; i < N; i++) {
            vetor[i] = sc.nextInt();
        }
        double soma = 0;
        for (int i = 0; i < N; i++) {
            soma += vetor[i];
        }
        double media = soma / N;

        System.out.printf("MEDIA: %.2f\n", media);
        }
    }

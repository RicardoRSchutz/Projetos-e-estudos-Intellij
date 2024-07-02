package application;

import entities.Conta;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o numero da sua conta: ");
        int num = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = sc.nextLine();

        System.out.print("Pretende fazer um depósito inicial (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Digite o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(num, titular, depositoInicial);
        } else {
            conta = new Conta(num, titular);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);



        System.out.println("Entre com o valor a ser depositado: ");
        double valor = sc.nextDouble();

        System.out.println("Entre com o valor a ser sacado: ");
        double valorSacado = sc.nextDouble();
        sc.close();
    }
}

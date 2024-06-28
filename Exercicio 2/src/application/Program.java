package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee empregado = new Employee();
        System.out.println("Digite o nome do empregado, Salario Bruto e taxa: ");
        System.out.print("Nome: ");
        empregado.nome = sc.nextLine();

        System.out.print("Salario Bruto: ");
        empregado.salarioBruto = sc.nextDouble();

        System.out.print("Taxa: ");
        empregado.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado: " + empregado);
        System.out.println();

        System.out.println("Percentual salarial que sera aumentado: ");
        double percentage = sc.nextDouble();
        empregado.salarioAumento(percentage);

        System.out.println();
        System.out.println("Updated data: " + empregado);
        sc.close();
    }
}

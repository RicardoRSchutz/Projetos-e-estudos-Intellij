package application;

import entities.Notas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Notas notas = new Notas();
        System.out.println("Digite o nome do aluno,nota1, nota2, nota3: ");
        System.out.print("Nome: ");
        notas.nome = sc.nextLine();

        System.out.print("Nota1: ");
        notas.nota1 = sc.nextDouble();

        System.out.print("Nota2: ");
        notas.nota2 = sc.nextDouble();

        System.out.print("Nota3: ");
        notas.nota3 = sc.nextDouble();

        System.out.println("Pontuação final: "+ notas.finalGrade());
        System.out.println(notas.Aprovado());

        sc.close();
    }
}

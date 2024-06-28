package application;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Digite a largura do retangulo: ");
        System.out.print("Largura: ");
        retangulo.largura = sc.nextDouble();
        System.out.print("Altura: ");
        retangulo.altura = sc.nextDouble();

        System.out.println("Area do retangulo: "+retangulo.area());
        System.out.println("Perimetro: "+retangulo.perimetro());
        System.out.println("Diagonal: "+retangulo.diagonal());


        sc.close();

        }
    }
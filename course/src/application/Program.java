package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Entre com dados do produto: ");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade: ");
        product.quantity = sc.nextInt();

        System.out.println("Dados do produto: "+ product);

        System.out.println("Entre com o numero de produtos que sera adicionado ao estoque:");
        int quantity = sc.nextInt();
        product.addProduct(quantity);
        System.out.println("Dados atualizados: "+ product);

        System.out.println("Entre com o numero de produtos que sera removido no estoque:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.println("Dados atualizados: "+ product);

        sc.close();
    }
}

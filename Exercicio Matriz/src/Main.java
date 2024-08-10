import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para a matriz: ");

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite a posição "+ i + ", "+j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
            }


        sc.close();
    }
}
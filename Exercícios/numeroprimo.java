import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int checarNumero = scanner.nextInt();
        int contador = 0;

        for (int i = 1; i <= checarNumero; i++) {
            if (checarNumero % i == 0) {
                contador++;
            }
        }

        if (contador > 2) {
            System.out.println("O número " + checarNumero + " não é primo!");
        } else {
            System.out.println("O número " + checarNumero + " é primo!");
        }

        scanner.close();
    }
}
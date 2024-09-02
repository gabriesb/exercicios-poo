import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nInsira um número: ");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado >= 12 && numeroDigitado <= 20) {
                System.out.println("\n" + numeroDigitado);
            } else {
                System.out.println("\nEntrada inválida");
            }
        }
    }
}
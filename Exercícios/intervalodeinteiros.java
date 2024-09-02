import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número que determine o início do intervalo: ");
        int inicioIntervalo = scanner.nextInt();

        System.out.print("\nInsira um número que determine o final do intervalo: ");
        int finalIntervalo = scanner.nextInt();

        System.out.print("\nInsira um número para checar este intervalo: ");
        int numeroDigitado = scanner.nextInt();

        if (numeroDigitado >= inicioIntervalo && numeroDigitado <= finalIntervalo) {
            System.out.println("\nO número " + numeroDigitado + " consta no intervalo!");
        } else {
            System.out.println("\nO número " + numeroDigitado + " não consta no intervalo!");
        }
    }
}
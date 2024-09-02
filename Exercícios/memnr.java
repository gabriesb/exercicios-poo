import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];
        int maior, menor;

        System.out.print("Digite o primeiro número: ");
        numeros[0] = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        numeros[1] = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        numeros[2] = scanner.nextInt();

        System.out.println();

        maior = numeros[0];
        menor = numeros[0];

        for (int i = 1; i < 3; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);
    }
}
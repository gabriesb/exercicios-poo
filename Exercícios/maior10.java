import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] numeros = new float[10];
        float maior, menor, media;

        // Leitura dos números
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o valor dos números: ");
            numeros[i] = scanner.nextFloat();
        }

        // Inicializando maior e menor com o primeiro número do array
        maior = numeros[0];
        menor = numeros[0];

        // Determinando o maior e menor número
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Calculando a média entre o maior e o menor número
        media = (maior + menor) / 2;

        // Saída dos resultados
        System.out.println("\nO maior número é: " + String.format("%.1f", maior));
        System.out.println("O menor número é: " + String.format("%.1f", menor));
        System.out.println("A média desses números é: " + String.format("%.1f", media));
    }
}
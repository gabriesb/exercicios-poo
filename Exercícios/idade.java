import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, totalPessoas = 0, somaIdades = 0;
        int menorIdade = 0, maiorIdade = 0;

        System.out.println("Digite as idades (0 para terminar):");

        while (true) {
            idade = scanner.nextInt();

            if (idade == 0) {
                break;
            }

            if (totalPessoas == 0) {
                menorIdade = maiorIdade = idade;
            } else {
                if (idade < menorIdade) {
                    menorIdade = idade;
                }
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
            }

            somaIdades += idade;
            totalPessoas++;
        }

        if (totalPessoas > 0) {
            float mediaIdade = (float) somaIdades / totalPessoas;
            System.out.println("\nNúmero de pessoas: " + totalPessoas);
            System.out.printf("Idade média: %.2f\n", mediaIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Maior idade: " + maiorIdade);
        } else {
            System.out.println("Insira uma idade válida!");
        }
    }
}
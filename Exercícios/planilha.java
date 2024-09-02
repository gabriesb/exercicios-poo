import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de Alunos: ");
        int qtdAlunos = scanner.nextInt();
        int qtdNotas = 4;

        float[][] planilha = new float[qtdAlunos][qtdNotas];
        boolean[] av3_aplicada = new boolean[qtdAlunos];

        for (int aluno = 0; aluno < qtdAlunos; aluno++) {
            System.out.println("\nAluno " + (aluno + 1) + ":");
            System.out.print("Insira a nota da AV1: ");
            planilha[aluno][0] = scanner.nextFloat();
            System.out.print("Insira a nota da AV2: ");
            planilha[aluno][1] = scanner.nextFloat();

            float media = (planilha[aluno][0] + planilha[aluno][1]) / 2.0f;

            if (media >= 6) {
                System.out.print("Média " + String.format("%.2f", media) + ". Insira a nota da AV3 para o Aluno " + (aluno + 1) + ": ");
                planilha[aluno][2] = scanner.nextFloat();
                av3_aplicada[aluno] = true;
            } else {
                planilha[aluno][2] = 0;
                av3_aplicada[aluno] = false;
            }
        }

        for (int aluno = 0; aluno < qtdAlunos; aluno++) {
            planilha[aluno][3] = (planilha[aluno][0] + planilha[aluno][1] + planilha[aluno][2]) / 3.0f;
        }

        System.out.println("\nPlanilha de Notas:");
        for (int aluno = 0; aluno < qtdAlunos; aluno++) {
            System.out.print("Aluno " + (aluno + 1) + ": AV1: " + String.format("%.2f", planilha[aluno][0])
                + ", AV2: " + String.format("%.2f", planilha[aluno][1]));
            if (av3_aplicada[aluno]) {
                System.out.print(", AV3: " + String.format("%.2f", planilha[aluno][2]));
            } else {
                System.out.print(", AV3: Não aplicada");
            }
            System.out.print(", Média Geral: " + String.format("%.2f", planilha[aluno][3]));

            if (planilha[aluno][3] >= 4.0) {
                System.out.println(" - Aprovado");
            } else {
                System.out.println(" - Reprovado");
            }
        }

        scanner.close();
    }
}
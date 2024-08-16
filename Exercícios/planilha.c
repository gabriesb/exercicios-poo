#include <locale.h>
#include <stdio.h>

int main()
{
    setlocale(LC_ALL, "pt_BR");

    int qtdAlunos, qtdNotas = 4;

    printf("Quantidade de Alunos: ");
    scanf("%d", &qtdAlunos);

    float planilha[qtdAlunos][qtdNotas];
    int av3_aplicada[qtdAlunos];

    for (int aluno = 0; aluno < qtdAlunos; aluno++)
    {
        printf("\nAluno %d:\n", aluno + 1);
        printf("Insira a nota da AV1: ");
        scanf("%f", &planilha[aluno][0]);
        printf("Insira a nota da AV2: ");
        scanf("%f", &planilha[aluno][1]);

        float media = (planilha[aluno][0] + planilha[aluno][1]) / 2.0;

        if (media >= 6)
        {
            printf("Média %.2f. Insira a nota da AV3 para o Aluno %d: ", media, aluno + 1);
            scanf("%f", &planilha[aluno][2]);
            av3_aplicada[aluno] = 1;
        }
        else
        {
            planilha[aluno][2] = 0;
            av3_aplicada[aluno] = 0;
        }
    }

    for (int aluno = 0; aluno < qtdAlunos; aluno++)
    {
        planilha[aluno][3] = (planilha[aluno][0] + planilha[aluno][1] + planilha[aluno][2]) / 3.0;
    }

    printf("\nPlanilha de Notas:\n");
    for (int aluno = 0; aluno < qtdAlunos; aluno++)
    {
        printf("Aluno %d: AV1: %.2f, AV2: %.2f", aluno + 1, planilha[aluno][0], planilha[aluno][1]);
        if (av3_aplicada[aluno])
        {
            printf(", AV3: %.2f", planilha[aluno][2]);
        }
        else
        {
            printf(", AV3: Não aplicada");
        }
        printf(", Média Geral: %.2f", planilha[aluno][3]);

        if (planilha[aluno][3] >= 4.0)
        {
            printf(" - Aprovado\n");
        }
        else
        {
            printf(" - Reprovado\n");
        }
    }

    return 0;
}

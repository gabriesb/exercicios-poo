#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "pt-br");
    int idade, totalPessoas = 0, somaIdades = 0;
    int menorIdade = 0, maiorIdade = 0;

    printf("Digite as idades (0 para terminar): \n");

    while (1)
    {
        scanf("%d", &idade);

        if (idade == 0)
        {
            break;
        }

        if (totalPessoas == 0)
        {
            menorIdade = maiorIdade = idade;
        }
        else
        {
            if (idade < menorIdade)
            {
                menorIdade = idade;
            }
            if (idade > maiorIdade)
            {
                maiorIdade = idade;
            }
        }

        somaIdades += idade;
        totalPessoas++;
    }

    if (totalPessoas > 0)
    {
        float mediaIdade = (float)somaIdades / totalPessoas;
        printf("\nNúmero de pessoas: %d\n", totalPessoas);
        printf("Idade média: %.2f\n", mediaIdade);
        printf("Menor idade: %d\n", menorIdade);
        printf("Maior idade: %d\n", maiorIdade);
    }
    else
    {
        printf("Insira uma idade válida!\n");
    }

    return 0;
}

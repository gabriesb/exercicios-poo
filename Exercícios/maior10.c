#include <stdio.h>
#include <locale.h>

int main()
{

    float numeros[10];
    float maior = 0, menor = 0, media = 0;

    for (int i = 0; i < 10; i++)
    {
        printf("Insira o valor dos números: ");
        scanf("%f", &numeros[i]);
    }

    for (int i = 0; i < 10; i++)
    {
        maior = numeros[0];
        menor = numeros[0];

        if (maior < numeros[i])
        {
            maior = numeros[i];
        }
        if (menor > numeros[i])
        {
            menor = numeros[i];
        }
    }

    for (int i = 0; i < 10; i++)
    {
        media = (maior + menor) / 2;
    }

    printf("\n");

    printf("O maior número é: %.1f", maior);
    printf("\nO menor número é: %.1f", menor);
    printf("\nA média desses números é: %.1f", media);

    return 0;
}
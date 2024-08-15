#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "pt-br");

    int numeros[3];
    int maior, menor;

    printf("Digite o primeiro número: ");
    scanf("%d", &numeros[0]);

    printf("Digite o segundo número: ");
    scanf("%d", &numeros[1]);

    printf("Digite o terceiro número: ");
    scanf("%d", &numeros[2]);

    printf("\n");

    maior = numeros[0];
    menor = numeros[0];

    for (int i = 1; i < 3; i++)
    {
        if (numeros[i] > maior)
        {
            maior = numeros[i];
        }
        if (numeros[i] < menor)
        {
            menor = numeros[i];
        }
    }

    printf("O menor número é: %d\n", menor);
    printf("O maior número é: %d\n", maior);

    return 0;
}

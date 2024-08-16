#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, ("pt-br"));

    int checar_numero, contador = 0;

    printf("Insira um número inteiro: ");
    scanf("%d", &checar_numero);

    for (int i = 1; i <= checar_numero; i++)
    {
        if (checar_numero % i == 0)
        {
            contador++;
        }
    }

    for (int i = 1; i <= checar_numero; i++)
    {
        if (contador > 2)
        {
            printf("O número %d, não é primo!", checar_numero);
            break;
        }
        else
        {
            printf("O número %d, é primo!", checar_numero);
            break;
        }
    }

    return 0;
}

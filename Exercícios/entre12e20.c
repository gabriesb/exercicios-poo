#include <stdio.h>
#include <locale.h>
#include <stdbool.h>

int main()
{
    setlocale(LC_ALL, ("pt-br"));

    int numero_digitado;

    while (true)
    {
        printf("\nInsira um número: ");
        scanf("%d", &numero_digitado);

        if (numero_digitado >= 12 && numero_digitado <= 20)
        {
            printf("\n%d\n", numero_digitado);
        }
        else
        {
            printf("\nentrada inválida\n");
        }
    }

    return 0;
}

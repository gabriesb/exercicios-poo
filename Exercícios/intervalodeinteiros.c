#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, ("pt-br"));

    int numero_digitado, inicio_intervalo, final_intervalo;

    printf("Insira um número que determine o início do intervalo: ");
    scanf("%d", &inicio_intervalo);

    printf("\nInsira um número que determine o final do intervalo: ");
    scanf("%d", &final_intervalo);

    printf("\nInsira um número para checar este intervalo: ");
    scanf("%d", &numero_digitado);

    if (numero_digitado >= inicio_intervalo && numero_digitado <= final_intervalo)
    {
        printf("\nO número %d consta no intervalo!", numero_digitado);
    }
    else
    {
        printf("\nO número %d não consta no intervalo!", numero_digitado);
    }

    return 0;
}

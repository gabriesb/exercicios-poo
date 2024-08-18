#include <stdio.h>
#include <locale.h>

int checarTriangulo(int lado_a, int lado_b, int lado_c)
{

    if ((lado_a < lado_b + lado_c && lado_b < lado_a + lado_c && lado_c < lado_a + lado_b) && (lado_a > 0 && lado_b > 0 && lado_c > 0))
    {
        printf("É um triângulo!\n");
        tipagemTriangulo(lado_a, lado_b, lado_c);
    }
    else
    {
        printf("Não é um triângulo...\n");
    }
}

int tipagemTriangulo(int lado_a, int lado_b, int lado_c)
{
    if (lado_a == lado_b && lado_b == lado_c)
    {
        printf("Triângulo equilátero, todos os lados iguais.\n");
    }
    else if (lado_a == lado_b || lado_b == lado_c || lado_a == lado_c)
    {
        printf("Triângulo isósceles, dois lados iguais.\n");
    }
    else
    {
        printf("Triângulo escaleno, todos os lados diferentes.\n");
    }
}

int main()
{
    setlocale(LC_ALL, "pt-br");

    int cateto_oposto, cateto_adjacente, hipotenusa;

    printf("Insira as medidas do triângulo: ");
    scanf("%d %d %d", &cateto_oposto, &cateto_adjacente, &hipotenusa);

    checarTriangulo(cateto_oposto, cateto_adjacente, hipotenusa);

    return 0;
}

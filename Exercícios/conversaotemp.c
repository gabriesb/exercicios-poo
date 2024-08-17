#include <stdio.h>
#include <locale.h>

double c_to_k(double c) { return c + 273.15; }
double k_to_c(double k) { return k - 273.15; }
double c_to_f(double c) { return c * 1.8 + 32; }
double f_to_c(double f) { return (f - 32) / 1.8; }
double k_to_f(double k) { return 1.8 * (k - 273.15) + 32; }

int main()
{

    setlocale(LC_ALL, ("pt-br"));

    double temp_in, temp_out;
    char escala_in, escala_out;

    printf("Digite a temperatura e a escala atual (C, F, K): ");
    scanf("%lf %c", &temp_in, &escala_in);

    printf("Digite a escala para qual deseja converter (C, F, K): ");
    scanf(" %c", &escala_out);

    if (escala_in == 'C' || escala_in == 'c')
    {
        if (escala_out == 'F' || escala_out == 'f')
        {
            temp_out = c_to_f(temp_in);
        }
        else if (escala_out == 'K' || escala_out == 'k')
        {
            temp_out = c_to_k(temp_in);
        }
        else
        {
            printf("Conversão inválida.\n");
            return 1;
        }
    }
    else if (escala_in == 'F' || escala_in == 'f')
    {
        if (escala_out == 'C' || escala_out == 'c')
        {
            temp_out = f_to_c(temp_in);
        }
        else if (escala_out == 'K' || escala_out == 'k')
        {
            double temp_c = f_to_c(temp_in);
            temp_out = c_to_k(temp_c);
        }
        else
        {
            printf("Conversão inválida.\n");
            return 1;
        }
    }
    else if (escala_in == 'K' || escala_in == 'k')
    {
        if (escala_out == 'C' || escala_out == 'c')
        {
            temp_out = k_to_c(temp_in);
        }
        else if (escala_out == 'F' || escala_out == 'f')
        {
            temp_out = k_to_f(temp_in);
        }
        else
        {
            printf("Conversão inválida.\n");
            return 1;
        }
    }
    else
    {
        printf("Escala de entrada inválida.\n");
        return 1;
    }

    printf("A temperatura convertida é: %.2f %c\n", temp_out, escala_out);

    return 0;
}

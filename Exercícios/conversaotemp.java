import java.util.Scanner;

public class TemperatureConverter {

    public static double cToK(double c) {
        return c + 273.15;
    }

    public static double kToC(double k) {
        return k - 273.15;
    }

    public static double cToF(double c) {
        return c * 1.8 + 32;
    }

    public static double fToC(double f) {
        return (f - 32) / 1.8;
    }

    public static double kToF(double k) {
        return 1.8 * (k - 273.15) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura e a escala atual (C, F, K): ");
        double tempIn = scanner.nextDouble();
        char escalaIn = scanner.next().charAt(0);

        System.out.print("Digite a escala para qual deseja converter (C, F, K): ");
        char escalaOut = scanner.next().charAt(0);

        double tempOut;

        if (escalaIn == 'C' || escalaIn == 'c') {
            if (escalaOut == 'F' || escalaOut == 'f') {
                tempOut = cToF(tempIn);
            } else if (escalaOut == 'K' || escalaOut == 'k') {
                tempOut = cToK(tempIn);
            } else {
                System.out.println("Conversão inválida.");
                return;
            }
        } else if (escalaIn == 'F' || escalaIn == 'f') {
            if (escalaOut == 'C' || escalaOut == 'c') {
                tempOut = fToC(tempIn);
            } else if (escalaOut == 'K' || escalaOut == 'k') {
                double tempC = fToC(tempIn);
                tempOut = cToK(tempC);
            } else {
                System.out.println("Conversão inválida.");
                return;
            }
        } else if (escalaIn == 'K' || escalaIn == 'k') {
            if (escalaOut == 'C' || escalaOut == 'c') {
                tempOut = kToC(tempIn);
            } else if (escalaOut == 'F' || escalaOut == 'f') {
                tempOut = kToF(tempIn);
            } else {
                System.out.println("Conversão inválida.");
                return;
            }
        } else {
            System.out.println("Escala de entrada inválida.");
            return;
        }

        System.out.printf("A temperatura convertida é: %.2f %c%n", tempOut, escalaOut);
    }
}
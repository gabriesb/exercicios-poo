import java.util.Scanner;

public class Triangulo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as medidas do triângulo:");
        System.out.print("Primeiro lado: ");
        int ladoA = scanner.nextInt();
        System.out.print("Segundo lado: ");
        int ladoB = scanner.nextInt();
        System.out.print("Terceiro lado: ");
        int ladoC = scanner.nextInt();

        checarTriangulo(ladoA, ladoB, ladoC);
    }

    public static void checarTriangulo(int ladoA, int ladoB, int ladoC) {
        if ((ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) && (ladoA > 0 && ladoB > 0 && ladoC > 0)) {
            System.out.println("É um triângulo!");
            tipagemTriangulo(ladoA, ladoB, ladoC);
        } else {
            System.out.println("Não é um triângulo...");
        }
    }

    public static void tipagemTriangulo(int ladoA, int ladoB, int ladoC) {
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Triângulo equilátero, todos os lados iguais.");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            System.out.println("Triângulo isósceles, dois lados iguais.");
        } else {
            System.out.println("Triângulo escaleno, todos os lados diferentes.");
        }
    }
}
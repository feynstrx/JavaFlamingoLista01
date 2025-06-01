package javaLista01;
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite a altura do retângulo: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Valor inválido! Por favor, digite um número.");
                return;
            }
            double altura = sc.nextDouble();

            System.out.print("Digite a largura do retângulo: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Valor inválido! Por favor, digite um número.");
                return;
            }
            double largura = sc.nextDouble();

            double resultado = altura * largura;
            System.out.printf("A área do retângulo é: %.2f\n", resultado);
        } finally {
            sc.close();
        }
    }
}

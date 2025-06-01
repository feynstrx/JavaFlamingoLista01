package javaLista01;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um valor: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Valor inválido! Por favor, digite um número.");
                return;
            }
            double numero1 = sc.nextDouble();

            System.out.print("Digite outro valor: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Valor inválido! Por favor, digite um número.");
                return;
            }
            double numero2 = sc.nextDouble();

            if (numero2 == 0) {
                System.out.println("Erro: Não é possível dividir por zero.");
                return;
            }

            double resultado = numero1 / numero2;
            System.out.printf("O resultado é: %.2f\n", resultado);
        } finally {
            sc.close();
        }
    }
}

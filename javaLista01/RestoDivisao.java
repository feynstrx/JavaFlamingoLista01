package javaLista01;
import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um valor: ");
        float numero1 = sc.nextFloat();

        System.out.println("outro valor: ");
        float numero2 = sc.nextFloat();

        float resto = numero1 % numero2;

        System.out.println("O resto da divisão " + numero1 + " por " + numero2 + " é de: " + resto);

        sc.close();

    }

}
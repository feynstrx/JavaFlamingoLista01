package javaLista01;
import java.util.Scanner;

public class Soma {
    public static void main (String[]arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite mais um valor: ");
        int numero2 = sc.nextInt();
        int resultado = numero1 + numero2;

        System.out.println("O resultado é: " + resultado);
        sc.close();
    }

}
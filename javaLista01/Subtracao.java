package javaLista01;
import java.util.Scanner;

public class Subtracao {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int numero1 = sc.nextInt();

        System.out.println("Insira outro valor: ");
        int numero2 = sc.nextInt();
        int resultado = numero1 - numero2;

        System.out.println("O resultado da subtração é: " + resultado);
        sc.close();
    }
}
package javaLista01;
import java.util.Scanner;

public class Temperatura {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("O resultado é: " + fahrenheit);

        sc.close();
    }
}

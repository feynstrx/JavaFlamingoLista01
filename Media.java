package javaLista01;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float numero1 = sc.nextFloat();
        System.out.print("Digite o segundo valor: ");
        float numero2 = sc.nextFloat();
        System.out.print("Digite o terceiro valor: ");
        float numero3 = sc.nextFloat();

        float resultado = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média dos valores é: " + resultado);

        sc.close();
    }
}
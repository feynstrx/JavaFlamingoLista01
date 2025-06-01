package javaLista01;
import java.util.Scanner;

public class PerimetroCirculo {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        float raio = sc.nextFloat();

        float perimetro = 2 * 3.14f * raio;

        System.out.println("O perímetro do círculo é: " + perimetro);

        sc.close();

    }
}

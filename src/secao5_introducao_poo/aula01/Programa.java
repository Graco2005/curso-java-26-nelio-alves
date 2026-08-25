package secao5_introducao_poo.aula01;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as medidas do triângulo X: ");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y: ");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();

        double p = (x.ladoA + x.ladoB + x.ladoC) / 2.0;
        double areaX = Math.sqrt(p * (p - x.ladoA) * (p - x.ladoB) * (p - x.ladoC));

        p = (y.ladoA + y.ladoB + y.ladoC) / 2.0;
        double areaY = Math.sqrt(p * (p - y.ladoA) * (p - y.ladoB) * (p - y.ladoC));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) System.out.println("Maior área: X");
        else System.out.println("Maior área: Y");

        sc.close();
    }
}

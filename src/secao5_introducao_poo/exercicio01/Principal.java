package secao5_introducao_poo.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.print("Digite a altura do retângulo: ");
        retangulo.altura = sc.nextDouble();

        System.out.print("Digite a largura do retângulo: ");
        retangulo.largura = sc.nextDouble();

        System.out.println();
        System.out.println(retangulo);

        System.out.println();
        System.out.printf("Area do retângulo: %.2f%n", retangulo.areaRetangulo());
        System.out.printf("Perímetro do retângulo: %.2f%n", retangulo.perimetroRetangulo());
        System.out.printf("Diagonal do retângulo: %.2f%n", retangulo.diagonalRetangulo());
    }
}

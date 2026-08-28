package secao5_introducao_poo.aula03;
// Membros estáticos (static)

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    // A palavra 'final' tem a função de atribuir um valor constante para PI (PI é uma constante)
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Coloque o raio: ");
        double raio = sc.nextDouble();

        double c = Calculadora.circunferencia(raio);
        double v = Calculadora.volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculadora.PI);

        sc.close();
    }

    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4 * PI * raio * raio * raio / 3.0;
    }
}

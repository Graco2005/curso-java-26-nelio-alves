package secao3_estruturas_repetitivas;
// Estrutura repetitiva faça-enquanto (do-while)

import java.util.Locale;
import java.util.Scanner;

public class Aula03 {

    public static void celsiusFahrenheit(double celsius) {

        double fahrenheit;
        fahrenheit = 9 * celsius / 5 + 32;

        System.out.printf("Equivalente em fahrenheit: %.1f%n", fahrenheit);
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double temp_celsius;
        char resposta;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            temp_celsius = sc.nextDouble();

            celsiusFahrenheit(temp_celsius);

            System.out.print("Deseja repetir (s/n): ");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');
    }
}

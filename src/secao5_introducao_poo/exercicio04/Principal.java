package secao5_introducao_poo.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conversor conversor = new Conversor();

        System.out.print("Qual é o preço do dólar: ");
        conversor.precoDolar = sc.nextDouble();

        System.out.print("Quantos dólares deseja comprar: ");
        conversor.qtdDolaresComprar = sc.nextDouble();

        conversor.converterDolarReal();
    }
}

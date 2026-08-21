package secao2_estrutura_condicional;
// Operadores de atribuição acumulativa

import java.util.Locale;
import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int min, min_excedidos;
        double valor;

        valor = 50.00;

        System.out.print("Digite a quantidade de minutos que você usou em chamadas: ");
        min = sc.nextInt();

        if (min <= 100) System.out.println("Valor a pagar: R$ " + valor);
        else {
            min_excedidos = min - 100;
            valor += min_excedidos * 2.00;

            System.out.printf("Valor a pagar: R$ %.2f%n", valor);
        }
        sc.close();
    }
}

package secao7_comportamento_memoria_array_listas;
// Vetores

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Aula01 {
    void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro n: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor da " + (i + 1) + "a posição do vetor: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double media = sum / n;
        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
}

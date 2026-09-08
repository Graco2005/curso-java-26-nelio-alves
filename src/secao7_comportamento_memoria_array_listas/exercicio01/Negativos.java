package secao7_comportamento_memoria_array_listas.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 0 e menor ou igual que 10: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        if (n > 0 && n <= 10) {
            for (int i = 0; i < vect.length; i++) {
                System.out.print("Digite o " + (i + 1) + "o número: ");
                int value = sc.nextInt();

                vect[i] = value;
            }
            System.out.println("Numeros negativos do array:");
            for (int j : vect) {
                if (j < 0) System.out.println(j);
            }
        } else {
            System.out.println("Digite um número entre 1 e 10");
        }

        sc.close();
    }
}

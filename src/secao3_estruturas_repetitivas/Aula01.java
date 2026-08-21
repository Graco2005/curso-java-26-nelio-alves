package secao3_estruturas_repetitivas;
// Estrutura repetitiva enquanto (while)

import java.util.Locale;
import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num, soma_nums;
        num = 0;
        soma_nums = 0;

        while (true) {
            System.out.print("Digite um número inteiro: ");
            num = sc.nextInt();

            if (num == 0) break;

            soma_nums += num;
        }

        System.out.println("Soma dos números digitados: " + soma_nums);

        sc.close();
    }
}

package secao3_estruturas_repetitivas;
// Estrutura repetitiva para (for)
import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n_vezes, n, soma_dos_n; soma_dos_n = 0; n = 0;

        System.out.print("Digite a quantidade desejada de números: ");
        n_vezes = sc.nextInt();

        for (int i = 1; i <= n_vezes; i++) {
            System.out.print("Digite o " + i + "o número: ");
            n = sc.nextInt();

            soma_dos_n += n;
        }

        System.out.println("Soma dos valores digitados= " + soma_dos_n);
    }
}

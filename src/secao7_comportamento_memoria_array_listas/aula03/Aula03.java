package secao7_comportamento_memoria_array_listas.aula03;

import java.util.Locale;
import java.util.Scanner;

public class Aula03 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de quartos: ");
        int qtd_quartos = sc.nextInt();

        Quarto[] quartos = new Quarto[10];

        for (int i = 0; i < qtd_quartos; i++) {
            System.out.println("Quarto: " + (i + 1));

            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite o e-mail: ");
            String email = sc.nextLine();
            System.out.print("Digite a numeração do quarto: ");
            int numeracao = sc.nextInt();

            quartos[numeracao - 1] = new Quarto(nome, email, numeracao);
        }

        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println("Quartos ocupados:");
                System.out.println((i + 1) + ": " + quartos[i].getNome() + ", " + quartos[i].getEmail());
            }
        }
    }
}

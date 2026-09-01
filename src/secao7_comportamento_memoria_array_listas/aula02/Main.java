package secao7_comportamento_memoria_array_listas.aula02;
// Vetores e .length

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        int n = sc.nextInt();

        // Inicializando um vetor do tipo Produto
        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço(R$): ");
            double preco = sc.nextDouble();

            vect[i] = new Produto(nome, preco);
        }

        double soma = 0.0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPreco();
        }

        double media = soma / vect.length;

        System.out.printf("Média dos preços(R$): %.2f%n", media);

        sc.close();
    }
}

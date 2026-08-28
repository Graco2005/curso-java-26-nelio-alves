package secao5_introducao_poo.aula02;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto_1 = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto_1.nome = sc.nextLine();

        System.out.print("Digite o preço do produto (R$): ");
        produto_1.preco = sc.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        produto_1.quantidade = sc.nextInt();

        System.out.println();
        System.out.println(produto_1);

        int opcao, qtd;

        try {
            while (true) {
                System.out.println();
                System.out.println("[1]Adicionar item" + "\n[2]Remover item" + "\n[Qualquer]Sair");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.print("Quantos itens deseja adicionar: ");
                    qtd = sc.nextInt();

                    produto_1.adicionarProduto(qtd);
                    System.out.println();
                    System.out.println("Quantidade atual: " + produto_1.quantidade);
                    System.out.println("Valor do estoque(R$): " + produto_1.totalValorEstoque());
                } else if (opcao == 2) {
                    System.out.print("Quantos itens deseja remover: ");
                    qtd = sc.nextInt();

                    produto_1.removerProduto(qtd);
                    System.out.println();
                    System.out.println("Quantidade atual: " + produto_1.quantidade);
                    System.out.println("Valor do estoque(R$): " + produto_1.totalValorEstoque());
                } else break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }
}

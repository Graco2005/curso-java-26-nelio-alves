package secao6_construtores_this_sobrecarga_encapsulamento;
// Construtores, this, Sobrecarga e Encapsulamento em Java

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome; double preco; int quantidade;

        nome = sc.nextLine();
        preco = sc.nextDouble();

        Produto produto_1 = new Produto(nome, preco);

        produto_1.setNome("Computador");
        System.out.println("Nome atualizado: " + produto_1.getNome());
        produto_1.setPreco(5000);
        System.out.println("Novo preço: " + produto_1.getPreco());

        System.out.println();
        System.out.println(produto_1);

        int opcao, qtd;

        try {
            while (true) {
                System.out.println();
                System.out.println("""
                        [1]Adicionar item
                        [2]Remover item
                        [Qualquer]Sair""");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.print("Quantos itens deseja adicionar: ");
                    qtd = sc.nextInt();

                    produto_1.adicionarProduto(qtd);
                    System.out.println();
                    System.out.println("Quantidade atual: " + produto_1.getQuantidade());
                    System.out.println("Valor do estoque(R$): " + produto_1.totalValorEstoque());
                } else if (opcao == 2) {
                    System.out.print("Quantos itens deseja remover: ");
                    qtd = sc.nextInt();

                    produto_1.removerProduto(qtd);
                    System.out.println();
                    System.out.println("Quantidade atual: " + produto_1.getQuantidade());
                    System.out.println("Valor do estoque(R$): " + produto_1.totalValorEstoque());
                } else break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }
}

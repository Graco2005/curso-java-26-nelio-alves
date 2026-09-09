package secao7_comportamento_memoria_array_listas.exercicio04;

import java.util.Scanner;

public class Principal {
    static void main() {

        /**
         * Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int m = sc.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um número para a " + (i + 1) + "a linha e " + (j + 1) + "a coluna: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite agora um número que pertece a matriz: ");
        int x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Posição de " + x + ": linha " + (i + 1) + ", coluna " + (j + 1));

                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                }
            }
            
        }
        sc.close();
    }
}
